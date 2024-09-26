package br.edu.g2.locacaoDeVeiculos.model.cobranca;

public record Devolucao (Aluguel aluguel, double desconto) {

    public double getValorFinal(){
        return 0;
    }
}
