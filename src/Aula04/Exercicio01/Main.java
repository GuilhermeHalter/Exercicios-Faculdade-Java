package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do professor: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do professor: ");
        int idade = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite as horas de trabalho do Professor: ");
        int horasTrabalho = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite a titulacao do professor: (Especializacao, Mestrado ou Doutorado) ");
        String titulacao = sc.nextLine();

        ProfessorHorista professor1 = new ProfessorHorista(nome, titulacao, horasTrabalho);

        professor1.obterDados();
        professor1.calcularSalario();

    }
}
