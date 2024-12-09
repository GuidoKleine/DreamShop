package com.FreeCodeCamp.DreamShop.Request;

import com.FreeCodeCamp.DreamShop.Entity.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private String name;
    private String brand;
    private Long id;
    private String description;
    private BigDecimal price;
    private int quantity;
    private Category category;
}
