package Exercicios8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reserva reserva1 = new Reserva();

        System.out.println("Qual o tipo de reservista ? (Estudante, Professor ou Comunidade)");
        String tipo = scanner.nextLine();

        reserva1.setReservista(tipo);
        reserva1.validacao();

    }
}
