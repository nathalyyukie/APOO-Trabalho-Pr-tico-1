/******************************************************************************
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
Descritivo: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário
*******************************************************************************/

// Importa a classe Scanner para ler a entrada de dados do usuário
import java.util.Scanner;

public class Exercício8{
    public static void main(String[] args) {
        
        // Instancia o Scanner para ler a entrada do console (System.in)
        Scanner ler = new Scanner(System.in);

        // Exibe uma instrução para o usuário no console
        System.out.print("Digite uma palavra ou frase: ");
        
        // Lê a linha inteira digitada pelo usuário e armazena na variável 'texto'
        String texto = ler.nextLine();
        
        // Variável int para ser o contador
        int contador = 0;

        // Converte o texto para minúsculo.
        texto = texto.toLowerCase();

        // Inicia um for que percorre cada posição (índice) da string, do 0 até o tamanho total
        for (int i = 0; i < texto.length(); i++) {
            
            // Verifica o char que está na posição atual 'i' do loop
            char caractere = texto.charAt(i);

            // Verifica se o caractere atual é igual a qualquer uma das vogais
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                // Se for uma vogal, incrementa o valor da variável contador em +1
                contador++;
            }
        } // Fim do laço de repetição

        System.out.println("O número total de vogais é: " + contador);

        // Fecha o Scanner para liberar memória
        ler.close();
    } 
} 
