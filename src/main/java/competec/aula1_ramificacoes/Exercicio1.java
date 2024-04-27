package competec.aula1_ramificacoes;

// O Sr João precisa de um programa para calcular o valor das compras da sua lojinha
// de frutas, que vende apenas três produtos: abacaxi, maçã e pêra;
// As frutas custam R$ 7,30, R$ 2,00 e R$ 3,00, respectivamente;
// 1. Faça um programa que pegue a quantidade de cada fruta comprada e retorne o valor total da compra;

public class Exercicio1 {
    public static void main(String[] args) {
        int abacaxi = 2, maca = 3, pera = 1;

        double precoAbacaxi = 7.3, precoMaca = 2, precoPera = 3;

        double total = (abacaxi * precoAbacaxi) + (maca * precoMaca) + (pera + precoPera);

        System.out.println("Total do valor é: " + total);
    }
}
