package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class SomaDosSalarios {

    public static void imprimeSomaDeTodosOsSalarios(List<Funcionario> funcionarios){
        BigDecimal somaDosSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        var formatter = new DecimalFormat("#,###,##0.00");
        System.out.println(formatter.format(somaDosSalarios));
    }

}
