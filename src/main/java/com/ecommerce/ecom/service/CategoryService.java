package com.ecommerce.ecom.service;

import com.ecommerce.ecom.dto.CategoryDTO;
import com.ecommerce.ecom.dto.CategoryResponse;
import com.ecommerce.ecom.model.Category;

import java.util.List;

public interface CategoryService {

    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory(Long categoryId);
    CategoryDTO updateCategory(CategoryDTO category, Long categoryId);

}
