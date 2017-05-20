package com.amirbhujel.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;

/**
 * Created by amirbhujel on 5/1/17.
 */

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;

    @NotEmpty(message = "The Product name must not be empty !!!")
    private String productName;
    private String productCategory;
    private String productDescription;

    @Min(value=0, message = "The Product price must not be less than 0 !!!")
    private double productPrice;
    private String productCondition;
    private String productStatus;

    @Min(value=0, message = "The Product unit must not be less than 0 !!!")
    private int unitInStock;
    private String productManufacturer;

    @Transient
    private MultipartFile productImage;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) { this.productManufacturer = productManufacturer; }

    public MultipartFile getProductImage() { return productImage; }

    public void setProductImage(MultipartFile productImage) { this.productImage = productImage; }
}
