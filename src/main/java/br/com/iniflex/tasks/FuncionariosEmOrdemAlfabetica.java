package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.util.Comparator;
import java.util.List;

public class FuncionariosEmOrdemAlfabetica {

    public static void imprimeFuncionariosEmOrdemAlfabetica(List<Funcionario> funcionarios){
        funcionarios.sort(Comparator.comparing(Funcionario::getNome));
        funcionarios.forEach(System.out::println);
    }

}
