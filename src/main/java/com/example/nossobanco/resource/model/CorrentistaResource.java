package com.example.nossobanco.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorrentistaResource {


    @JsonProperty("nome_correntista")
    private String nome;

    @JsonProperty
    private String idPaciente;


    public CorrentistaResource(String nome, String idPaciente) {
        this.nome = nome;
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }
}
