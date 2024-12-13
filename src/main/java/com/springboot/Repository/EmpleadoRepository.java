package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entidades.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}