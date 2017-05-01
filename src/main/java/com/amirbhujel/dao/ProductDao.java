package com.amirbhujel.dao;

import com.amirbhujel.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amirbhujel on 5/1/17.
 */
public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1 = new Product();

        product1.setProductName("Guitar1");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a Fender guitar.");
        product1.setProductPrice(200.00);
        product1.setProductCondition("New");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender");

        productList = new ArrayList<Product>();
        productList.add(product1);

        return productList;
    }
}
