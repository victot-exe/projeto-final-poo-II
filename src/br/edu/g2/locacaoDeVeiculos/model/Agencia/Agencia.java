package br.edu.g2.locacaoDeVeiculos.model.Agencia;

import br.edu.g2.locacaoDeVeiculos.model.BaseModel;

public class Agencia extends BaseModel {

    private String nome;
    private String logradouro;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}