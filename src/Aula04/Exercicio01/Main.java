package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do professor: ");
        String nome = sc.nextLine();


        System.out.println("Digite as horas de trabalho do Professor: ");
        int horasTrabalho = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite a titulacao do professor: (Especializacao, Mestrado ou Doutorado) ");
        String titulacao = sc.nextLine();

        if(horasTrabalho < 40){
            ProfessorHorista professor1 = new ProfessorHorista(nome, titulacao, horasTrabalho);
            professor1.obterDados();
            professor1.calcularSalario();
        }else{
            ProfessorMensalista professor2 = new ProfessorMensalista(nome, titulacao, horasTrabalho);
            professor2.obterDados();
            professor2.calcularSalario();
        }





    }
}
