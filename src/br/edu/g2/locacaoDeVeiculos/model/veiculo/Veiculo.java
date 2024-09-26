package br.edu.g2.locacaoDeVeiculos.model.veiculo;

import br.edu.g2.locacaoDeVeiculos.model.BaseModel;

public class Veiculo extends BaseModel {

    private String placa;

    private double valorDiaria;

    private boolean disponivel;

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel() {
        disponivel = !disponivel;
    }
}