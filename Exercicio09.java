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
Descritivo:  Criar uma calculadora simples de quatro operações (+ - * /). 
**********************************************************************************************/

import java.util.Scanner;//importa a biblioteca do scanner

public class exercicio09 {//classe principal sendo criada
    public static void main(String[] args) {//cria o construtor
        Scanner scanner = new Scanner(System.in);//cria o scanner

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");//Solicita para o usuario o primeiro numero
        double num1 = scanner.nextDouble();//Armazena o primeiro numero na variavel num1

        System.out.print("Digite o segundo número: ");//Solicita para o usuario o primerio numero   
        double num2 = scanner.nextDouble();//Armazena o numero na variavel num2

        // Escolha da operação
        System.out.println("Escolha a operação (+, -, *, /): "); //Solicita para o usuario qual vai ser a operação
        char operacao = scanner.next().charAt(0);//Armazena o valor na variavel operação

        double resultado;//declara a variavel resultado

        // Estrutura de decisão para cada operação
        switch (operacao) {//inicia a case para saber qual que o usuario escolher
            case '+'://soma
                resultado = num1 + num2;//calculo com a operação escolhida 
                System.out.println("Resultado: " + resultado);//printa o resultado do calculo
                break;//acaba a case caso seja essa opção
            case '-'://subtração
                resultado = num1 - num2;//calculo com a operação escolhida 
                System.out.println("Resultado: " + resultado);//printa o resultado do calculo
                break;//acaba a case caso seja essa opção
            case '*'://multiplicação
                resultado = num1 * num2;//calculo com a operação escolhida 
                System.out.println("Resultado: " + resultado);//printa o resultado do calculo
                break;//acaba a case caso seja essa opção
            case '/'://divisão
                if (num2 != 0) {
                    resultado = num1 / num2;//calculo com a operação escolhida 
                    System.out.println("Resultado: " + resultado);//printa o resultado do calculo
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");//erro pq o usuario escolheu divisão e o numero 0
                }
                break;//acaba a case caso seja essa opção
            default:
                System.out.println("Operação inválida.");//caso não seja nenhuma das opção validas, avisa para o usuario que está invalido
        }

        scanner.close();//fecha o scanner
    }
}
