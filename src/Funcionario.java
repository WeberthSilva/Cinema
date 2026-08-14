import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int id;
    private String nome;
    private List<Ingresso> ingressos;

    // Construtor Padrão
    public Funcionario() {
        this.ingressos = new ArrayList<>();
    }

    // Construtor com Parâmetros
    public Funcionario(int id, String nome, List<Ingresso> ingressos) {
        this.id = id;
        this.nome = nome;
        this.ingressos = (ingressos != null) ? ingressos : new ArrayList<>();
    }

    // Getters e Setters
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