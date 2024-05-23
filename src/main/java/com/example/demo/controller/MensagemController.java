package com.example.demo.model;

import com.example.demo.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mensagens")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;

    @PostMapping("/enviarMensagem")
    public ResponseEntity<Mensagem> enviarMensagem(@RequestBody Mensagem mensagem) {
        Mensagem novaMensagem = mensagemService.save(mensagem);
        return ResponseEntity.ok(novaMensagem);
    }
}
