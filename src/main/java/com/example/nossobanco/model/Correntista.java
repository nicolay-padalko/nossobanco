package com.example.nossobanco.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "correntista")
public class Correntista {

    @Id
    private Long id;


    private String nome;
    private String sobreNome;


    private String email;
    private int date;
    private int cpf;

    @Column(name = "id_cliente")
    private Long idCliente;

    public Correntista(String nome, String sobreNome, String email, int date, int cpf, Long idCliente) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.date = date;
        this.cpf = cpf;
        this.idCliente = idCliente;
    }

    private Correntista() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
