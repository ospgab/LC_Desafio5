/*
    Criar um programa que converta moedas. Dado um número limitado de conversões:
    USD - AUD: 1.44
    USD - BRL: 5.15
    BRL - EUR: 0.18
    EUR - GBP: 0.86
Encontre a conversão para outras combinações não listadas:
 */


public class Main {
    public static void main(String[] args) {
        Conversao conv1 = new Conversao(1.44, 5.15, 0.18,0.86);
        conv1.converte("GBP - USD");
        conv1.converte("EUR - USD");
        conv1.converte("GBP - BRL");

    }
}