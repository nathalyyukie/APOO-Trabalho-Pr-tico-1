package programa;

// importa a classe Scanner pra ler dados do teclado
import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		
		String[] palavras = frase.split(" ");
		
		int quantidade = palavras.length;
		
		System.out.println("Quantidade de palavras: " + quantidade);
		
		sc.close();
	}

}
