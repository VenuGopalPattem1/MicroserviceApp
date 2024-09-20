package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Product;
import com.nt.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductRestcontroller {
	@Autowired
	private ProductService ser;
	
	@PostMapping("/register")
	public ResponseEntity<Product> registerProduct(@RequestBody Product p){
		Product prod = ser.registerProduct(p);
		return new ResponseEntity<Product>(prod,HttpStatus.OK);
	}
}
