package br.edu.g2.locacaoDeVeiculos.model.cliente;

public class PessoaFisica extends Cliente {
    private String cpf;

    public String getIdentificador() {
        return cpf;
    }
}