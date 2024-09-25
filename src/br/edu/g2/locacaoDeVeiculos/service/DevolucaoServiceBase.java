package br.edu.g2.locacaoDeVeiculos.service;

import br.edu.g2.locacaoDeVeiculos.model.cobranca.Aluguel;
import br.edu.g2.locacaoDeVeiculos.model.cobranca.Devolucao;

import java.time.temporal.ChronoUnit;

public abstract class DevolucaoServiceBase implements DevolucaoService {

    @Override
    public Devolucao realizarDevolucao(Aluguel aluguel) {
//        long diasAlugados = ChronoUnit.DAYS.between(devolucao.aluguel().getDataInicio(), devolucao.aluguel().getDataInicio());
        double desconto = this.calcularDescontoCliente(aluguel);

        return new Devolucao(aluguel, desconto);
    }

    public abstract double calcularDescontoCliente(Aluguel aluguel);
}
