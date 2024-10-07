package com.example.springboot_jpa_demo.Repository;

import com.example.springboot_jpa_demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {
}
