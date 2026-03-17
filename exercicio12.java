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
Descritivo:  Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um 
atributo matricula.
**********************************************************************************************/

import java.util.*; // Importa todas as classes do pacote java.util (Scanner, List, ArrayList etc.)

// Classe base
public class exercicio12 { // Define a classe Pessoa
    private String nome; // Atributo privado para armazenar o nome
    private int idade;   // Atributo privado para armazenar a idade

    // Construtor da classe Pessoa
    public exercicio12(String nome, int idade) {
        this.nome = nome; // Inicializa o atributo nome
        this.idade = idade; // Inicializa o atributo idade
    }

    // Método getter para obter o nome
    public String getNome() {
        return nome;
    }

    // Método getter para obter a idade
    public int getIdade() {
        return idade;
    }

    // Método para exibir informações da pessoa
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

// Classe Aluno que herda de Pessoa
class Aluno extends exercicio12 {
    // Construtor da classe Aluno, chama o construtor da superclasse Pessoa
    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    // Sobrescreve o método exibirInfo (mas apenas chama o da superclasse)
    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}

// Classe principal do programa
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria objeto Scanner para ler entradas do usuário
        List<Aluno> alunos = new ArrayList<>();   // Cria uma lista para armazenar objetos Aluno
        int opcao = -1; // Variável para controlar o menu, inicializada com -1

        System.out.println("Bem-vindo ao Sistema de Matrícula!"); // Mensagem inicial

        // Loop principal do menu, continua até o usuário escolher 0 (sair)
        while (opcao != 0) {
            System.out.println("\n=== Menu ==="); // Exibe o menu
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Remover Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            String input = scanner.nextLine(); // Lê a entrada do usuário como String
            try {
                opcao = Integer.parseInt(input); // Tenta converter para número inteiro
            } catch (NumberFormatException e) { // Se não for número válido
                System.out.println("Por favor selecione uma das alternativas");
                continue; // Volta para o início do loop
            }

            // Estrutura switch para tratar cada opção do menu
            switch (opcao) {
                case 1: // Adicionar aluno
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine(); // Lê o nome
                    System.out.print("Digite a idade do aluno: ");
                    input = scanner.nextLine(); // Lê a idade como String
                    try {
                        int idade = Integer.parseInt(input); // Converte idade para inteiro
                        Aluno aluno = new Aluno(nome, idade); // Cria novo objeto Aluno
                        alunos.add(aluno); // Adiciona à lista
                        System.out.println("Aluno '" + nome + "' adicionado com sucesso!");
                    } catch (NumberFormatException e) { // Se idade não for número válido
                        System.out.println("Idade deve ser um numero valido!");
                    }
                    break;

                case 2: // Listar alunos
                    if (alunos.isEmpty()) { // Verifica se lista está vazia
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println("\n=== Lista de Alunos ===");
                        for (int i = 0; i < alunos.size(); i++) { // Percorre lista
                            System.out.print((i + 1) + ". "); // Exibe índice do aluno
                            alunos.get(i).exibirInfo(); // Exibe informações do aluno
                            System.out.println("-------------------"); // Separador
                        }
                    }
                    break;

                case 3: // Remover aluno
                    if (alunos.isEmpty()) { // Verifica se lista está vazia
                        System.out.println("Nenhum aluno para remover.");
                    } else {
                        System.out.println("\n=== Alunos para Remover ===");
                        for (int i = 0; i < alunos.size(); i++) { // Lista todos os alunos
                            System.out.print((i + 1) + ". ");
                            alunos.get(i).exibirInfo();
                        }
                        System.out.print("Digite o numero do aluno a remover: ");
                        input = scanner.nextLine(); // Lê índice do aluno
                        try {
                            int indice = Integer.parseInt(input); // Converte para inteiro
                            if (indice > 0 && indice <= alunos.size()) { // Verifica se índice é válido
                                Aluno removido = alunos.remove(indice - 1); // Remove aluno da lista
                                System.out.println("Aluno '" + removido.getNome() + "' removido com sucesso!");
                            } else {
                                System.out.println("Indice invalido!");
                            }
                        } catch (NumberFormatException e) { // Se índice não for número válido
                            System.out.println("Indice deve ser um numero valido!");
                        }
                    }
                    break;

                case 0: // Sair do programa
                    System.out.println("Obrigado por usar o Sistema de Matrícula. Até logo!");
                    break;

                default: // Caso o usuário digite opção inválida
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close(); // Fecha o Scanner
    }
}


