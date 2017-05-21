package com.amirbhujel.dao;

import com.amirbhujel.model.Cart;

/**
 * Created by amirbhujel on 5/21/17.
 */
public interface CartDao {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);
}
