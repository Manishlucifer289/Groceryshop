package com.grocery.Repository;

import com.grocery.Entity.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryRepository extends JpaRepository<Grocery,Long> {
}
