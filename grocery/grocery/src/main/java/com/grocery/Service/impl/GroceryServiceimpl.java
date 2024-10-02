package com.grocery.Service.impl;


import com.grocery.Entity.Grocery;
import com.grocery.Payload.Grocerydto;
import com.grocery.Repository.GroceryRepository;
import com.grocery.Service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryServiceimpl implements GroceryService {

    @Autowired
    private GroceryRepository groceryRepository;
    @Override
    public Grocerydto creategrocery(Grocerydto grocerydto) {
        Grocery grocery = maptoEntity(grocerydto);
        Grocery saved = groceryRepository.save(grocery);
        Grocerydto dto = maptodto(saved);
        return dto;
    }
    Grocery maptoEntity (Grocerydto grocerydto){
        Grocery grocery = new Grocery();
     grocery.setProduct(grocerydto.getProduct());
     grocery.setBrand(grocery.getBrand());
     grocery.setCatagory(grocery.getCatagory());
     grocery.setPrice(grocery.getPrice());
     return grocery;
    }
    Grocerydto maptodto(Grocery grocery){
        Grocerydto dto = new Grocerydto();
        dto.setProduct(grocery.getProduct());
        dto.setBrand(grocery.getBrand());
        dto.setCatagory(grocery.getCatagory());
        dto.setPrice(grocery.getPrice());
        return dto;

    }
}
