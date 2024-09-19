package br.edu.g2.locacaoDeVeiculos.model.veiculo;

public class VeiculoFactory {

    public static Veiculo newVeiculo(VeiculoDTO veiculoDTO) {

        return switch (veiculoDTO.tipo()){
            case 1 -> new Veiculo(veiculoDTO.placa(), 100.00);
            case 2 -> new Veiculo(veiculoDTO.placa(), 150.00);
            case 3 -> new Veiculo(veiculoDTO.placa(), 200.00);
            default -> throw new IllegalArgumentException("Tipo de veiculo inválido.");
        };
    }
}
