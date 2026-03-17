/*********************************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Componentes:
 25169060-2 - Alex Rafael Ferreira
 26010487-2 - Anderson Kauã de Lima de Jesus Trindade
 25177941-2 - Juan Pyerre de Sousa Carvalho
 25181985-2 - Nathaly Yukie Otofuji Honda
 25181898-2 - Pedro Paulo Rodrigues Mardegam
Data: 18 de Março de 2026
Descritivo:  Escreva um programa que encontre o maior número em um array de inteiros
**********************************************************************************************/

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {//inicia o construtor
        Scanner scanner = new Scanner(System.in);//inicia o scanner
        //informações do programa
        System.out.println("=== Identificador de Par ou Ímpar ===");
        System.out.println("Digite números inteiros para verificar.");
        System.out.println("Digite 'S' para encerrar o programa.");

        while (true) {
            System.out.print("Digite um número inteiro (ou 'S' para sair): ");
            String entrada = scanner.nextLine().trim().toUpperCase();

            // Se o usuário digitar "S", encerra o programa
            if (entrada.equals("S")) {
                break;
            }

            // Tenta converter a entrada para número
            try {
                int numero = Integer.parseInt(entrada);

                if (numero % 2 == 0) { //verifica se é par ou impar
                    System.out.println(numero + " é par.");
                } else {
                    System.out.println(numero + " é ímpar.");
                }
            } catch (NumberFormatException e) {// Caso de erro durante o try o catch ativa e executa
                System.out.println("Entrada inválida! Digite apenas números inteiros ou 'S' para sair.");
            }

            System.out.println(); // linha em branco para organizar a saída
        }

        scanner.close();//fecha o scanner
        System.out.println("Programa encerrado!");
    }
}
