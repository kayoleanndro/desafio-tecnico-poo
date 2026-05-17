package models;

import enums.Modalidade;

import java.util.List;

public class Curso {

    private String nome;

    private Modalidade modalidade;

    private Professor professorResponsavel;

    private List<Aluno> alunos;

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void listarAlunos(){

        int contador = 0;

        for(Aluno aluno : this.alunos){
            System.out.println("Aluno: " + ++contador + aluno.getMatricula());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
