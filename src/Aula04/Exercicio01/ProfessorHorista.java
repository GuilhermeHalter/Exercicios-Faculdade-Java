package Exercicio01;

public class ProfessorHorista extends Professores {

    public ProfessorHorista(String nome, String titulacao, int horaTrabalho) {
        super(nome, titulacao, horaTrabalho);
    }

    public void calcularSalario() {
        if (getHoraTrabalho() < 40){
            System.out.println(getHoraTrabalho() * getValorHoraTitulacao());
        }
    }

}
