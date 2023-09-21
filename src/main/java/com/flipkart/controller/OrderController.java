package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.Service.OrderService;
import com.flipkart.entity.OrderEnity;
@RestController
@RequestMapping(value="/Or")
public class OrderController {
	@Autowired
	OrderService os;
	@PostMapping(value="/setOrder")
	public String setOrder(@RequestBody OrderEnity o) {
		return os.setOrder(o);
	}
	@PostMapping(value="/setAllOrder")
	public String setAllOrder(@RequestBody List<OrderEnity> o) {
		return os.setOrder(o);
	}
	@GetMapping(value="/getcPn")
	public List<String>getcityPn(){
		return os.getcityPn();
		
	}
	

}
