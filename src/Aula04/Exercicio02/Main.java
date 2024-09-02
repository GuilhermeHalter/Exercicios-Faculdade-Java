package Exercicio02;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("Eduardo", "Rua tal", "000.000.000-00");
        PessoaJuridica pessoa2 = new PessoaJuridica("Douglas", "Rua tal tal", "000.000.000-02");
        Governo pessoa3 = new Governo("Exemplo","Rua dita cuja", "03");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}
