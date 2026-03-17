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

public class exercicio07{
    public static void main(String[] args) {
        // Exemplo de array de inteiros
        int[] numeros = {12, 45, 7, 89, 23, 150, 250, 3};

        // Assume que o primeiro elemento é o maior inicialmente
        int maior = numeros[0];

        // Percorre o array comparando cada elemento
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // Exibe o resultado
        System.out.println("O maior número no array é: " + maior);
    }
}
