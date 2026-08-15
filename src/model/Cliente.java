package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Ingresso> ingressos;

    public Cliente() {
        this.ingressos = new ArrayList<>();
    }


    public Cliente(String nome, String cpf, List<Ingresso> ingressos) {
        this.nome = nome;
        this.cpf = cpf;
        this.ingressos = (ingressos != null) ? ingressos : new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
}