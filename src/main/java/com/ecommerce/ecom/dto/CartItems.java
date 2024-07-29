package com.ecommerce.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItems {
    private Long cartItemId;
    private CartDTO cart;
    private ProductDTO productDTO;
    private Integer quantity;
    private Double discount;
    private Double productPrice;
}
