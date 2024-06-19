package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CriaFuncionarios {

    public static List<Funcionario> criaListaDeFuncionario(){

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Maria",
                LocalDate.of(2000, 10,18),
                BigDecimal.valueOf(2009.44),
                "Operador"));

        funcionarios.add(new Funcionario("João",
                LocalDate.of(1990, 5,12),
                BigDecimal.valueOf(2284.38),
                "Operador"));

        funcionarios.add(new Funcionario("Caio",
                LocalDate.of(1961, 5,2),
                BigDecimal.valueOf(9836.14),
                "Coordenador"));

        funcionarios.add(new Funcionario("Miguel",
                LocalDate.of(1988, 10,14),
                BigDecimal.valueOf(19119.88),
                "Diretor"));

        funcionarios.add(new Funcionario("Alice",
                LocalDate.of(1995, 1,5),
                BigDecimal.valueOf(2234.68),
                "Recepcionista"));

        funcionarios.add(new Funcionario("Heitor",
                LocalDate.of(1999, 11,19),
                BigDecimal.valueOf(1582.72),
                "Operador"));

        funcionarios.add(new Funcionario("Arthur",
                LocalDate.of(1993, 3,31),
                BigDecimal.valueOf(4071.84),
                "Contador"));

        funcionarios.add(new Funcionario("Laura",
                LocalDate.of(1994, 7,8),
                BigDecimal.valueOf(3017.45),
                "Gerente"));

        funcionarios.add(new Funcionario("Heloísa",
                LocalDate.of(2003, 5,24),
                BigDecimal.valueOf(1606.85),
                "Eletricista"));

        funcionarios.add(new Funcionario("Helena",
                LocalDate.of(1996, 9,2),
                BigDecimal.valueOf(2799.93),
                "Gerente"));

        return funcionarios;
    }

}
