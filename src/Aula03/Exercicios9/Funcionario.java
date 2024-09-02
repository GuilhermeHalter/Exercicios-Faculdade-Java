package Exercicios9;

public class Funcionario {
    private String nome;
    private int hrsTrabalhadas;
    private int salario;

    public Funcionario(String nome, int hrsTrabalhadas, int salario) {
        this.nome = nome;
        this.hrsTrabalhadas = hrsTrabalhadas;
        this.salario = salario;
    }

    /*---Gets e Sets---*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHrsTrabalhadas() {
        return hrsTrabalhadas;
    }

    public void setHrsTrabalhadas(int hrsTrabalhadas) {
        this.hrsTrabalhadas = hrsTrabalhadas;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    /*---Metodos---*/

    public int hrsTrabalhadasMes(){
        int horas = getHrsTrabalhadas()*5;
        System.out.println(horas);
        return horas;
    }

    public void salarioHrs(){
        int salarioHoras = getSalario()/hrsTrabalhadasMes();
        System.out.println(salarioHoras);
    }

    public void salarioTotal(){
        double acrescimo = 0.05;
        if(getHrsTrabalhadas()>40){
            double salarioAcrescimo = getSalario() + getSalario() * acrescimo;
            System.out.println(salarioAcrescimo);
        }
    }

}
