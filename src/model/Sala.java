package model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidade;
    private List<Sessao> sessoes;


    public Sala() {
        this.sessoes = new ArrayList<>();
    }


    public Sala(int numero, int capacidade, List<Sessao> sessoes) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.sessoes = (sessoes != null) ? sessoes : new ArrayList<>();
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
}