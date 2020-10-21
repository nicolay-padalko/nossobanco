package com.example.nossobanco.repository;

import com.example.nossobanco.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository
    extends JpaRepository<Correntista, Long> {

}
