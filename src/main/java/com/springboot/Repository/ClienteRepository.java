package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}