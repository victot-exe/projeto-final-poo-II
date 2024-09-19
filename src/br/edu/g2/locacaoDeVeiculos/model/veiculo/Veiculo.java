package br.edu.g2.locacaoDeVeiculos.model.veiculo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Veiculo {
    private String placa;
    private Double valorDiario;
    //Talves colocar em uma lista para ter o historico de datas que o carro entrou e saiu??
    private LocalDate dataSaida;
    private LocalDate dataEntrega;
    private boolean disponivelParaAluguel;

    public Veiculo(String placa, Double valorDiario) {
        this.placa = placa;
        this.valorDiario = valorDiario;
    }

    public String getPlaca() {
        return placa;
    }

    public Double getValorDiario() {
        return valorDiario;
    }

    public void alugarVeiculo(){
//        Sugestao de logica para alugar veiculo
        if(disponivelParaAluguel){
            disponivelParaAluguel = false;
            this.dataSaida = LocalDate.now();
        }else{
            throw new RuntimeException("Veiculo não está disponivel para alugar");
        }
    }

    public void devolverVeiculo(){
        if(!disponivelParaAluguel){
            this.dataSaida = LocalDate.now();
            long diasAlugado = ChronoUnit.DAYS.between(this.dataSaida, this.dataEntrega);
        }
    }


}
