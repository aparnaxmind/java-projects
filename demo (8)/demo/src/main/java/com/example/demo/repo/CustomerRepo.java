package com.example.demo.repo;

import com.example.demo.domain.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
    Customer findByUsername(String username);
}
