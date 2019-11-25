package com.antonio.course.config1;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.antonio.course.entities.Order;
import com.antonio.course.entities.User;
import com.antonio.course.entities.enums.OrderStatus;
import com.antonio.course.repositories1.OrderRepository;
import com.antonio.course.repositories1.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		// construtor com argumentos de teste
		User u1 = new User(0, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(0, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(0, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAGO, u1);
		Order o2 = new Order(0, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.CANCELADO, u2);
		Order o3 = new Order(0, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.ENTREGUE, u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
