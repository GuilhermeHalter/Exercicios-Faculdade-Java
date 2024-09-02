package Exercicio02;

public class PessoaJuridica extends Clientes{
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                "nome='" + nome + '\'' +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
