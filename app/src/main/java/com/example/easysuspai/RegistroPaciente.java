package com.example.easysuspai;

import java.io.Serializable;
import java.util.ArrayList;

public class RegistroPaciente implements Serializable {
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
    public void addPaciente(Paciente paciente){
        this.pacientes.add(paciente);
        this.quantidadePacientes++;
    }
    public Paciente existePaciente(int numeroSUS){
        Paciente pacienteAtual;
        for(int i =0;i < this.quantidadePacientes;i++){
            pacienteAtual = this.pacientes.get(i);
            if (pacienteAtual.getNumeroSUS() == numeroSUS)
                return pacienteAtual;
        }
        return null;
    }

    public Paciente existePaciente(int numeroSUS, String senha){
        Paciente pacienteAtual;
        for(int i =0;i < this.quantidadePacientes;i++){
            pacienteAtual = this.pacientes.get(i);
            if (pacienteAtual.getNumeroSUS() == numeroSUS && pacienteAtual.getSenha().compareTo(senha) == 0)
                return pacienteAtual;
        }
        return null;
    }
    public Paciente existePacienteLogado(){
        Paciente pacienteAtual;
        for(int i =0;i < this.quantidadePacientes;i++){
            pacienteAtual = this.pacientes.get(i);
            if (pacienteAtual.getLogado())
                return pacienteAtual;
        }
        return null;
    }
    public RegistroPaciente(){
        this.pacientes = new ArrayList<Paciente>();
        this.quantidadePacientes = 0;
    }
    public void colocaPacientesComoNaoLogados(){
        Paciente pacienteAtual;
        for(int i =0;i < this.quantidadePacientes;i++){
            pacienteAtual = this.pacientes.get(i);
            pacienteAtual.setLogado(false);
        }

    }
}
