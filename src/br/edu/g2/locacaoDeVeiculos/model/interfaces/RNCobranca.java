package br.edu.g2.locacaoDeVeiculos.model.interfaces;

import br.edu.g2.locacaoDeVeiculos.model.veiculo.Veiculo;

public interface RNCobranca {
    Double calculoAluguel(int diasComOVeiculo, Veiculo veiculo);
}
