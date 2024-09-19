package br.edu.g2.locacaoDeVeiculos.model.cliente;

import br.edu.g2.locacaoDeVeiculos.model.interfaces.RNCobranca;
import br.edu.g2.locacaoDeVeiculos.model.veiculo.Veiculo;


public class ClientePJ extends Cliente implements RNCobranca {
    public ClientePJ(String nome){
        super(nome);
    }

    @Override
    public Double calculoAluguel(int diasComOVeiculo, Veiculo veiculo) {
        //TODO calculo do aluguel -> Não sei como vamos fazer o esquema para saber em qual agencia o carro está, uma lista carros em cada agencia e uma Agencia em cada carro
        return 0.0;
    }

    @Override
    public void setDocumento(String documento) {//TODO talvez fazer a validação dos documentos semelhante ao exercicio da aula 2. acho interessante, o unico problema seria validar apenas depois que já foram setados os resultados
        //TODO Validação de cnpj
    }
}