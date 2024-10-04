package com.wizaye.SpringApp.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.wizaye.SpringApp.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    // handles the business logic
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Samsung Galaxy",40000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int id){
        //stream api for faster fetching of records 
        return products.stream().filter(p->p.getProdId()==id).findFirst().get();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public void updateProduct(Product p){
        Product curr_prod= products.stream().filter(prod->prod.getProdId()==p.getProdId()).findFirst().get();
        curr_prod.setProdName(p.getProdName());
        curr_prod.setPrice(p.getPrice());
    }
    
    public void deleteProductById(int id){
        Product curr_prod=products.stream().filter(p->p.getProdId()==id).findFirst().get();
        products.remove(curr_prod);
    }
}
