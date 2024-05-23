package com.example.demo.service.impl;

import java.util.List;
import com.example.demo.model.Mensagem;
import com.example.demo.repository.MensagemRepository;
import com.example.demo.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensagemServiceImpl implements MensagemService {

    @Autowired
    private MensagemRepository mensagemRepository;

    @Override
    public List<Mensagem> buscarTodos() {
        return mensagemRepository.findAll();
    }

    @Override
    public Mensagem save(Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }
}

