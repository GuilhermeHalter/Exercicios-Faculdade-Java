package Exercicios7;

public class Carro {
    int numCarro;
    String nomePiloto;
    private float velocidadeMaxima;
    private float velocidadeMinima;
    private boolean carroLigado;

    public Carro(int numCarro, String nomePiloto, float velocidadeMaxima, float velocidadeMinima, boolean carroLigado) {
        this.numCarro = numCarro;
        this.nomePiloto = nomePiloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeMinima = velocidadeMinima;
        this.carroLigado = carroLigado;
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
        this.numCarro = numCarro;
    }

    public void setNomePiloto(String nomePiloto){
        this.nomePiloto = nomePiloto;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void setVelocidadeMinima(float velocidadeMinima){
        this.velocidadeMinima = velocidadeMinima;
    }

    public void setCarroLigado(boolean carroLigado){
        this.carroLigado = carroLigado;
    }

    /*-----Metodos-----*/

    public void carro(){
        System.out.println(getNumCarro());
        System.out.println(getNomePiloto());
    }

    public void acelerar(){
        if(carroLigado == true && velocidadeMinima == 0){
            setVelocidadeMinima(10);
            System.out.println("O carro acelerou para a velocidade " + getVelocidadeMinima());
        }
    }

    public void parar(){
        if(velocidadeMinima != 0 && velocidadeMaxima != 0 && carroLigado == true){
            setVelocidadeMaxima(0);
            System.out.println("O carro esta parado e a velocidade eh de " + getVelocidadeMaxima());
        }
    }

    public void frear(){
        if(carroLigado == true && velocidadeMinima != 0 && velocidadeMaxima > 0){
             float var = (getVelocidadeMaxima() * 30) / 100;
             setVelocidadeMaxima(var);
             System.out.println("O carro freou e a velocidade atual eh de " + getVelocidadeMaxima());
        }
    }

    public void desligar(){
        if (carroLigado == true && velocidadeMinima == 0 && velocidadeMaxima == 0){
            setCarroLigado(false);
            System.out.println("O carro esta desligado " + getCarroLigado());
        }
    }

    public void ligar(){
        if (carroLigado == false && velocidadeMinima == 0 && velocidadeMaxima == 0){
            setCarroLigado(true);
            System.out.println("O carro esta ligado " + getCarroLigado());
        }
    }

}
