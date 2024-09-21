package br.edu.g2.locacaoDeVeiculos.model.cliente;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public String getIdentificador() {
        return cnpj;
    }
}