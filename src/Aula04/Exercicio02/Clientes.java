package Exercicio02;

public class Clientes {
    protected String nome;
    protected String endereco;

    public Clientes(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
