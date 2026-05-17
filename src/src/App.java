package application;

import enums.Modalidade;
import models.Aluno;
import models.Curso;
import models.Endereco;
import models.Professor;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        // Criando endereço
        Endereco endereco = new Endereco(
                "Rua das Flores",
                "São Paulo",
                "12345-678"
        );

        // Criando professor
        Professor professor = new Professor("Java Backend");
        professor.setNome("Kayo Leanndro ");
        professor.setEmail("carlos@email.com");
        professor.setEndereco(endereco);
        professor.setSalario(8500.0);

        // Testando login
        boolean login = professor.realizarLogin("kayoleanndro2@gmail.com");
        System.out.println("Login realizado? " + login);

        // Testando login Professor
        boolean loginProfessor = professor.realizarLogin(professor.getEmail());
        System.out.println("Login realizado para professor? " + login);

        // Criando alunos
        Aluno aluno1 = new Aluno("2025001");
        aluno1.setNome("João");
        aluno1.setEmail("joao@email.com");
        aluno1.setEndereco(
                new Endereco("Rua A", "São Paulo", "11111-111")
        );

        Aluno aluno2 = new Aluno("2025002");
        aluno2.setNome("Maria");
        aluno2.setEmail("maria@email.com");
        aluno2.setEndereco(
                new Endereco("Rua B", "Campinas", "22222-222")
        );

        // Criando curso
        Curso curso = new Curso();
        curso.setNome("Programação Orientada a Objetos");
        curso.setModalidade(Modalidade.PRESENCIAL);
        curso.setProfessorResponsavel(professor);
        curso.setAlunos(new ArrayList<>());

        // Adicionando alunos
        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);

        // Exibindo detalhes
        System.out.println("\n=== PROFESSOR ===");
        professor.exibirDetalhes();

        System.out.println("\n=== ALUNOS ===");
        aluno1.exibirDetalhes();
        aluno2.exibirDetalhes();

        System.out.println("\n=== LISTA DE ALUNOS DO CURSO ===");
        curso.listarAlunos();
    }
}