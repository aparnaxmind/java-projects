package com.example.demo.service;

import com.example.demo.domain.Customer;
import com.example.demo.domain.Role;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Role saveRole(Role role);
    void addRoleToCustomer(String username,String roleName);
    Customer getCustomer(String username);
    List<Customer>getCustomers();

}
