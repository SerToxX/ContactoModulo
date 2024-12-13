package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entidades.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}