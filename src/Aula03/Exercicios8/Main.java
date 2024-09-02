package Exercicios8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reserva reserva1 = new Reserva();

        System.out.println("Qual o tipo de reservista ? (Estudante, Professor ou Comunidade)");
        String tipo = scanner.nextLine();

        reserva1.setReservista(tipo);
        // reserva1.validacao();

        if(reserva1.getReservista().equalsIgnoreCase("estudante")){
             reserva1.pessoa();
        } else if (reserva1.getReservista().equalsIgnoreCase("professor")) {
            reserva1.professor();
        } else if (reserva1.getReservista().equalsIgnoreCase("comunidade")) {
            reserva1.comunidade();
        }else {
            System.out.println("Nao pode reservar livros");
        }

    }
}
