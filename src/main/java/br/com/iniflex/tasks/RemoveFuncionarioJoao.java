package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.util.List;
import java.util.function.Predicate;

public class RemoveFuncionarioJoao {

    public static List<Funcionario> removeFuncionarioJoao(List<Funcionario> funcionarios){
        Predicate<Funcionario> seSeChamaJoao = funcionario -> funcionario.getNome().equals("João");
        funcionarios.removeIf(seSeChamaJoao);
        return funcionarios;
    }

}
