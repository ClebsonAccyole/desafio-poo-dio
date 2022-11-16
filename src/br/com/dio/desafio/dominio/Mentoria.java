package br.com.dio.desafio.dominio;

import java.time.LocalDate;
public class Mentoria extends Conteudo {
    private localDate data;
    public Mentoria() {
    }
    public localDate getData() {
        return data;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public void setData(localDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
    public void setData(LocalDate now) {
    }


}
