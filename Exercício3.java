// Importa a classe Scanner para ler a entrada de dados do usuário
import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) { 
        
        // Instancia um objeto chamado 'ler' para capturar o que for digitado no console (System.in)
        Scanner ler = new Scanner(System.in); 

        // Exibe uma mensagem decorativa no console
        System.out.println("--- Calculadora de Média ---"); 


        // Solicita ao usuário a primeira nota
        System.out.print("Digite a primeira nota: "); 

        // Lê o valor decimal digitado e o armazena na variável 'nota1'
        double nota1 = ler.nextDouble(); 

        // Solicita ao usuário a segunda nota
        System.out.print("Digite a segunda nota: "); 

        // Lê o valor decimal digitado e o armazena na variável 'nota2'
        double nota2 = ler.nextDouble(); 

        // Solicita ao usuário a terceira nota
        System.out.print("Digite a terceira nota: "); 

        // Lê o valor decimal digitado e o armazena na variável 'nota3'
        double nota3 = ler.nextDouble(); 

        // Soma as três notas (entre parênteses para garantir prioridade) e divide por 3.0
        double media = (nota1 + nota2 + nota3) / 3; 

        // Exibe a média final. O '%.2f' formata para 2 casas decimais e '%n' pula uma linha
        System.out.printf("A média final é: %.2f%n", media); 

        // Estrutura condicional: se a média for maior ou igual a 7...
        if (media >= 6.0) { 

            //Imprime que o aluno foi aprovado
            System.out.println("Status: Aprovado!"); 
        } else { 

            // Caso contrário (média menor que 6), imprime que está em recuperação
            System.out.println("Status: Recuperação."); 
        } 

        // Encerra o objeto Scanner para liberar os recursos do sistema operacional
        ler.close(); 
    }
}
