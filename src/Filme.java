import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private int duracao;
    private List<Sessao> sessoes;

    // Construtor Padrão
    public Filme() {
        this.sessoes = new ArrayList<>();
    }

    // Construtor com Parâmetros
    public Filme(String titulo, int duracao, List<Sessao> sessoes) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.sessoes = (sessoes != null) ? sessoes : new ArrayList<>();
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
}