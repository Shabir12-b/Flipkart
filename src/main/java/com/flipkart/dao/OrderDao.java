package com.flipkart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.OrderEnity;
import com.flipkart.repository.OrderRepository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository or;

	public String setOrder(OrderEnity o) {
		
		 or.save(o);
		 return "SAVED";
	}

	public String setOrder(List<OrderEnity> o) {
		or.saveAll(o);
		return "POSTED";
	}

	public List<String> getcityPn() {
		
		return or.getcityPn();
	}

}
