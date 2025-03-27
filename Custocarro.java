/**
 * @(#)CustoCarro.java
 *  @ Samuel Kleber Vieira Silva
 * RA 12123150
 * @version 1.00 2025/3/26
 */

import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        // Criando o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o custo de fábrica do carro
        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();
        
        // Calcula o valor pago ao distribuidor (12% do custo de fábrica)
        double valorDistribuidor = custoFabrica * 0.12;
        
        // Calcula o valor dos impostos (45% do custo de fábrica)
        double valorImpostos = custoFabrica * 0.45;
        
        // Calcula o custo total ao consumidor
        double custoTotal = custoFabrica + valorDistribuidor + valorImpostos;
        
        // Exibe os resultados
        System.out.printf("Valor pago ao distribuidor: R$ %.2f\n", valorDistribuidor);
        System.out.printf("Valor dos impostos: R$ %.2f\n", valorImpostos);
        System.out.printf("Custo total ao consumidor: R$ %.2f\n", custoTotal);
        
        // Fecha o scanner
        scanner.close();
    }
}
