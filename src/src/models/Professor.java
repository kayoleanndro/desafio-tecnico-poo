package models;

import interfaces.Autenticavel;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Professor extends Pessoa implements Autenticavel {

    private String especialidade;
    private double salario;

    public Professor(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public boolean realizarLogin(String email) {

        //Simulando um Banco de Dados
        List<String> emails = Arrays.asList("kayoleanndro2@gmail.com", "kayoleanndrodev2@gmail.com");

        //TODO:Criar Novas Formas de fazer Login
        for (String e : emails) {
            if (e.contains(email)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(
                "Professor{" +
                        "nome='" + getNome() + '\'' +
                        ", email='" + getEmail() + '\'' +
                        ", especialidade='" + especialidade + '\'' +
                        ", salario=" + salario +
                        ", endereco=" + getEndereco().getRua() +
                        " - " + getEndereco().getCidade() +
                        ", cep=" + getEndereco().getCep() +
                        '}'
        );
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Double.compare(salario, professor.salario) == 0 && Objects.equals(especialidade, professor.especialidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especialidade, salario);
    }

}
