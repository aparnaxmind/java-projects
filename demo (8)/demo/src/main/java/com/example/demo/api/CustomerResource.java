package com.example.demo.api;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.demo.domain.Customer;
import com.example.demo.domain.Role;
import com.example.demo.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController @RequiredArgsConstructor @RequestMapping("/api")
public class CustomerResource {
    private final CustomerService customerservice;

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getcustomer() {
        return ResponseEntity.ok().body(customerservice.getCustomers());
    }

    @PostMapping("/customer/save")
    public ResponseEntity<Customer> savecustomer(@RequestBody Customer customer) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/customer/save").toUriString());
        return ResponseEntity.created(uri).body(customerservice.saveCustomer(customer));
    }

    @PostMapping("/role/save")
    public ResponseEntity<Role> saverole(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
        return ResponseEntity.created(uri).body(customerservice.saveRole(role));
    }

    @PostMapping("/role/addtocustomer")
    public ResponseEntity<Role> addRoleToCustomer(@RequestBody RoleToUserFrom form) {
        customerservice.addRoleToCustomer(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }
    @GetMapping("/role/addtocustomer")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String authoririzationHeader = request.getHeader(AUTHORIZATION);
        if (authoririzationHeader != null && authoririzationHeader.startsWith("Bearer")){
            try{
                String refresh_token = authoririzationHeader.substring("Bearer ".length());
                Algorithm algorithm =Algorithm.HMAC256("secret".getBytes());
                JWTVerifier verifier = JWT.require(algorithm).build();
                DecodedJWT decodedJWT =verifier.verify(refresh_token);
                String username =decodedJWT.getSubject();
                Customer customer = (Customer) customerservice.getCustomer(username);
                String access_token= JWT.create()
                        .withSubject(customer.getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis() +10*60*1000))
                        .withIssuer(request.getRequestURI().toString())
                        .withClaim("roles",customer.getRoles().stream().map(Role::getName).collect(Collectors.toList()))
                        .sign(algorithm);

                //response.setHeader("access_token",access_token);
                //response.setHeader("refresh_token",access_token);
                Map<String,String> tokens = new HashMap<>();
                tokens.put("access_token",access_token);
                tokens.put("refresh_token",refresh_token);
                response.setContentType(APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(),tokens);
            }
            catch (Exception exception){

                response.setHeader("error",exception.getMessage());
                response.setStatus(FORBIDDEN.value());
                // response.sendError(FORBIDDEN.value());
                Map<String,String> error = new HashMap<>();
                error.put("error_message",exception.getMessage());
                response.setContentType(APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(),error);
            }

        }else {
            throw new RuntimeException("Refresh token is missing");
        }
    }

    }
    @Data
    class RoleToUserFrom{
        private String username;
        private String roleName;
    }

