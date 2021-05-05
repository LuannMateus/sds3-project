package com.luanmateus.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanmateus.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
