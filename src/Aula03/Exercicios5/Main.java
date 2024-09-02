package Exercicios5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Martelo", "Martelar", LocalDate.of(2024,2,10) );
        Produto produto2 = new Produto("Ford", "Ford", LocalDate.of(2024,2,10) );

        System.out.println(produto1.getNomeProduto());
        System.out.println(produto1.getDescricaoProduto());
        System.out.println(produto1.getDataFabricacao());

        System.out.println(produto2.getNomeProduto());
        System.out.println(produto2.getDescricaoProduto());
        System.out.println(produto2.getDataFabricacao());


    }
}
