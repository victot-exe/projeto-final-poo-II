# `public class Aluguel{}`

A classe aluguel é a classe responsável por conter os dados de quando alguém aluga um carro.  
O indicado é que quando for criar uma nova instância da mesma utilizar a classe `AluguelService{}`
## `public class AluguelServiceImpl{}`
Esta é a classe responsável por criar novas instâncias de aluguel, ela pega os dados responsáveis para se criar, tendo duas opções do método alugar:
* A primeira é onde não recebemos uma data e se entende que o carro está sendo alugado agora, ela define a Data e hora atual e chama a segunda forma do método;
* A segunda forma do método alugar tem a opção de escolher uma data para início do aluguel, ela verifica se o veículo escolhido está disponível e retorna uma instancia de `Aluguel{}` ou gera uma exceção dizendo que o veículo não pode ser alugado pois não está disponível.
