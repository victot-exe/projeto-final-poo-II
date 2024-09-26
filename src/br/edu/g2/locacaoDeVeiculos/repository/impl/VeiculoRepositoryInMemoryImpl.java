package br.edu.g2.locacaoDeVeiculos.repository.impl;

import br.edu.g2.locacaoDeVeiculos.model.veiculo.Veiculo;
import br.edu.g2.locacaoDeVeiculos.repository.VeiculoRepository;

import java.util.ArrayList;
import java.util.List;

public class VeiculoRepositoryInMemoryImpl implements VeiculoRepository {

    //Essa lista precisa ser estática? fazer um VeiculoFactory?
    private List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public Veiculo inserir(Veiculo veiculo) {
        veiculos.add(veiculo);
        return veiculo;
    }

    @Override
    public Veiculo alterar(Veiculo veiculo) {
        // Lógica para alterar veículo
        return null;
    }

    @Override
    public Veiculo deletar(Veiculo veiculo) {
        // Lógica para deletar veículo
        return null;
    }

    @Override
    public Veiculo buscaPorId(String id) {
        // Lógica para buscar veículo por ID
        return null;
    }

    @Override
    public Veiculo deletarPorId(String id) {
        // Lógica para deletar veículo por ID
        return null;
    }

    // Método para buscar por parte do nome
    public List<Veiculo> buscarPorNome(String nome) {
        // Lógica para busca
        return null;
    }
}
