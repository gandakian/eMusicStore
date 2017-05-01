package com.amirbhujel.controller;

import com.amirbhujel.dao.ProductDao;
import com.amirbhujel.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by amirbhujel on 4/28/17.
 */


@Controller
public class HomeController {

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/productList")
    public String getProductList(Model model){

        List<Product> productList = productDao.getProductList();
        Product product = productList.get(0);

        model.addAttribute(product);  //model is automatically attached to the view

        return "productList";
    }
}
