package com.FreeCodeCamp.DreamShop.Service.Product;

import com.FreeCodeCamp.DreamShop.Entity.Product;
import com.FreeCodeCamp.DreamShop.Request.AddProductRequest;
import com.FreeCodeCamp.DreamShop.Request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addproduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
