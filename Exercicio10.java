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
Descritivo:  Escreva um programa que ordene um array de números em ordem crescente.
************************************************************************************************************/

package programa;

public class Exercicio10 { // classe principal
	
	public static void main(String[] args) { // inicia o programa
		
		int[] numeros = {2, 9, 0, 20, 18, 1, 8}; // numeros do array
		
		for (int i = 0; i < numeros.length; i++) { // percorre o laço
			
			for (int j = i + 1; j < numeros.length; j++) { // percorre o laço pra comparar com os próximos números
				
				if (numeros[i] > numeros[j]) { // verifica se o número é maior que o próximo
					
					int temp = numeros[i]; // variável temporária pra troca
					numeros[i] = numeros[j]; // troca a posição i pelo j
					numeros[j] = temp; // troca a posição do j pela variável temporaria
				}
			}
		}
		
		System.out.println("Em ordem crescente: "); // mostra o resultado
		
		for (int i = 0; i < numeros.length; i++) { // coloca os números ordenados
			System.out.println(numeros[i]); // imprime os números ordenados
		}
		
	}
}
