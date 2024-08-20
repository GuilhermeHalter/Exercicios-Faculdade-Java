package Exercicios3;

public class Tabelas {
    int janeiro;
    int fevereiro;
    int marco;

    public Tabelas () {

    }

    public int total(int janeiro, int fevereiro, int marco){
        return janeiro + fevereiro + marco;
    }

    public int mediaGastos(int janeiro, int fevereiro, int marco){
        return (janeiro + fevereiro + marco)/3;
    }
}
