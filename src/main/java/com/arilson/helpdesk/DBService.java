package com.arilson.helpdesk;

import com.arilson.helpdesk.domain.*;
import com.arilson.helpdesk.domain.enums.*;
import com.arilson.helpdesk.repositories.ChamadoRepository;
import com.arilson.helpdesk.repositories.ClienteRepository;
import com.arilson.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public void instanciaDB() {

        Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "63653230268", "valdir@mail.com", encoder.encode("123"));
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@mail.com", encoder.encode("123"));

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));

    }
}
