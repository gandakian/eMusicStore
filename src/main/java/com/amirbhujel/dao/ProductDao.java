package com.amirbhujel.dao;

import com.amirbhujel.model.Product;

import java.util.List;

/**
 * Created by amirbhujel on 5/3/17.
 */
public interface ProductDao {

    void addProduct(Product product);
    Product getProductById(String id);
    List<Product> getAllProducts();
    void deleteProduct(String id);

}
