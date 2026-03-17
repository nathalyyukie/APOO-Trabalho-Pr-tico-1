/**********************************************************************************************************
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
Descritivo: Implemente uma calculadora de Índice de Massa Corporal (IMC) que receba peso (kg) e altura (m) e
exiba o resultado com a classificação correspondente (ex: abaixo do peso, normal, etc.).
************************************************************************************************************/

package programa;

import java.util.Scanner;

public class Exercicio15 { // classe principal
	
	public static void main(String[] args) { // início do programa
		
		Scanner sc = new Scanner(System.in); // leitor de dados
		
		System.out.println("Digite seu peso em kg: "); // pede o peso
		double peso = sc.nextDouble();
		
		System.out.println("Digite sua altura em m: "); // pede a altura
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);  // calcula o IMC
		
		System.out.println("Seu IMC e: " + imc); // mostra o valor do IMC
		
		// analisa em qual categoria a pessoa se encaixa
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Peso normal");
		} else if (imc < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");
		}
		
		sc.close(); // encerra o Scanner
	}

}
