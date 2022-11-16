package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected abstract final double XP_PADRAO = 10d;

    private String titulo;
    private string descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public string getDescricao() {
        return descricao;
    }

    public void setDescricao(string descricao) {
        this.descricao = descricao;
    }

}
