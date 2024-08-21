package Exercicios7;

public class Carro {
    int numCarro;
    String nomePiloto;
    private float velocidadeMaxima;
    private float velocidadeMinima;
    private boolean carroLigado;

    public Carro(int numCarro, String nomePiloto, float velocidadeMaxima, float velocidadeMinima) {
        this.numCarro = numCarro;
        this.nomePiloto = nomePiloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeMinima = velocidadeMinima;
    }


    /*-----Gets-----*/


    public int getNumCarro(){
        return numCarro;
    }
    public String getNomePiloto(){
        return nomePiloto;
    }
    public float getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    public float getVelocidadeMinima(){
        return velocidadeMinima;
    }
    public boolean getCarroLigado(){
        return carroLigado;
    }

    /*-----Sets-----*/

    public void setNumCarro(int numCarro){
        this.numCarro = 9;
    }

    public void setNomePiloto(String nomePiloto){
        this.nomePiloto = "Maicon";
    }

    public void setVelocidadeMaxima(float velocidadeMaxima){
        this.velocidadeMaxima = 200;
    }
    public void setVelocidadeMinima(float velocidadeMinima){
        this.velocidadeMinima = 50;
    }



    /*-----Metodos-----*/


    public void carro(){
        System.out.println(getNumCarro());
        System.out.println(getNomePiloto());
    }

    public void acelerar(){
        if(getCarroLigado() == true && getVelocidadeMinima() == 0){

        }
    }

    public void parar(){

    }

    public void frear(){

    }
    public void desligar(boolean carroLigado){
        if (!carroLigado){
            System.out.println("Carro Desligado");
        }
    }

    public void ligar(){

    }

}
