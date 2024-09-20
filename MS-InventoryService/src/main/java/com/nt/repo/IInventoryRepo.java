package com.nt.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Inventory;

public interface IInventoryRepo extends JpaRepository<Inventory, Integer> {
	@Query(" from Inventory where productName=?1 and quantity>=?2")
	public Optional<Inventory> findByFilters(String name,Integer quantity);
}
