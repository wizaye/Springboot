package com.wizaye.ecommerce.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.wizaye.ecommerce.service.ProductService;
import com.wizaye.ecommerce.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
// To Enable Cross-Origin-Resource-Sharing (CORS) for Client-Server Architecture.
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String welcome(){
        return "Welcome to Ecommerce!";
    }
    // To Send the data along with response code we can use the response entity
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }
    @GetMapping("/product/{prodId}")
    public ResponseEntity<Product> getProduct(@PathVariable int prodId){
        return new ResponseEntity<>(productService.getProductById(prodId),HttpStatus.OK);
    }
    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        try {
            Product p1 = productService.addProduct(product, imageFile);
            return new ResponseEntity<>(p1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/product/{id}/image")
    public ResponseEntity<byte[]> getImageByProductId(@PathVariable int id){
        Product p=productService.getProductById(id);
        byte[] imageFile=p.getImageDate();
        return ResponseEntity.ok().contentType(MediaType.valueOf(p.getImageType())).body(imageFile);
    }
    @PutMapping("/product/{prodId}")
    public ResponseEntity<?> updateProduct(@PathVariable int prodId, @RequestPart Product product, @RequestPart MultipartFile imageFile) {
        Product p1=null;
        try{
            p1=productService.updateProduct(prodId,product,imageFile);

        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(p1!=null){
            return new ResponseEntity<>(p1, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @DeleteMapping("/product/{prodId}")
    public ResponseEntity<String> deleteProduct(@PathVariable int prodId) {
        Product p=productService.getProductById(prodId);
        if(p!=null){
            productService.deleteProduct(prodId);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Product Not Found", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/product/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword){
        List<Product> products=productService.searchProducts(keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
