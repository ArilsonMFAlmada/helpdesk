package com.arilson.helpdesk.repositories;

import com.arilson.helpdesk.domain.enums.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
