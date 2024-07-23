package com.ecommerce.ecom.service;

import com.ecommerce.ecom.dto.ProductDTO;
import com.ecommerce.ecom.dto.ProductResponse;
import com.ecommerce.ecom.model.Product;
import org.springframework.data.domain.Sort;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ProductService {

    //ProductResponse getAllProducts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    ProductResponse getAllProducts();
    ProductDTO createProduct(Long categoryId, ProductDTO productDTO);
    ProductDTO deleteProduct(Long productId);
    ProductDTO updateProduct(Long productId, ProductDTO productDTO);
    ProductResponse searchByCategory(Long categoryId);
    ProductResponse searchProductByKeyword(String keyword);
    ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;
}
