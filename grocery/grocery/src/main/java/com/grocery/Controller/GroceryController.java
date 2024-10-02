package com.grocery.Controller;

import com.grocery.Payload.Grocerydto;
import com.grocery.Service.GroceryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/grocery")
public class GroceryController {

    private GroceryService groceryService;

    public GroceryController(GroceryService groceryService) {

        this.groceryService = groceryService;
    }
    @PostMapping("/create")
    public ResponseEntity<String>creategrocery(@RequestBody Grocerydto grocerydto){
        Grocerydto creategrocery = groceryService.creategrocery(grocerydto);
        return new ResponseEntity<>("your product is saved", HttpStatus.CREATED);
    }
}
