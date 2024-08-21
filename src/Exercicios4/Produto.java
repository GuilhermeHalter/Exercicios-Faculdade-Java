package Exercicios4;
import java.time.LocalDate;

public class Produto {
     String nomeProduto, descrProduto;
     LocalDate dataFabricacao;

     public Produto(){

     }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", descrProduto='" + descrProduto + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                '}';
    }
}
