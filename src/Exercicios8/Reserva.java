package Exercicios8;

public class Reserva {
    private String reservista;
    private int tempoReserva;

    public Reserva() {

    }

    /*-----Get and Set-----*/

    public String getReservista() {
        return reservista;
    }

    public void setReservista(String reservista) {
        this.reservista = reservista;
    }

    public int getTempoReserva() {
        return tempoReserva;
    }

    public void setTempoReserva(int tempoReserva) {
        this.tempoReserva = tempoReserva;
    }

    /*-----Metodos-----*/

    /*public void validacao() {
        if(getReservista().equalsIgnoreCase("estudante")){
            setTempoReserva(5);
            System.out.println("O tempo de reserva dele eh de " + getTempoReserva() + " dias");
        } else if (getReservista().equalsIgnoreCase("professor")) {
            setTempoReserva(3);
            System.out.println("O tempo de reserva dele eh de " + getTempoReserva() + " dias");
        } else if (getReservista().equalsIgnoreCase("comunidade")) {
            setTempoReserva(4);
            System.out.println("O tempo de reserva dele eh de " + getTempoReserva() + " dias");
        }else {
            System.out.println("Nao pode reservar livros");
        }
    }*/

    public void pessoa(){
        setTempoReserva(5);
        System.out.println("O tempo de reserva dele eh de " + getTempoReserva() + " dias");
    }

    public void professor(){
        setTempoReserva(3);
        System.out.println("O tempo de reserva dele eh de " + getTempoReserva() + " dias");
    }

    public void comunidade(){
        setTempoReserva(4);
        System.out.println("O tempo de reserva dele eh de " + getTempoReserva() + " dias");
    }
}
