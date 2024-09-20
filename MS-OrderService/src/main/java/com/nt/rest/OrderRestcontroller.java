package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Order;
import com.nt.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderRestcontroller {
	@Autowired
	private OrderService ser;
	
	@PostMapping("/book")
	public ResponseEntity<?> registerProduct(@RequestBody Order p){
		String prod = ser.registerProduct(p);
		return new ResponseEntity<String>(prod,HttpStatus.OK);
	}
}
