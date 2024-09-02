package Exercicios9;

public class Main {
    public static void main(String[] args) {
        Funcionario  funcionario1 = new Funcionario("joao", 44, 1500);
        Funcionario  funcionario2 = new Funcionario("pablo", 50, 2500);

        funcionario1.hrsTrabalhadasMes();
        funcionario1.salarioHrs();
        funcionario1.salarioTotal();

        funcionario2.hrsTrabalhadasMes();
        funcionario2.salarioHrs();
        funcionario2.salarioTotal();
    }
}
