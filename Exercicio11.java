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

Descritivo: Programa que define uma classe Pessoa com atributos nome e idade, e metodos para exibir esses atributos.
*/

import java.util.Scanner;

// Classe principal do programa
public class Exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Cria um objeto Pessoa
        Pessoa pessoa = new Pessoa();

        // Pede os dados do usuário
        System.out.println("Digite o nome da pessoa:");
        pessoa.nome = entrada.nextLine();

        System.out.println("Digite a idade da pessoa:");
        pessoa.idade = entrada.nextInt();

        // Exibe os dados da pessoa
        pessoa.exibirDados();
    }
}

// Classe Pessoa
class Pessoa {

    // Atributos
    String nome;
    int idade;

    // Método para exibir os dados da pessoa
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}