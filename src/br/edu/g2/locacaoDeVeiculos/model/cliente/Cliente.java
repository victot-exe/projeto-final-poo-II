package br.edu.g2.locacaoDeVeiculos.model.cliente;

import br.edu.g2.locacaoDeVeiculos.model.veiculo.Veiculo;

public abstract class Cliente {
    String nome;
    String documento;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome(){return nome;}
    public String getDocumento(){return documento;}
    public void setNome(String nome){this.nome = nome;}
    public abstract void setDocumento(String documento);
}
