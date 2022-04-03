package br.com.dio.desafio.dominio;


import java.time.LocalDate;

import static br.com.dio.desafio.dominio.Curso.NOTAFINAL;

public class Materia extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularNotaFinal() {
        return NOTAFINAL + 20d;
    }

    public Materia() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}