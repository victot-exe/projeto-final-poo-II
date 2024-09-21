package br.edu.g2.locacaoDeVeiculos.model.veiculo;

import br.edu.g2.locacaoDeVeiculos.model.BaseModel;

public abstract class Veiculo extends BaseModel {
    private String modelo;
    private TipoVeiculo tipo;
    private String placa;
    private boolean disponivel;
}