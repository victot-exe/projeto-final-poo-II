package br.edu.g2.locacaoDeVeiculos.repository.impl;

import br.edu.g2.locacaoDeVeiculos.dataframework.CrudRepositoryExeption;
import br.edu.g2.locacaoDeVeiculos.model.Agencia.Agencia;
import br.edu.g2.locacaoDeVeiculos.repository.AgenciaRepository;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRepositoryInMemoryImpl implements AgenciaRepository {
//precisa ser uma lista para todas as agencias, clientes e veiculos para não ter repeticao como fqazer isso?
    private List<Agencia> agencias = new ArrayList<>();

    //TODO métodos
    @Override
    public Agencia inserir(Agencia ag) {
        agencias.add(ag);
        return ag;
    }

    @Override
    public Agencia alterar(Agencia ag) {
        int i = 0;
        for(Agencia agencia : agencias) {
            i++;
            if(ag.equals(agencia)) {
                break;
            }
        }

        agencias.set(i, ag);
        return ag;
    }

    @Override
    public Agencia deletar(Agencia ag){
        if(agencias.remove(ag)){
            return ag;
        }else{
            throw new CrudRepositoryExeption("O usuario não foi encontrado");
        }
    }

    @Override
    public Agencia buscaPorId(String id) {
        Agencia agencia = agencias.stream().filter(ag -> ag.getUuid().equalsIgnoreCase(id))
                .findFirst().orElse(null);

        if(agencia != null){
            return agencia;
        }else{
            throw new CrudRepositoryExeption("A pesquisa não retornou resultado");
        }
    }

    @Override
    public Agencia deletarPorId(String id) {
        Agencia agencia = agencias.stream().filter(ag -> ag.getUuid().equalsIgnoreCase(id))
                .findFirst().orElse(null);

        if(agencia != null){
            agencias.remove(agencia);
            return agencia;
        }else{
            throw new CrudRepositoryExeption("o id não foi encontrado");
        }
    }
}