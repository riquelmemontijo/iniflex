package br.com.iniflex;

import br.com.iniflex.tasks.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** INIFLEX ***");

        System.out.println("\n******** TODOS OS FUNCIONÁRIOS ***********\n");
        var funcionarios = CriaFuncionarios.criaListaDeFuncionario();
        ImprimeTodosOsFuncionarios.imprimeFuncionarios(funcionarios);

        Thread.sleep(3000);

        System.out.println("\n******** FUNCIONÁRIOS SEM JOÃO ***********\n");
        var funcionariosSemJoao = RemoveFuncionarioJoao.removeFuncionarioJoao(funcionarios);
        ImprimeTodosOsFuncionarios.imprimeFuncionarios(funcionariosSemJoao);

        Thread.sleep(3000);

        System.out.println("\n******** FUNCIONÁRIOS COM AUMENTO DE 10% ***********\n");
        var funcionariosComAumentoDeDezPorCento = AumentarSalario.aumentaSalarioEmDezPorCento(funcionarios);
        ImprimeTodosOsFuncionarios.imprimeFuncionarios(funcionariosComAumentoDeDezPorCento);

        Thread.sleep(3000);

        System.out.println("\n******** FUNCIONÁRIOS AGRUPADOS POR FUNCAO ***********\n");
        var funcionariosAgrupadosPorFuncao = AgruparFuncionarioPorFuncao.agrupaFuncionariosPorFuncao(funcionarios);
        ImprimeTodosOsFuncionarios.imprimeFuncionarios(funcionariosAgrupadosPorFuncao);

        Thread.sleep(3000);

        System.out.println("\n******** ANIVERSARIANTES OUTUBRO E DEZEMBRO ***********\n");
        var aniversariantesOutubroDezembro = AniversariantesOutubroEDezembro.filtraAniversariantesOutubroDezembro(funcionarios);
        ImprimeTodosOsFuncionarios.imprimeFuncionarios(aniversariantesOutubroDezembro);

        Thread.sleep(3000);

        System.out.println("\n******** FUNCIONÁRIO COM MAIOR IDADE ***********\n");
        FuncionarioMaisVelho.imprimeFuncionarioMaisVelho(funcionarios);

        Thread.sleep(3000);

        System.out.println("\n******** FUNCIONÁRIOS EM ORDEM ALFABÉTICA ***********\n");
        FuncionariosEmOrdemAlfabetica.imprimeFuncionariosEmOrdemAlfabetica(funcionarios);

        Thread.sleep(3000);

        System.out.println("\n******** SOMA DOS SALÁRIOS ***********\n");
        SomaDosSalarios.imprimeSomaDeTodosOsSalarios(funcionarios);

        Thread.sleep(3000);

        System.out.println("\n******** SALÁRIOS MÍNIMOS QUE CADA FUNCIONARIO GANHA ***********\n");
        SalarioMinimosPorFuncionario.imprimeQuantosSalariosMinimosCadaFuncionarioGanha(funcionarios);
    }

}