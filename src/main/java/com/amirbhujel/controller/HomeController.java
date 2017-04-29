package com.amirbhujel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by amirbhujel on 4/28/17.
 */


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
