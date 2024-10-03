package com.wizaye.SpringApp.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.wizaye.SpringApp.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    // handles the business logic

    List<Product> product= new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Samsung Galaxy",40000)));

    public List<Product> getProducts(){
        return product;
    }
    public Product getProductById(int id){
        //stream api
        return product.stream().filter(p->p.getProdId()==id).findFirst().get();
    }
    public void addProduct(Product p){
        product.add(p);
    }
}
