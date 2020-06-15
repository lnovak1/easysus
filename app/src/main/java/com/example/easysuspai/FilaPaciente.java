package com.example.easysuspai;

import java.io.Serializable;
import java.util.ArrayList;

public class FilaPaciente implements Serializable{
    private ArrayList<Paciente> pacientes;
    private int quantidadePacientes;
    public static final long  serialVersionUID = 100L;

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public int getQuantidadePacientes() {
        return quantidadePacientes;
    }

    public void setQuantidadePacientes(int quantidadePacientes) {
        this.quantidadePacientes = quantidadePacientes;
    }


    public FilaPaciente(){
        this.pacientes = new ArrayList<Paciente>();
        this.quantidadePacientes = 0;
    }
    public void addPaciente(Paciente paciente){
        this.pacientes.add(paciente);
        this.quantidadePacientes++;
    }
    public Boolean pacienteNaFila(int numeroSUS){
        Paciente pacienteAtual;
        for(int i =0;i < this.quantidadePacientes;i++){
            pacienteAtual = this.pacientes.get(i);
            if (pacienteAtual.getNumeroSUS() == numeroSUS)
                return true;
        }
        return false;
    }

}
