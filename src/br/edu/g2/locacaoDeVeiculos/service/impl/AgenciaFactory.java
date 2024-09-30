package br.edu.g2.locacaoDeVeiculos.service.impl;

import br.edu.g2.locacaoDeVeiculos.model.Agencia.Agencia;
import br.edu.g2.locacaoDeVeiculos.repository.AgenciaRepository;
import br.edu.g2.locacaoDeVeiculos.repository.impl.AgenciaRepositoryInMemoryImpl;

public class AgenciaFactory {

    private AgenciaRepositoryInMemoryImpl agenciaRepository;

    AgenciaFactory(){
        agenciaRepository = new AgenciaRepositoryInMemoryImpl();
    }

    public Agencia createAgencia(String nome, String logradouro) {
        if(!this.agenciaRepository.isAgenciaExistente(nome)){
            return new Agencia(nome, logradouro);
        }else{
            throw new IllegalArgumentException("A agencia já consta na lista");
        }
    }
}
