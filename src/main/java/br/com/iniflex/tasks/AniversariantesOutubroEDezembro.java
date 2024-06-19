package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.time.Month;
import java.util.List;
import java.util.function.Predicate;

public class AniversariantesOutubroEDezembro {

    public static List<Funcionario> filtraAniversariantesOutubroDezembro(List<Funcionario> funcionarios){
        Predicate<Funcionario> nasceuEmDezembro = funcionario -> funcionario.getDataNascimento().getMonth().equals(Month.DECEMBER);
        Predicate<Funcionario> nasceuEmOutubro = funcionario -> funcionario.getDataNascimento().getMonth().equals(Month.OCTOBER);
        Predicate<Funcionario> nasceuEmOutubroOuDezembro = nasceuEmOutubro.or(nasceuEmDezembro);

        return funcionarios.stream().filter(nasceuEmOutubroOuDezembro).toList();
    }

}
