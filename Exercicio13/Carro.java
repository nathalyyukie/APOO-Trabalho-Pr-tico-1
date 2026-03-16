package Exercicio13;

// O nome do arquivo deve ser exatamente Carro.java
public class Carro implements Veiculo {

    // Implementação obrigatória do método acelerar
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando via pedal...");
    }

    // Implementação obrigatória do método frear
    @Override
    public void frear() {
        System.out.println("O carro está acionando os freios ABS.");
    }
}