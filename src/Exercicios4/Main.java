package Exercicios4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto produt1 = new Produto();
        Produto produt2 = new Produto();

        produt1.nomeProduto = "Arroz";
        produt1.descrProduto = "Parbolizado tipo 1";
        produt1.dataFabricacao = LocalDate.of(2024, 9, 10);

        produt2.nomeProduto = "Bebida";
        produt2.descrProduto = "Parbolizado tipo 2";
        produt2.dataFabricacao = LocalDate.of(2024, 11, 12);

        System.out.println(produt1);
        System.out.println(produt2);

    }
}
