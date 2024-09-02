package Exercicio01;

public class ProfessorMensalista extends Professores {
    public ProfessorMensalista(String nome, String titulacao, int horaTrabalho) {
        super(nome, titulacao, horaTrabalho);
    }

    public void calcularSalario() {
        if (getHoraTrabalho() == 40){
            System.out.println(getHoraTrabalho() * getValorHoraTitulacao());
        } else {
            System.out.println("O professor esta trabalhando de mais");

        }
    }
}
