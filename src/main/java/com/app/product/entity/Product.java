package com.app.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    private int id;
    @NotBlank(message = "Product name must not be empty")
    private String name;
    @Size(max = 100, message = "Description must be at most 100 characters")
    private String description;
    @Positive(message = "Price must be a positive value")
    private double price;

}
