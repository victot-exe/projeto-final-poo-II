package br.edu.g2.locacaoDeVeiculos.model.cobranca;

import br.edu.g2.locacaoDeVeiculos.model.cliente.TipoCliente;
import br.edu.g2.locacaoDeVeiculos.repository.AgenciaRepository;

public record Devolucao (Aluguel aluguel, double desconto) {

    public double getValorFinal(){
        //logica para pegar o tipo do cliente e aplicar o desconto
        // pf d > 5 = 0.05 pj d > 3 = 0.03
        return 0.0;
    }
}
