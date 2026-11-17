package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ComplaintCategoryRepository;
import com.model.ComplaintCategory;

@Service
public class ComplaintCategoryService {

    @Autowired
    private ComplaintCategoryRepository repository;

    public ComplaintCategory addCategory(ComplaintCategory category) {

        return repository.save(category);
    }

    public List<ComplaintCategory> getAllCategories() {

        return repository.findAll();
    }
    
}
