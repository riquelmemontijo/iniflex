package br.com.iniflex;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Objects;

public class Funcionario extends Pessoa {

    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public void aumentarSalario(BigDecimal porcentagem) {
        var porcentagemEmDecimal = porcentagem.divide(new BigDecimal("100"));
        var aumento = this.salario.multiply(porcentagemEmDecimal);
        this.salario = this.salario.add(aumento);
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(funcao, that.funcao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcao);
    }

    @Override
    public String toString() {

        var formatter = new DecimalFormat("#,###,##0.00");

        return super.toString() +
                "Salário: " + formatter.format(this.salario) + " | " +
                "Função: " + this.funcao;
    }
}
