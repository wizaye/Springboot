package com.wizaye.SpringApp.controller;
import com.wizaye.SpringApp.model.Product;
import com.wizaye.SpringApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    //Handles the routing, shouldn't write any business logic over here

    @Autowired
    ProductService productService;

    //Get Operations
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    //Post Operation
    @PostMapping("/addproduct")
    public void addProduct(@RequestBody Product p){
        productService.addProduct(p);
        // to display the updated content;
        //return getProducts();
    }

    //Update Operation
    @PutMapping("/updateproduct")
    public void updateProduct(@RequestBody Product p){
        productService.updateProduct(p);
    }

    //Delete Operation
    @DeleteMapping("/deleteproduct/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProductById(prodId);
    }

}
