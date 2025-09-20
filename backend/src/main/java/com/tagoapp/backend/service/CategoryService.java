package com.tagoapp.backend.service;

import org.springframework.stereotype.Service;

import com.tagoapp.backend.entity.Category;
import com.tagoapp.backend.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
