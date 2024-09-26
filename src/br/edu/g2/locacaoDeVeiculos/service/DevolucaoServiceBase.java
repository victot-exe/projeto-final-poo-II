package br.edu.g2.locacaoDeVeiculos.service;

import br.edu.g2.locacaoDeVeiculos.model.cobranca.Aluguel;
import br.edu.g2.locacaoDeVeiculos.model.cobranca.Devolucao;
import java.time.temporal.ChronoUnit;


public abstract class DevolucaoServiceBase implements DevolucaoService {

    @Override
    public Devolucao realizarDevolucao(Aluguel aluguel) {
        //logica para mudar o estado de disponibilidade do carro
        long diasAlugado = ChronoUnit.DAYS.between(aluguel.getDataInicio(),aluguel.getDataFim());

        double desconto = this.calcularDescontoCliente(diasAlugado);


        return new Devolucao(aluguel, desconto);
    }

    public abstract double calcularDescontoCliente(long diasAlugado);

//    public double calcularValorFinal(Aluguel aluguel, double desconto) {
//        return (aluguel.getDiasAlugado() * aluguel.getVeiculo().getValorDiaria()) * (1 - desconto);
//    }
}
