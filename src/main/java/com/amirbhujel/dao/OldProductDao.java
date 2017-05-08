package com.amirbhujel.dao;

import com.amirbhujel.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amirbhujel on 5/1/17.
 */
public class OldProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){

        Product product1 = new Product();
        product1.setProductId("P111");
        product1.setProductName("Guitar");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a Fender guitar.");
        product1.setProductPrice(200.00);
        product1.setProductCondition("New");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender");

        Product product2 = new Product();
        product2.setProductId("P222");
        product2.setProductName("Album");
        product2.setProductCategory("Record");
        product2.setProductDescription("This is a awesome mix of 20th Century");
        product2.setProductPrice(15.00);
        product2.setProductCondition("New");
        product2.setProductStatus("Active");
        product2.setUnitInStock(43);
        product2.setProductManufacturer("EMI");

        Product product3 = new Product();
        product3.setProductId("P333");
        product3.setProductName("Speaker");
        product3.setProductCategory("Accessories");
        product3.setProductDescription("This is a Polk Shelf Speaker.");
        product3.setProductPrice(355);
        product3.setProductCondition("Old");
        product3.setProductStatus("Nearly Out of Stock");
        product3.setUnitInStock(9);
        product3.setProductManufacturer("Polk");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

    public Product getProductById(String productId) throws IOException{

        for (Product product: productList){
            if (product.getProductId().equals(productId)){
                return product;
            }
        }

        throw new IOException("No Product Found !!!");
    }
}
