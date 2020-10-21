package com.example.nossobanco.controller;


import com.example.nossobanco.model.Correntista;
import com.example.nossobanco.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    @GetMapping(path = "api/correntista-id/{}")
    public ResponseEntity<Optional<Correntista>> buscarCorrentistaPorId(
            @PathVariable(name = "id" , required = true)Long idCorrentista) {
        return ResponseEntity
                .ok(correntistaRepository.findById(idCorrentista));


    }
}
