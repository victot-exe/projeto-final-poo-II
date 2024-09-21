package br.edu.g2.locacaoDeVeiculos.model.cliente;

import br.edu.g2.locacaoDeVeiculos.model.BaseModel;

public abstract class Cliente extends BaseModel {
    protected String nome;
    protected String telefone;

    //TODO Construtor, Getters e Setters

    public abstract String getIdentificador();
}