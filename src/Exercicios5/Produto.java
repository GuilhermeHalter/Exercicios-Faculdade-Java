package Exercicios5;

import java.time.LocalDate;

public class Produto {
    private String nomeProduto;
    private String descricaoProduto;
    private LocalDate dataFabricacao;

    public Produto(String nomeProduto, String descricaoProduto, LocalDate dataFabricacao) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.dataFabricacao = dataFabricacao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}