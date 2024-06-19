package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class SalarioMinimosPorFuncionario {

    public static void imprimeQuantosSalariosMinimosCadaFuncionarioGanha(List<Funcionario> funcionarios){
        funcionarios.forEach(funcionario -> {
            var salariosMinimos = funcionario.getSalario().divide(BigDecimal.valueOf(1212.00), RoundingMode.HALF_UP);
            System.out.println("Nome: " + funcionario.getNome() + " | " +
                    "Salarios mínimos: " + salariosMinimos);
        });
    }

}
