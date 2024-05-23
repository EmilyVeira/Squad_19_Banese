package com.example.demo.service;

import com.example.demo.model.Mensagem;
import java.util.List;

public interface MensagemService {
    List<Mensagem> buscarTodos();
    Mensagem save(Mensagem mensagem);
}
