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
Descritivo:  Faça um programa que converta uma temperatura em graus Celsius para Fahrenheit, utilizando a fórmula: 
F = (C × 9/5) + 32
**********************************************************************************************/

import java.util.Scanner;//importa a biblioteca do scanner

public class exercicio04 { //classe principal sendo criada
    public static void main(String[] args) {  //construtor sendo criado
        Scanner sc = new Scanner(System.in); //scanner sendo criado

        // Entrada de dados
        System.out.print("Digite a temperatura em graus Celsius: ");//printa na tela para o usuario pedindo os valores
        double celsius = sc.nextDouble(); //Lê esses valores e armazena dentro da variavel celsius

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32; //Armazena o resultado da conta dentro da variavel fahrenheint

        // Saída de dados
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);//printa na tela o o resultado da transferencia

        sc.close();// fecha o scanner
    }
}
