package com.example.demo.service;

import com.example.demo.model.Destino;
import com.example.demo.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinoService {

    @Autowired
    private DestinoRepository destinoRepository;

    public List<Destino> findAll() {
        return destinoRepository.findAll();
    }

    public Optional<Destino> findById(Integer id) {
        return destinoRepository.findById(id);
    }

    public Destino save(Destino destino) {
        return destinoRepository.save(destino);
    }

    public void deleteById(Integer id) {
        destinoRepository.deleteById(id);
    }
}
