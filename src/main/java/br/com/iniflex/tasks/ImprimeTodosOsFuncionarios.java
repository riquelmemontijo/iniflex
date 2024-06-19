package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.util.List;

public class ImprimeTodosOsFuncionarios {

    public static void imprimeFuncionarios(List<Funcionario> funcionarios){
        funcionarios.forEach(System.out::println);
    }

}
