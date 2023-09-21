package com.flipkart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flipkart.entity.OrderEnity;

public interface OrderRepository extends JpaRepository<OrderEnity, Integer>{
	@Query(value="select productname,city from order_details inner join  product_details on order_details.orderid=product_details.order_fkey",nativeQuery=true)
	List<String> getcityPn();
	

}
