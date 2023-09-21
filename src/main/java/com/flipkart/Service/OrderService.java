package com.flipkart.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.dao.OrderDao;
import com.flipkart.entity.OrderEnity;

@Service
public class OrderService {
@Autowired
OrderDao od;
	public String setOrder(OrderEnity o) {
		
		return od.setOrder(o);
	}
	public String setOrder(List<OrderEnity> o) {
		return od.setOrder(o);
	}
	public List<String> getcityPn() {
		
		return od.getcityPn();
	}

}
