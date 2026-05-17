package models;

import java.util.Objects;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno() {

    }

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Aluno{" + "matricula='" + matricula + '\'' + '}');
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

}
