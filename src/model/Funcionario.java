package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int id;
    private String nome;
    private List<Ingresso> ingressos;


    public Funcionario() {
        this.ingressos = new ArrayList<>();
    }


    public Funcionario(int id, String nome, List<Ingresso> ingressos) {
        this.id = id;
        this.nome = nome;
        this.ingressos = (ingressos != null) ? ingressos : new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
}