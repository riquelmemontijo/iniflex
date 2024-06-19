package br.com.iniflex.tasks;

import br.com.iniflex.Funcionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparFuncionarioPorFuncao {

    public static List<Funcionario> agrupaFuncionariosPorFuncao(List<Funcionario> funcionarios){

        Map<String, List<Funcionario>> agrupamentoPorFuncoes = new HashMap<>();
        funcionarios.forEach(funcionario -> {
            String funcao = funcionario.getFuncao();
            if(!agrupamentoPorFuncoes.containsKey(funcao)){
                agrupamentoPorFuncoes.put(funcao, new ArrayList<>());
            }
            agrupamentoPorFuncoes.get(funcao).add(funcionario);
        });

        List<Funcionario> funcionariosAgrupadosPorFuncao = new ArrayList<>();
        for(String key : agrupamentoPorFuncoes.keySet()){
            funcionariosAgrupadosPorFuncao.addAll(agrupamentoPorFuncoes.get(key));
        }

        return funcionariosAgrupadosPorFuncao;
    }

}
