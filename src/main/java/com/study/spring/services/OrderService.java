package com.study.spring.services;

import com.study.spring.entities.Order;
import com.study.spring.entities.User;
import com.study.spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Integer id) {
        Optional<Order> obj =  repository.findById(id);
        return obj.get();
    }

}
