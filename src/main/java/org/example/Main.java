package org.example;

import br.com.sistemaalunos.model.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(
                1,
                "João Silva",
                "joao@email.com",
                17
        );

        System.out.println(aluno.getNome());
        System.out.println(aluno.getEmail());
        System.out.println(aluno.getIdade());

        aluno.setNome("Maria Silva");

        System.out.println(aluno.getNome());

    }
}