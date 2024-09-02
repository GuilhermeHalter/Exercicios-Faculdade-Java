package Exemplo1;

public abstract class Professor {
    protected int matriculaProfessor;
    protected String nomeProfessor;

    public Professor(int matriculaProfessor, String nomeProfessor) {
        this.matriculaProfessor = matriculaProfessor;
        this.nomeProfessor = nomeProfessor;
    }

    public int retornaMatriculaProfessor() {
        return matriculaProfessor;
    }

    public String retornaNomeProfessor() {
        return nomeProfessor;
    }
}
