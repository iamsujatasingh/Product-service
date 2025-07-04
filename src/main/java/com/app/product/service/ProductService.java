package com.app.product.service;

import com.app.product.dao.ProductDao;
import com.app.product.dto.ProductDTO;
import com.app.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public ProductDTO getProductById(Integer id) {
       Product newProduct =  productDao.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        return convertToDTO(newProduct);
    }

    public ProductDTO createProduct(Product product) {
        Product newProduct =  productDao.save(product);
        return convertToDTO(newProduct);

    }

    private ProductDTO convertToDTO(Product p) {
        return new ProductDTO(p.getId(), p.getName(), p.getDescription());
    }

    public List<Product> createProducts(List<Product> products) {
        return productDao.saveAll(products); // assuming you're using Spring Data JPA
    }

    public boolean existsByCode(String code) {
        return productDao.existsById(Integer.valueOf(code));
    }
}
