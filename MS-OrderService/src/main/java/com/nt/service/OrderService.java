package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.client.ClientConfig;
import com.nt.entity.Order;
import com.nt.repo.IOrderRepo;

@Service
public class OrderService {
	@Autowired
	private IOrderRepo repo;
	@Autowired
	private ClientConfig client;
	
	public String registerProduct(Order p) {
		 if(client.checkOrders(p.getOrdername(), p.getQuantity())) {
			 repo.save(p);
			 return "Order is placed With id value "+p.getOrderId();
		 }
		 return "The Item atr out of stock";
	}
}
