package br.com.iniflex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Nome: " + this.nome + " | " +
               "Data de Nascimento: " + this.dataNascimento.format(formatter) + " | ";
    }
}
