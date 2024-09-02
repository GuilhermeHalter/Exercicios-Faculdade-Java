package Exercicio02;

public class PessoaFisica extends Clientes{
    private String cpf;

    public PessoaFisica(String nome,String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                "nome='" + nome + '\'' +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
