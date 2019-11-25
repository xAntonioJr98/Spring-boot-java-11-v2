package com.antonio.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonio.course.entities.Order;
import com.antonio.course.repositories1.OrderRepository;

@Service
public class OrderServices {
	
	@Autowired	
	private OrderRepository repository;
		
	public List<Order> findALL(){
			return repository.findAll();
		}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
		
	}
}

