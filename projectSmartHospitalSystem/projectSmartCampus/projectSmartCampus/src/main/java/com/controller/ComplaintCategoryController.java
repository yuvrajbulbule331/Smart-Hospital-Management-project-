package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.ComplaintCategory;
import com.service.ComplaintCategoryService;

@RestController
@RequestMapping("/categories")
public class ComplaintCategoryController {

    @Autowired
    private ComplaintCategoryService service;

    @PostMapping
    public ComplaintCategory addCategory(@RequestBody ComplaintCategory category) {

        return service.addCategory(category);
    }

    @GetMapping
    public List<ComplaintCategory> getCategories() {

        return service.getAllCategories();
    }
}