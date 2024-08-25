package com.wms.service;

import com.wms.entity.ProductEntity;
import com.wms.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public void saveProduct(ProductEntity product) {
       // Bussiness logic
                repo.save(product);

    }

    public List<ProductEntity> getProductList() {

       return repo.findAll();
    }

    public Optional<ProductEntity> getDetails(int id) {
        return repo.findById(id);
    }

    public void deleteProduct(int id) {

        // Need to implement optional class with try catch block
        repo.deleteById(id);
    }
}
