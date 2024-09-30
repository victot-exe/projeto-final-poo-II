# Locadora de veiculos (POO II)
_Este é um projeto proposto para ser resolvido em grupo ao final do modulo de Programação orientada a objetos II, no curso Santander Coders 2024.1 da AdaTech.  
Abaixo segue um descritivo das classes e como fizemos para implementar uma locadora de veiculos.

# `public class Aluguel{}`

A classe aluguel é a classe responsável por conter os dados de quando alguém aluga um carro.  
O indicado é que quando for criar uma nova instância da mesma utilizar a classe `AluguelService{}`
## `public class AluguelServiceImpl{}`
Esta é a classe responsável por criar novas instâncias de aluguel, ela pega os dados responsáveis para se criar, tendo duas opções do método alugar:
* A primeira é onde não recebemos uma data e se entende que o carro está sendo alugado agora, ela define a Data e hora atual e chama a segunda forma do método;
* A segunda forma do método alugar tem a opção de escolher uma data para início do aluguel, ela verifica se o veículo escolhido está disponível e retorna uma instancia de `Aluguel{}` ou gera uma exceção dizendo que o veículo não pode ser alugado pois não está disponível.

# `public class DevolucaoFactory{}`

Como o próprio nome já diz ela é uma fábrica de instancias de `public record Devolucao` atravéz do método `devolverVeiculo(Aluguel alguel)`

* Este método recebe uma instância de `Aluguel{}`, verifica o tipo do cliente para saber qual tipo de desconto aplicar e chama a implementação de `DevolucaoService{}` tendo uma para pessoa física e outra para pessoa jurídica

## `public interface DevolucaoServiceBase{}`

É a interface base para implementações dos diferentes tipos de clientes.


#   `public class Cliente{}`

Essa classe é responsável para representar as informações de um cliente que alugará um veículo. A instância dessa classe irá conter os dados como nome,
documentos de identificação e informações de contato. Ela é um dos modelos de dados que será utilizado no processo de aluguel.

##  `public class ClienteRepositoryInMemoryImpl{}`
Esse é o repositório que armazenará os dados em memória, simulando um banco de dados. A classe gerencia as operações de CRUD (criar, ler, atualizar e excluir).
Ela fornece métodos como:
*   Salvar: Adiciona um novo cliente à lista de clientes em memória.
* Buscar: Retorna uma instância de Cliente com base no documento, ou retornar uma mensagem informando que o cliente não foi encontrado.
* atualizar: Atualiza as informações de um cliente existente.
* Remover: Remove um cliente da lista de clientes com base no documento. 

# `public interface CrudRepository`
Esta interface é responsável por estabelecer o contrato com as transações crud para que as implementações dela tenham que fazer as operações básicas.

# `public interface AgenciaRepository`
Implementando a interface `CrudRepository` ela diz que vai aceitar o tipo `Agencia` e direciona o crud para uma lista de `Agencia`.

## `public class AgencaRepositoryInMemoryImpl{}`
Esta é a classe que implementa o CRUD de `AgenciaRepository` para que os dados das agencias sejam salvos InMemory usando uma `List<Agencia>`;




### Criar uma aplicação que gerencie o aluguel de veículos, onde cada item abaixo seja considerado:

#### Itens obrigatórios

1. Cadastrar os veículos;
2. Alterar um veículo cadastrado;
3. Buscar um veículo por parte do nome;
4. Cadastrar a agência onde o veículo será alugado/devolvido;
5. Alterar a agência onde o veículo será alugado/devolvido;
6. Buscar uma agência por parte do nome ou do logradouro do endereço;
7. Cadastrar o cliente (pessoa fisica/juridica)
8. Alterar o cliente (pessoa fisica/juridica)
9. Alugar um veículo para pessoa fisica;
10. Alugar um veículo para pessoa juridica;
11. Devolver um veículo para pessoa fisica;
12. Devolver um veículo para pessoa juridica;
13. Gerar um comprovante com todos os dados do aluguel (aberto para o grupo decidir o que vai ser demonstrado);
14. Gerar um comprovante com todos os dados da devolução (aberto para o grupo decidir o que vai ser demonstrado)