package com.example.nossobanco.service;

import com.example.nossobanco.model.Correntista;
import com.example.nossobanco.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CadastroCorrentista {
    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void cadastro(Correntista correntista) {
        correntistaRepository.saveAndFlush(correntista);
    }
}
