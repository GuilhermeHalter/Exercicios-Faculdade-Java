package Exercicio01;

public abstract class Professores {
    protected String nome;
    protected String titulacao;
    private int horaTrabalho;
    private float valorHoraTitulacao;

    public Professores(String nome, String titulacao, int horaTrabalho) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.horaTrabalho = horaTrabalho;
        if(getTitulacao().equalsIgnoreCase("Especializacao") ){
            this.valorHoraTitulacao = 45;
        } else if (getTitulacao().equalsIgnoreCase("Mestrado") ) {
            this.valorHoraTitulacao = 55;
        } else if (getTitulacao().equalsIgnoreCase("Doutorado") ) {
            this.valorHoraTitulacao = 65;
        }else{
            this.valorHoraTitulacao = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoraTrabalho() {
        return horaTrabalho;
    }

    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public float getValorHoraTitulacao() {
        return valorHoraTitulacao;
    }

    public void obterDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Titulacao: " + getTitulacao());
        System.out.println("ValorHoraTitulacao: " + getValorHoraTitulacao());
    }

}
