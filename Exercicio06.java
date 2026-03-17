/************************************************************************************************************
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

Descritivo: Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os
números.
**************************************************************************************************************/

import java.util.Scanner;//importa a biblioteca do scanner

public class Exercicio06 {//cria a class main/principal

    public static void main(String[] args) {//cria o construtor

        Scanner entrada = new Scanner(System.in);//cria o scanner

        // cria um array para guardar 5 números
        int[] numeros = new int[5];

        // lê os 5 números do usuário
        for (int i = 0; i < 5; i++) {//solicita 5 numero para o usuario usando um loop
            System.out.println("Digite um número:");
            numeros[i] = entrada.nextInt();//armazena os numeros dentro de cada casa do array
        }

        // mostra os números digitados
        System.out.println("Números digitados:");

        for (int i = 0; i < 5; i++) {//Criado um loop para printar os numeros do array.
            System.out.println(numeros[i]);
        }

    }
}
