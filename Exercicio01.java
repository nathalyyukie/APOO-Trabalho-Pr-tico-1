/*
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

Descritivo: Escreva um programa que receba dois números inteiros e exiba a soma deles.
*/	

import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

	public class Exercicio01 {

	    public static void main(String[] args) {

	        // Cria um objeto Scanner para receber dados digitados pelo usuário
	        Scanner entrada = new Scanner(System.in);

	        // Declara as variáveis
	        int numero1;
	        int numero2;
	        int soma;

	        // Pede o primeiro número
	        System.out.println("Digite o primeiro número:");
	        numero1 = entrada.nextInt(); // Lê o número digitado

	        // Pede o segundo número
	        System.out.println("Digite o segundo número:");
	        numero2 = entrada.nextInt(); // Lê o número digitado

	        // Faz a soma dos dois números
	        soma = numero1 + numero2;

	        // Mostra o resultado na tela
	        System.out.println("A soma é: " + soma);

	    }
	}