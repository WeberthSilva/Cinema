package model;
import enums.TipoIngresso;

public class Ingresso {
    private int numero;
    private TipoIngresso tipo;
    private Sessao sessao;
    private Cliente cliente;
    private Funcionario funcionario;

    public Ingresso() {
    }

    public Ingresso(int numero, TipoIngresso tipo, Sessao sessao, Cliente cliente, Funcionario funcionario) {
        this.numero = numero;
        this.tipo = tipo;
        this.sessao = sessao;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngresso tipo) {
        this.tipo = tipo;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}