package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Inventory;
import com.nt.repo.IInventoryRepo;

@Service
public class InventoryService {
	@Autowired
	private IInventoryRepo repo;
	
	public Inventory saveItems(Inventory i) {
		return repo.save(i);
	}
	
	public boolean checkOrders(String name,Integer quantity) {
		Optional<Inventory> item = repo.findByFilters(name, quantity);
		if(item.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public List<Inventory> findAll(){
		return repo.findAll();
	}
}
