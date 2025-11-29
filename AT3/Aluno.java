package AT3;
package model;

public class Aluno {
    

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public String getTipo() {
        return "Aluno";
    }
}

}
