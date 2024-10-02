package com.grocery.Payload;

import lombok.Data;

@Data
public class Grocerydto {
    public long id;
    public String product;
    public String brand;
    public String catagory;
    public int price;
}
