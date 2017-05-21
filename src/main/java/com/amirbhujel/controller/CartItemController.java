package com.amirbhujel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by amirbhujel on 5/21/17.
 */


@Controller
@RequestMapping("/cart")
public class CartItemController {

    @RequestMapping
    public String get (HttpServletRequest request) {
        return "redirect:/cart/"+request.getSession(true).getId();
    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public String getCart(@PathVariable ("cartId") String cartId, Model model){
        model.addAttribute("cartId", cartId);

        return "cart";
    }
}
