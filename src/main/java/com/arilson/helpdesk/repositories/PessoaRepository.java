package com.arilson.helpdesk.repositories;

import com.arilson.helpdesk.domain.enums.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
