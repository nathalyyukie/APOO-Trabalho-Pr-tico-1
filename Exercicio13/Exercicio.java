package Exercicio13;
// O nome do arquivo deve ser exatamente Main.java
public class Exercicio {

    public static void main(String[] args) {
        
        // Instancia o objeto Carro usando a interface como referência (polimorfismo)
        Veiculo meuCarro = new Carro();

        // Executa os métodos
        System.out.println("--- Testando o Carro ---");
        meuCarro.acelerar();
        meuCarro.frear();
        
    }
}