package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class AumentarSalario {

    public static List<Funcionario> aumentaSalarioEmDezPorCento(List<Funcionario> funcionarios){
        funcionarios.forEach(funcionario -> {
            funcionario.aumentarSalario(BigDecimal.TEN);
        });

        return funcionarios;
    }

}
