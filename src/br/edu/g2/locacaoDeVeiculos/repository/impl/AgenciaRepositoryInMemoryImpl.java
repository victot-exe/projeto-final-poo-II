package br.edu.g2.locacaoDeVeiculos.repository.impl;

import br.edu.g2.locacaoDeVeiculos.model.Agencia;
import br.edu.g2.locacaoDeVeiculos.repository.AgenciaRepository;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRepositoryInMemoryImpl implements AgenciaRepository {

    private List<Agencia> agencias = new ArrayList<>();

    //TODO métodos
    @Override
    public Agencia inserir(Agencia ag) {
        agencias.add(ag);
        return null;
    }

    @Override
    public Agencia alterar(Agencia ag) {
        return null;
    }

    @Override
    public Agencia deletar(Agencia ag) {
        return null;
    }

    @Override
    public Agencia buscaPorId(String id) {
        return null;
    }

    @Override
    public Agencia deletarPorId(String id) {
        return null;
    }
}