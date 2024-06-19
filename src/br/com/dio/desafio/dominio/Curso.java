package br.com.dio.desafio.dominio;

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String informacoes(){
        return "Curso: " + titulo + "\nDescrição: " + descricao + "\nCarga Horária: " + cargaHoraria + " horas ";
    }

}
