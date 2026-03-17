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
Descritivo:  Escreva um programa que solicite um número inteiro e exiba sua tabuada de 1 a 10
**********************************************************************************************/

import java.util.Scanner;//importa a biblioteca do scanner

public class exercicio14 {//inicia a classe principal
    public static void main(String[] args) {//cria o construtor
        Scanner scanner = new Scanner(System.in);//cria o construtor

        // Solicita o número ao usuário
        System.out.print("Digite um número inteiro: ");//Solicita o numero para o usuario
        int numero = scanner.nextInt();//aramazena o valor escolhido dentro da variavel "numero"

        // Exibe a tabuada de 1 a 10
        System.out.println("Tabuada do " + numero + ":");//printa na tela qual foi o numero escolhido
        for (int i = 1; i <= 10; i++) { //cria um loop do 1 ao 10 para fazer a multplicação 
            System.out.println(numero + " x " + i + " = " + (numero * i));//printa na tela o resultado da tabuada escolhida
        }

        scanner.close();//fecha o scanner
    }
}
