/**
 * @(#)LocadoraVeiculos.java
 *
 * @ Samuel Kleber Vieira Silva
 * RA 12123150
 * @version 1.00 2025/3/26
 */

import java.util.Scanner;

public class LocadoraVeiculos {
    public static void main(String[] args) {
        // Criando o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a capacidade do tanque (em litros)
        System.out.print("Digite a capacidade do tanque (em litros): ");
        double capacidadeTanque = scanner.nextDouble();
        
        // Solicita a quantidade de litros abastecidos
        System.out.print("Digite a quantidade de litros abastecidos: ");
        double litrosAbastecidos = scanner.nextDouble();
        
        // Solicita a quilometragem percorrida desde o último abastecimento
        System.out.print("Digite a quilometragem percorrida desde o último abastecimento (em km): ");
        double quilometragem = scanner.nextDouble();
        
        // Calcula o Consumo Médio (CM)
        double consumoMedio = quilometragem / litrosAbastecidos;
        
        // Calcula a autonomia restante
        double autonomia = (capacidadeTanque - litrosAbastecidos) * (quilometragem / litrosAbastecidos);
        
        // Exibe o resultado
        System.out.printf("O consumo médio do veículo é: %.2f km/l\n", consumoMedio);
        System.out.printf("A autonomia restante do veículo é: %.2f km\n", autonomia);
        
        // Fecha o scanner
        scanner.close();
    }
}
