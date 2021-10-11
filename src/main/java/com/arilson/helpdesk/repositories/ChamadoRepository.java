package com.arilson.helpdesk.repositories;

import com.arilson.helpdesk.domain.enums.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
