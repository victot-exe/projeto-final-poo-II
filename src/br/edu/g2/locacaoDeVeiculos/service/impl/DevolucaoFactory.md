# `public class DevolucaoFactory{}`

Como o próprio nome já diz ela é uma fábrica de instancias de `public record Devolucao` atravéz do método `devolverVeiculo(Aluguel alguel)`

* Este método recebe uma instância de `Aluguel{}`, verifica o tipo do cliente para saber qual tipo de desconto aplicar e chama a implementação de `DevolucaoService{}` tendo uma para pessoa física e outra para pessoa jurídica

## `public interface DevolucaoServiceBase{}`

É a interface base para implementações dos diferentes tipos de clientes.

