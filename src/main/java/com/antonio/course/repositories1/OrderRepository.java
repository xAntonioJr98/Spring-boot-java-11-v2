package com.antonio.course.repositories1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antonio.course.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long>{

}
