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
Data: 05 de Março de 2026
Descritivo: Desenvolva um programa que conte quantas palavras existem em uma string fornecida pelo usuário.
************************************************************************************************************/

package programa;

// importa a classe Scanner pra ler dados do teclado
import java.util.Scanner;

public class Exercicio18 { // classe principal do programa
	
	public static void main(String[] args) { // início do programa
		
		Scanner sc = new Scanner(System.in); // cria um objeto Scanner para ler o que o usuário digitar
		
		System.out.print("Digite uma frase: "); // pede pro usuário digitar uma frase
		String frase = sc.nextLine(); //lê a frase digitada
		
		String[] palavras = frase.split(" "); // separa a frase em palavras usando o espaço como separador
		
		int quantidade = palavras.length; //conta quantas palavras existem
		
		System.out.println("Quantidade de palavras: " + quantidade); // mostra o resultado na tela
		
		sc.close(); // fecha o scanner
	}

}
