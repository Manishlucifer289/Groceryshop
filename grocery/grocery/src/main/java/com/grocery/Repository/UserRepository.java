package com.grocery.Repository;

import com.grocery.Entity.Grocery;
import com.grocery.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User>findByUsername(String username);

}
