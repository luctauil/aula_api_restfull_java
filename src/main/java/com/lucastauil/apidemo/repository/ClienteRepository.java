package com.lucastauil.apidemo.repository;

import com.lucastauil.apidemo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
