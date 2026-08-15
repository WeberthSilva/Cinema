package model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String nome;
    private String endereco;
    private List<Sala> salas;


    public Cinema() {
        this.salas = new ArrayList<>();
    }


    public Cinema(String nome, String endereco, List<Sala> salas) {
        this.nome = nome;
        this.endereco = endereco;
        this.salas = (salas != null) ? salas : new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}