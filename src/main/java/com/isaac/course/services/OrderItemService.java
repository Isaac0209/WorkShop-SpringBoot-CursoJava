package com.isaac.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.isaac.course.entities.OrderItem;
import com.isaac.course.repositories.OrderItemRepository;

public class OrderItemService {

	@Autowired
	private OrderItemRepository repository;
	
	public List<OrderItem> findAll(){
		return repository.findAll();
	}

}
