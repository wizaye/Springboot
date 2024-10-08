package com.wizaye.ecommerce.service;
import com.wizaye.ecommerce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.wizaye.ecommerce.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Component
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getProducts() {
        return productRepo.findAll();
    }
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

    public Product addProduct(Product p, MultipartFile file) throws IOException {
        p.setImageName(file.getOriginalFilename());
        p.setImageType(file.getContentType());
        p.setImageDate(file.getBytes());
        return productRepo.save(p);
    }

    public Product updateProduct(int prodId, Product product, MultipartFile imageFile) throws IOException {
        Product p=getProductById(prodId);
        if(p!=null){
            product.setImageName(imageFile.getOriginalFilename());
            product.setImageType(imageFile.getContentType());
            product.setImageDate(imageFile.getBytes());
            return productRepo.save(product);
        }else {
            return null;
        }

    }
    public void deleteProduct(int prodId) {
        productRepo.deleteById(prodId);
    }

    public List<Product> searchProducts(String keyword) {
        return productRepo.searchProducts(keyword);
    }
}
