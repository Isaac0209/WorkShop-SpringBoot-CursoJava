package com.isaac.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaac.course.entities.Order;
import com.isaac.course.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository reposity;
	
	public List<Order> findAll(){
		return reposity.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> obj = reposity.findById(id);
		return obj.get();
	}
}
