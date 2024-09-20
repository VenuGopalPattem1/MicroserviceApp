package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
