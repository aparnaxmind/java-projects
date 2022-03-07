package com.example.demo.repo;

import com.example.demo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
        Role findByname(String name);
}
