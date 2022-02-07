package com.erman.crud.crud.services;

import com.erman.crud.crud.models.Product;
import com.erman.crud.crud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return   repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        return   repository.saveAll(products);
    }
    public List<Product> getAllProducts(){
        return repository.findAll();
    }
    public Product getAllProductById(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getAllProductByName(String name){
        return repository.findByName(name).orElse(null);
    }
    public String deleteProduct(int id){
         repository.deleteById(id);
         return "Product delete || "+id;
    }
    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());

        return repository.save(existingProduct);
    }
}
