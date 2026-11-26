package br.com.sistemaalunos.model;

public class Aluno {
    private int id;
    private String nome;
    private String email;
    private int idade;

    public Aluno(){

    }

    public Aluno(int id, String nome, String email, int idade){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

