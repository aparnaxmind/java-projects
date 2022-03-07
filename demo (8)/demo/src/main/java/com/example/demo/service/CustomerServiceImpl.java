package com.example.demo.service;

import com.example.demo.domain.Customer;
import com.example.demo.domain.Role;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.repo.RoleRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class CustomerServiceImpl implements CustomerService, UserDetailsService {
    private  final CustomerRepo customerRepo;
    private final RoleRepo roleRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer= customerRepo.findByUsername(username);
        if (customer==null){
            log.error("User not found inthe database");
        }
        else {
            log.error("User found in the database");
        }
        Collection<SimpleGrantedAuthority> authorities=new ArrayList<>();
        customer.getRoles().forEach(role -> { authorities.add(new SimpleGrantedAuthority(role.getName()));});
        return new org.springframework.security.core.userdetails.User(customer.getUsername(),customer.getPassword(),authorities);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        log.info("saving new customer {} to the database",customer.getName());
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        return customerRepo.save(customer);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("saving new role {} to the database", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToCustomer(String username, String roleName) {
        log.info("adding new role {} to  customer {}", roleName,username);
        Customer customer= customerRepo.findByUsername(username);
        Role role=roleRepo.findByname(roleName);
        customer.getRoles().add(role);
    }

    @Override
    public Customer getCustomer(String username) {
        log.info("fetching customer {}",username);
        return customerRepo.findByUsername(username);
    }

    @Override
    public List<Customer> getCustomers() {
        log.info("fetching customers ");
        return customerRepo.findAll();
    }


}
