package android.alanstos.com.br.agendaaluno.modelo;

/**
 * Created by A on 11/11/2017.
 */

public class Curso {


    private String nome;
    private String descricao;
    private String estado;

    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.estado = "I";
    }
    public Curso(String nome, String descricao, String estado) {
        this.nome = nome;
        this.descricao = descricao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
