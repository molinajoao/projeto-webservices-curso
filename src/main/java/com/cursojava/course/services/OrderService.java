package com.cursojava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.course.entities.Order;
import com.cursojava.course.repositories.OrderReposity;

@Service
public class OrderService {

	@Autowired
	private OrderReposity repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {// recupera um Usuario por ID
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
