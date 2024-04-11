package com.gb.demoone.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    private String id;
    private String name;
    private String description;
    private int price;
    private String brand;
}


