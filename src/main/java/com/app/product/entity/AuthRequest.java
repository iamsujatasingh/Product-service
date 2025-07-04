package com.app.product.entity;

import lombok.Data;

// DTO for login input
@Data
public class AuthRequest {
    private String username;
    private String password;
}

