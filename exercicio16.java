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
Descritivo:  Escreva um programa que valide uma senha de acordo com os seguintes critérios
**********************************************************************************************/


import java.util.Scanner; //Importa a biblioteca do scanner

public class exercicio16 { //classe principal
    public static void main(String[] args) { // Iniciando construtor
        Scanner sc = new Scanner(System.in); // Cria o objeto do scanner

         String senha; //Declara variavel de senha do tipo string
        boolean senhaValida = false; //Declara variavel para validar a senha do tipo boolean e coloca e inicia ela em false

        while (!senhaValida) { //Enquanto senha não for valida ele continuara rodando o programa
            System.out.print("Cadastre uma senha: "); //Pedi para o usuario cadastrar a senha 
            senha = sc.nextLine(); //Le oque o usuario escreveu

            boolean temMaiuscula = false; //Declara variavel para armazenar e saber se o numero é mainusculo 
            boolean temMinuscula = false; //Declara variavel para armazenar e saber se o numero é minusculo 
            boolean temNumero = false; //Declara variavel para armazenar 
            boolean tamanhoOk = senha.length() >= 8; //Verifica se é maior que 8 ou igual 

            for (char c : senha.toCharArray()) { // Cria o for e determina que ele va rodar a quantidade de caracter
                if (Character.isUpperCase(c)) temMaiuscula = true; //Verifica se tem letra maiuscula se sim ele vai deixar em true
                if (Character.isLowerCase(c)) temMinuscula = true; //Verifica se tem letra minuscula se sim ele vai deixar em true
                if (Character.isDigit(c)) temNumero = true; //Verifica se tem numero
            }
            
            if (!tamanhoOk || !temMaiuscula || !temMinuscula || !temNumero) { //Cria uma condição para verificar se alguma das varieaveis está true, se alguma falhar a condição inteira falha.
                System.out.println("Senha invalida! Verifique os requisitos:"); //Fala para o usuario verificar a senha que ele digitiou
                if (!tamanhoOk) System.out.println("- Deve ter pelo menos 8 caracteres"); //Faltou completar a quatidade de caracter
                if (!temMaiuscula) System.out.println("- Deve ter pelo menos uma letra MAIUSCULA"); //Faltou letra maiuscula
                if (!temMinuscula) System.out.println("- Deve ter pelo menos uma letra minuscula"); //Faltou letra minuscula
                if (!temNumero) System.out.println("- Deve ter pelo menos um numero");//Faltou numero
                System.out.println();
            } else { //Caso tudo esteja dentro das condições essa parte será executado
                System.out.println("Senha cadastrada com sucesso!"); //Avisa que a senha foi cadastrada pq tudo estava dentro dos conformes
                senhaValida = true; //troca o valor da variavel para true para confirmar que foi um sucesso
            }
        }

        }
    }