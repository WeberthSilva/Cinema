package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private LocalDate data;
    private LocalTime horario;
    private boolean encerrada;
    private Sala sala;
    private Filme filme;
    private List<Ingresso> ingressos;


    public Sessao() {
        this.ingressos = new ArrayList<>();
    }


    public Sessao(LocalDate data, LocalTime horario, boolean encerrada, Sala sala, Filme filme, List<Ingresso> ingressos) {
        this.data = data;
        this.horario = horario;
        this.encerrada = encerrada;
        this.sala = sala;
        this.filme = filme;
        this.ingressos = (ingressos != null) ? ingressos : new ArrayList<>();
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public boolean isEncerrada() {
        return encerrada;
    }

    public void setEncerrada(boolean encerrada) {
        this.encerrada = encerrada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
}