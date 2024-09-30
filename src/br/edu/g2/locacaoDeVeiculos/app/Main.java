package br.edu.g2.locacaoDeVeiculos.app;

import br.edu.g2.locacaoDeVeiculos.dataframework.CrudRepositoryExeption;
import br.edu.g2.locacaoDeVeiculos.model.cliente.Cliente;
import br.edu.g2.locacaoDeVeiculos.model.cliente.TipoCliente;
import br.edu.g2.locacaoDeVeiculos.repository.ClienteRepository;
import br.edu.g2.locacaoDeVeiculos.repository.impl.ClienteRepositoryInMemoryImpl;

import java.util.Scanner;

public class Main {



    private static Scanner sc = new Scanner(System.in);
    private static ClienteRepository clienteRepository = new ClienteRepositoryInMemoryImpl();

    public static void main(String[] args) {
        while (true) {
            try {
                exibirMenu();
                int opcao = Integer.parseInt(sc.nextLine());
                switch (opcao) {
                    case 1:
                        //cadastrarVeiculo();
                        break;
                    case 2:
                        //alterarVeiculo();
                        break;
                    case 3:
                        //buscarVeiculo();
                        break;
                    case 4:
                        //cadastrarAgencia();
                        break;
                    case 5:
                        //alterarAgencia();
                        break;
                    case 6:
                        // buscarAgencia();
                        break;
                    case 7:
                        cadastrarCliente();
                        break;
                    case 8:
                         buscarTodosClientes();
                        break;

                    case 9:
                        alterarCliente();
                        break;
                    case 10:
                        //alugarVeiculo();
                        break;
                    case 11:
                        //devolverVeiculo();
                        break;
                    case 12:
                        //gerarcomprovante()
                        break;
                    case 13:
                        System.out.println("Encerrando ...");
                        System.exit(0);
                    default:
                        System.out.println();
                        System.out.println("Opção inválida.");
                }
            }catch (NumberFormatException e) {
                System.out.println("Digite uma Opçao Válida ");

            }
        }
    }


    private static void exibirMenu(){
        System.out.println("-------------------------------------------");
        System.out.println("=== Sistema de Aluguel de Veículos ===");
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("1.  Cadastrar Veículo");
        System.out.println("2.  Alterar Veículo");
        System.out.println("3.  Buscar Veículo por Nome");
        System.out.println("4.  Cadastrar Agência");
        System.out.println("5.  Alterar Agência");
        System.out.println("6.  Buscar Agência por Nome ou Logradouro");
        System.out.println("7.  Cadastrar Cliente");
        System.out.println("8.  Buscar Todos os Clientes");
               System.out.println("9.  Alterar Cliente");
        System.out.println("10. Alugar Veículo");
        System.out.println("11. Devolver Veículo");
        System.out.println("12. Gerar comprovante");
        System.out.println("13. Sair");
        System.out.print("Escolha uma opção: ");

    }

    private static void cadastrarCliente(){
        System.out.println("Digite : 1- pessoal Física, 2 - Pessoa Jurídica ");
        String tipo= sc.nextLine();
        TipoCliente tipoCliente = null;
        
        if(tipo.equals("1")){
            tipoCliente= TipoCliente.PESSOA_FISICA;
        }else if (tipo.equals("2")) {
            tipoCliente = TipoCliente.PESSOA_JURIDICA;

        }else{
        System.out.println("Tipo Inválido");}

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        
        String documento;
        if(tipoCliente == TipoCliente.PESSOA_JURIDICA){
            System.out.println("Digite o CNPJ");
            documento= sc.nextLine();
        }else{
            System.out.println("Digite o CPF");
            documento= sc.nextLine();
        }
        Cliente cliente = new Cliente(tipoCliente, nome, documento, telefone);
        try {
            clienteRepository.inserir(cliente);
            String id = cliente.getUuid();
            System.out.println("CLiente cadastrado com sucesso!");
            System.out.println(id);
            System.out.println("Documento: " + cliente.getDocumento() + " | Nome: " + cliente.getNome());
        }catch(CrudRepositoryExeption e){
            System.out.println("Erro ao cadastrar cliente,  " + e.getMessage());
        }
    }
    private static void buscarTodosClientes(){
        if(clienteRepository.getClientes().isEmpty()){
            System.out.println("Nenhuma cliente cadastrado");
        }
        for(Cliente c : clienteRepository.getClientes()){
            System.out.println();
            System.out.println("Tipo de Cliente: " + (c.getTipoCliente() == TipoCliente.PESSOA_FISICA ? "Pessoa Física" : "Pessoa Jurídica"));
            System.out.println("Nome: " + c.getUuid());
            System.out.println("Nome: " + c.getNome());
            System.out.println("Telefone: " + c.getTelefone());
            System.out.println("Documento: " + c.getDocumento());
            System.out.println("-----------------------------------------------------------------------------");
        }



}
        private static void alterarCliente() {
            System.out.print("Digite o ID do Cliente: ");
            String id = sc.nextLine();
            Cliente cliente = clienteRepository.buscaPorId(id);
            System.out.println("Novo nome");
            String novoNome = sc.nextLine();
            if(!novoNome.isEmpty()){
                cliente.setNome(novoNome);
            }
            System.out.println("Novo telefone ");
            String novoTelefone = sc.nextLine();
            if(!novoTelefone.isEmpty()){
                cliente.setTelefone(novoTelefone);
            }
            if (cliente.getTipoCliente() == TipoCliente.PESSOA_FISICA) {
                System.out.println("Novo CPf : ");
                String novoCpf = sc.nextLine();
                cliente.setDocumento(novoCpf);
            }else {
                System.out.println("Novo CNPJ : ");
                String novoCnpj = sc.nextLine();
                if(!novoCnpj.isEmpty()){
                    cliente.setDocumento(novoCnpj);
                }
            }
            clienteRepository.alterar(cliente);
            System.out.println("Cliente alterado com sucesso.");

    }


}
