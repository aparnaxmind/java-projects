package com.example.demo;

import com.example.demo.domain.Customer;
import com.example.demo.domain.Role;
import com.example.demo.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//System.out.println(args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
			CommandLineRunner run (CustomerService customerService){
		return args ->{
			customerService.saveRole(new Role(null,"ROLE_USER"));
			customerService.saveRole(new Role(null,"ROLE_MANAGER"));
			customerService.saveRole(new Role(null,"ROLE_ADMIN"));
			customerService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			customerService.saveCustomer(new Customer(null,"John Travolte","Jhon","1234",new ArrayList<>()));
			customerService.saveCustomer(new Customer(null,"will smith","will","1234",new ArrayList<>()));
			customerService.saveCustomer(new Customer(null,"Jim carry","jim","1234",new ArrayList<>()));
			customerService.saveCustomer(new Customer(null,"arnold schwarzenegger","arnold","1234",new ArrayList<>()));

			customerService.addRoleToCustomer("Jhon","ROLE_USER");
			customerService.addRoleToCustomer("Jhon","ROLE_MANAGER");
			customerService.addRoleToCustomer("will","ROLE_MANAGER");
			customerService.addRoleToCustomer("jim","ROLE_ADMIN");
			customerService.addRoleToCustomer("arnold","ROLE_SUPER_ADMIN");
			customerService.addRoleToCustomer("arnold","ROLE_ADMIN");
			customerService.addRoleToCustomer("arnold","ROLE_USER");


		};
	}

}
