package com.wizaye.SpringApp.service;
import java.util.List;
import com.wizaye.SpringApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wizaye.SpringApp.repository.ProductRepo;

@Service
public class ProductService {
    //Repo Object;
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }
    public Product getProductById(int id){
          return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product p){
        repo.save(p);
    }
    public void updateProduct(Product p){
        repo.save(p);
    }
    public void deleteProductById(int id){
        repo.deleteById(id);
    }
}
