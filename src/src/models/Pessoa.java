package models;

public abstract class Pessoa {

    private String nome;
    private String email;
    private Endereco endereco;

    //Para que as classes filhas sejam obrigadas a implementar o metodo
    public abstract void exibirDetalhes();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
