package com.gb.demoone.Controller;

import com.gb.demoone.Model.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final List<Products> products;

    public ProductController(List<Products> products) {
        this.products = products;
    }

    @GetMapping
    public List<Products> getProducts() {
        return products;
    }

//    public ProductController() {
//        products = new ArrayList<>();
//        products.add(new Products("1", "Iphone 12", "New", 1000, "Apple"));
//        products.add(new Products("2", "Iphone 13", "New", 1200, "Apple"));
//        products.add(new Products("3", "Iphone 14", "New", 1500, "Apple"));
//        products.add(new Products("4", "Iphone 15", "New", 2000, "Apple"));
//        products.add(new Products("5", "Samsung S24", "New", 2500, "Apple"));
//        products.add(new Products("6", "Samsung S25", "New", 3000, "Apple"));
//
//    }
}
