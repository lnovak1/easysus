package com.example.easysuspai;

import java.io.Serializable;

public class Controle implements Serializable {
    private RegistroPaciente registro;
    private FilaPaciente fila;
    public static final long  serialVersionUID = 100L;

    public RegistroPaciente getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroPaciente registro) {
        this.registro = registro;
    }

    public FilaPaciente getFila() {
        return fila;
    }

    public void setFila(FilaPaciente fila) {
        this.fila = fila;
    }

    public Controle(RegistroPaciente registro, FilaPaciente fila){
        this.registro = registro;
        this.fila = fila;
    }

}
