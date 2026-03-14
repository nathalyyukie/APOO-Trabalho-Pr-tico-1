// Import que cria números aleatórios.
import java.util.Random;
import java.util.Scanner;

//Cria a classe principal do seu programa. "O nome aqui deve ser igual ao do arquivo salvo".
public class Exercicio17{

    //O Java sempre procura o método "main" para saber por onde começar a rodar o código.
    public static void main (String[] args){
        // Inicializa o leitor de entrada e o gerador de números aleatórios
        Scanner scanner = new Scanner(System.in);
        //Cria o objeto random que gera números aleatórios.
        Random random  = new Random();

        //O computador sorteia um número entre 1 e 100, e definição de variáveis.
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        boolean acertou = false;


        //Printando na tela mensagens para o usuário
        System.out.println("Welcome to desafio de Adivinhação Rapaz");
        System.out.println("Acabei de pensar em um número de 1 a 100, tenta acertar qual é");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // Inicia o loop, enquanto o jogador não tiver acertado, repete tudo que está aqui dentro.
        while (!acertou){
            // Pede ao usuário um palpite de número.
            System.out.print("Digite aqui seu palpite: ");


             // Tenta executar o bloco de código abaixo. Se der algum erro (como o usuário digitar uma letra), ele aborta essa parte e pula para o "catch".
            try{
                // Fica esperando o usuário digitar algo e apertar 'Enter'. Pega esse texto e guarda na variável 'entrada'.
                String entrada = scanner.nextLine();
                // Pega o texto da 'entrada' e transforma (converte) em um número de verdade int. Guarda na variável 'palpite'.
                int palpite = Integer.parseInt(entrada);
                // A cada tentativa aumenta o contador de tentativas em 1.
                tentativas++;

                // Pergunta: o número que o usuário chutou é exatamente igual (==) ao número sorteado?
                if (palpite == numeroSecreto) {
                    // Se for igual, muda a nossa para verdadeiro. Isso vai fazer o loop 'while' parar.
                    acertou = true;
                    // Imprime a mensagem de vitória, misturando texto com o número secreto e a quantidade de tentativas.
                    System.out.println("\nParabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas!");

                // Se não acertou, pergunta: o chute foi menor (<) que o número secreto?
                } else if (palpite < numeroSecreto) {
                     // Se o chute foi menor, avisa o jogador que o número escondido é maior.
                    System.out.println("Dica: O número secreto é MAIOR.");
                    
                // Se não foi igual e não foi menor, a única opção que sobra é que o chute foi maior que o número secreto.
                } else {
                    // Avisa o jogador que o número escondido é menor.
                    System.out.println("Dica: O número secreto é MENOR.");
                }

            // Se o programa tentou transformar o texto em número lá no bloco "try" e deu erro (NumberFormatException), ele cai aqui.
            }catch (NumberFormatException e) {
                // Avisa o usuário que ele digitou algo inválido (como letras ou símbolos) sem deixar o programa fechar (crashar).
                System.out.println("Erro: Por favor, digite apenas números inteiros.");
            } // O try/catch termina aqui
            
        }// Fim da repetição (while). Se 'acertou' ainda for falso, ele volta lá para cima e pede outro palpite.

        // Desliga o executdor do teclado.
        scanner.close();

    }// Fim do método main
}// Fim da classe JogodeAdivinhacao