package br.com.sistemaalunos.dao;

import br.com.sistemaalunos.database.Conexao;
import br.com.sistemaalunos.model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    public List<Aluno> listarTodos() throws SQLException{
        String sql = "SELECT id, nome, email, idade FROM Aluno";
        List<Aluno> alunos = new ArrayList<>();
        try(
                Connection conexao = Conexao.conectar();
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet resultado = stmt.executeQuery()
        ) {
            while(resultado.next()){
                Aluno aluno = new Aluno(
                        resultado.getInt("id");
                        resultado.getString("nome");
                        resultado.getString("email");
                        resultado.getInt("idade");
                )
                alunos.add(aluno);
            }
        }
        return alunos;
    }
}
