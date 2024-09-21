package br.edu.g2.locacaoDeVeiculos.model;

import br.edu.g2.locacaoDeVeiculos.model.cliente.Cliente;
import br.edu.g2.locacaoDeVeiculos.model.veiculo.Veiculo;

import java.time.LocalDate;

public class Aluguel extends BaseModel {
    private Veiculo veiculo;
    private Cliente cliente;
    private Agencia agencia;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorTotal;

    // Construtor, Getters e Setters
}
