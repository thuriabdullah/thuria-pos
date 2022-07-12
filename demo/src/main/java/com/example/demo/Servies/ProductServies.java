 package com.example.demo.Servies;

 import com.example.demo.Entity.ProductEntity;
 import com.example.demo.Repository.ProductRepository;
 import org.springframework.stereotype.Service;

 import java.util.List;


 @Service
public class ProductServies {

private ProductRepository productRepository;

    public List<ProductEntity> getAllProduct() {
        return this.productRepository.findAll();
    }

    public ProductEntity addProduct(ProductEntity product) {

        System.out.println(product);

        return  this.productRepository.save(product);

    }
}
