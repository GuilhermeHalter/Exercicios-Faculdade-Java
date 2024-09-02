package Exercicio02;

public class Governo extends Clientes{
    private String registroMunicipal;

    public Governo(String nome, String endereco, String registroMunicipal){
        super(nome, endereco);
        this.registroMunicipal = registroMunicipal;
    }

    public String getRegistroMunicipal(){
        return registroMunicipal;
    }

    @Override
    public String toString() {
        return "Governo{" +
                "registroMunicipal='" + registroMunicipal + '\'' +
                "nome='" + nome + '\'' +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
