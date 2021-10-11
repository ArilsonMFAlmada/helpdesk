package com.arilson.helpdesk.repositories;

import com.arilson.helpdesk.domain.enums.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
