package com.ecommerce.ecom.service;

import com.ecommerce.ecom.dto.CartDTO;

import java.util.List;
import jakarta.transaction.Transactional;


public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
    List<CartDTO> getAllCarts();
    CartDTO getCart(String emailId, Long cartId);
    CartDTO updateProductQuantityInCart(Long productId, Integer quantity);
    String deleteProductFromCart(Long cartId, Long productId);
}