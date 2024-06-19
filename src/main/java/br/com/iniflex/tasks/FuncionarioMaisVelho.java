package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;

public class FuncionarioMaisVelho {

    public static void imprimeFuncionarioMaisVelho(List<Funcionario> funcionarios){
        funcionarios.sort(Comparator.comparing(Funcionario::getDataNascimento));
        var funcionarioMaisVelho = funcionarios.get(0);
        var idadeFuncionarioMaisVelho = Period.between(funcionarioMaisVelho.getDataNascimento(), LocalDate.now()).getYears();

        System.out.println("Nome: " + funcionarioMaisVelho.getNome() + " | " +
                "Idade: " + idadeFuncionarioMaisVelho);
    }

}
