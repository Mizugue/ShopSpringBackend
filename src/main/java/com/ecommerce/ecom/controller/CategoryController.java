package com.ecommerce.ecom.controller;

import com.ecommerce.ecom.model.Category;
import com.ecommerce.ecom.service.CategoryService;
import jakarta.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.lang.annotation.Repeatable;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {


    private CategoryService categoryService;


    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "/public/categories" , method = RequestMethod.GET)
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryService.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @RequestMapping(value = "/public/categories", method = RequestMethod.POST)
    private ResponseEntity<String> createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return new ResponseEntity<>("Category added successfuly", HttpStatus.OK);

    }

    @RequestMapping(value = "/admin/categories/{categoryId}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId) {
        try {
            String status = categoryService.deleteCategory(categoryId);
            return ResponseEntity.status(HttpStatus.OK).body(status);
        } catch (ResponseStatusException e) {
            return new ResponseEntity<>(e.getReason(), e.getStatusCode());
        }
    }

    @RequestMapping(value = "/public/categories/{categoryId}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateCategory (@RequestBody Category category, @PathVariable Long categoryId){
        try{
            Category savedCategory = categoryService.updateCategory(category, categoryId);
            return new ResponseEntity<>("Category with id: " + categoryId + " updated", HttpStatus.OK);
        }catch (ResponseStatusException e){
            return new ResponseEntity<>(e.getReason(), e.getStatusCode());
        }
    }
}




