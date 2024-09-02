package Exercicios1;

public class ExibirMultiplos {
    public static void main(String[] args) {
        int x;
        for(x = 0; x <= 99; x++) {
            if(x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}
