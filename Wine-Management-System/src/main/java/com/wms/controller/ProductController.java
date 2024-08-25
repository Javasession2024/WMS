package com.wms.controller;

import com.wms.entity.ProductEntity;
import com.wms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public void saveProductDetails(@RequestBody ProductEntity product){

        // Add try/catch block when needed....

              productService.saveProduct(product);
    }

    @GetMapping("/listProduct")
    public List<ProductEntity> getProductList(){

        //
       return productService.getProductList();
    }

    @GetMapping("/product/{id}")
    public Optional<ProductEntity> getProductDetails(@PathVariable int id){

        /// Need to implement logic when product is not avaliable with proper massage.
        return productService.getDetails(id);
    }

   @DeleteMapping("/deleteProduct/{id}")
    public RequestEntity<ProductEntity> saveProductDetails(@PathVariable int id) throws Exception {

        // Add try/catch block when needed....
       // Hanndle unavaliable id and give them proper validation massage.
//
//        try{
//            productService.deleteProduct(id);
//            throw  new Exception("");
//        }catch (Exception e){
//             e.printStackTrace();
//             throw new Exception();
//        }
      // return             productService.deleteProduct(id);
       ; //new ResponseEntity<>(HttpStatus.ACCEPTED,"");
    }

}
