/******************************************************************************
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
Descritivo: Escreva um programa que calcule a soma de dois números
*******************************************************************************/

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
