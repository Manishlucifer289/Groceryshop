package com.grocery.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "grocery")
@NoArgsConstructor
@AllArgsConstructor
public class Grocery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String product;
    public String brand;
    public String catagory;
    public int price;
}
