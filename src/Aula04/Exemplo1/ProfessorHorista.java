package Exemplo1;

public class ProfessorHorista extends Professor {
    protected int valorHora;
    protected int totalHora;

    public ProfessorHorista(int matriculaProfessor, String nomeProfessor, int idadeProfessor, float vlrHora, float valorHora, int totalHora) {
        super(matriculaProfessor, nomeProfessor);
        this.totalHora=totalHora;
        if(vlrHora>0) valorHora = vlrHora;
    }

    public float obterSalario(){
        return valorHora*totalHora;
    }
}
