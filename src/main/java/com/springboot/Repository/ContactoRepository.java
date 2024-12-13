package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entidades.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
}