package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.repo.IProductRepo;

@Service
public class ProductService {
	@Autowired
	private IProductRepo repo;
	
	
	public Product registerProduct(Product p) {
		return repo.save(p);
	}
}
