package com.amirbhujel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by amirbhujel on 5/20/17.
 */


@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout,
                        Model model) {

        if(error != null){
            model.addAttribute("error", "Invalid username and password");
        }

        if(logout != null){
            model.addAttribute("msg", "You have been logged out successfully");
        }

        return "login";
    }
}
