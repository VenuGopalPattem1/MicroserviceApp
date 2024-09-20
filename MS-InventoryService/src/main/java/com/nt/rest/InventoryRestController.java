package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Inventory;
import com.nt.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryRestController {
	@Autowired
	private InventoryService ser;
	
	@PostMapping("/add")
	public ResponseEntity<?> saveItems(@RequestBody Inventory i){
		Inventory in = ser.saveItems(i);
		return new ResponseEntity<Inventory>(in,HttpStatus.OK);
	}
	
	@GetMapping("/check/{name}/{quantity}")
	public ResponseEntity<?> getMethodName(@PathVariable String name,@PathVariable Integer quantity) {
		boolean b = ser.checkOrders(name, quantity);
		return new ResponseEntity<Boolean>(b,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> findAllinventory(){
		List<Inventory> items = ser.findAll();
		return new ResponseEntity<List<Inventory>>(items,HttpStatus.OK);
	}
	
}
