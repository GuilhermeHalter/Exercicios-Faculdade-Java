package Exercicios3;

public class Main {
    public static void main(String[] args) {
        int media;

        Tabelas tabela = new Tabelas(13500, 23400,19000);
        media = (tabela.janeiro + tabela.fevereiro + tabela.marco)/3;

        System.out.println(tabela.janeiro + tabela.fevereiro + tabela.marco);
        System.out.println(media);
    }
}
