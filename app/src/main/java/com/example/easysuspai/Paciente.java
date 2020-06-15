package com.example.easysuspai;

import java.io.Serializable;

public class Paciente implements Serializable {
    private int numeroSUS;
    private String nome;
    private String senha;
    private Boolean logado;
    public static final long  serialVersionUID = 100L;

    public Boolean getLogado() {
        return logado;
    }

    public void setLogado(Boolean logado) {
        this.logado = logado;
    }

    public int getNumeroSUS() {
        return numeroSUS;
    }

    public void setNumeroSUS(int numeroSUS) {
        this.numeroSUS = numeroSUS;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public Paciente(int numeroSUS, String nome, String senha){
        this.numeroSUS = numeroSUS;
        this.nome = nome;
        this.senha = senha;
        this.logado = false;
    }
}
