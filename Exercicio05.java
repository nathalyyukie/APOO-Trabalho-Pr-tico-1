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
Descritivo:  Escreva um programa que exiba apenas os números pares de 1 a 20.
**********************************************************************************************/

package programa;

public class Exercicio05 {//Cria a class main/principal
	
	public static void main(String[] args) //cria o construtor
		
		for (int i = 1; i <= 20; i++) {//inicia o for para contar do 1 ao 20
			
			if (i % 2 == 0) { //cria um SE para filtrar apenas os numeros pares 
				System.out.println(i);//Printa os numeros pares
			}
		}
	}

}
