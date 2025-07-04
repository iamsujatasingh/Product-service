package com.app.product.controller;

import com.app.product.dto.ProductDTO;
import com.app.product.entity.Product;
import com.app.product.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/product")
public class ProductAppController {

    @Autowired
    ProductService productService;

    public ProductAppController(ProductService productService) {
        this.productService = productService;
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/get/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") Integer id){
        ProductDTO product = productService
                                    .getProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/validate-list")
    public ResponseEntity<Map<String, Boolean>> validateProductCodes(@RequestBody List<String> productCodes) {
        Map<String, Boolean> result = new HashMap<>();

        for (String code : productCodes) {
            boolean exists = productService.existsByCode(code);
            result.put(code, exists);
        }

        return ResponseEntity.ok(result);
    }



    @PostMapping("/create")
    public ResponseEntity<ProductDTO> createProduct(@Valid @RequestBody Product product){
        ProductDTO newProduct = productService.createProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.OK);
    }

    @PostMapping("/createAll")
    public ResponseEntity<List<Product>> createAllProducts(@Valid @RequestBody List<Product> products) {
        List<Product> newProducts = productService.createProducts(products);
        return new ResponseEntity<>(newProducts, HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('PRICING')")
    @GetMapping("/hello")
    public ResponseEntity<String> test(){
       return new ResponseEntity<>("Helloo testing", HttpStatus.OK);

    }

    @GetMapping("/test")
    public ResponseEntity<String> testHello(){
        return new ResponseEntity<>("Test test testing", HttpStatus.OK);

    }

}
