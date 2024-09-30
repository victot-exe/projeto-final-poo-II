#   class Cliente{}

Essa classe é responsável para representar as informações de um cliente que alugará um veículo. A instância dessa classe irá conter os dados como nome,
documentos de identificação e informações de contato. Ela é um dos modelos de dados que será utilizado no processo de aluguel. 

##  Class ClienteRepositoryInMemoryImpl{}
Esse é o repositório que armazenará os dados em memória, simulando um banco de dados. A classe gerencia as operações de CRUD (criar, ler, atualizar e excluir).
Ela fornece métodos como:
*   Salvar: Adiciona um novo cliente à lista de clientes em memória.
* Buscar: Retorna uma instância de Cliente com base no documento, ou retornar uma mensagem informando que o cliente não foi encontrado.
* atualizar: Atualiza as informações de um cliente existente.
* Remover: Remove um cliente da lista de clientes com base no documento. 