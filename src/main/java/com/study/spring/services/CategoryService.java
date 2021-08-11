package com.study.spring.services;

import com.study.spring.entities.Category;
import com.study.spring.entities.Order;
import com.study.spring.repositories.CategoryRepository;
import com.study.spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Integer id) {
        Optional<Category> obj =  repository.findById(id);
        return obj.get();
    }

}
