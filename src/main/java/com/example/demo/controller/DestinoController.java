package com.example.demo.model;

import com.example.demo.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/destinos")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    @GetMapping
    public List<Destino> getAllDestinos() {
        return destinoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Destino> getDestinoById(@PathVariable Integer id) {
        Optional<Destino> destino = destinoService.findById(id);
        return destino.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Destino createDestino(@RequestBody Destino destino) {
        return destinoService.save(destino);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDestino(@PathVariable Integer id) {
        destinoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
