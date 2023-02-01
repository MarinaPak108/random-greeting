package com.randomgreeting.service;

import com.randomgreeting.entity.CategoryEntity;
import com.randomgreeting.repo.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepo repo;

    public CategoryService(CategoryRepo repo) {
        this.repo = repo;
    }

    public List<CategoryEntity> showCategories (){
       return repo.findAll();
    }
}
