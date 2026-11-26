package br.com.sistemaalunos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    private static final String URL =
            "jdbc:sqlserver://localhost:61011;" +
                    "databaseName=SistemaAlunos;" +
                    "encrypt=true;" +
                    "trustServerCertificate=true;";

    public static Connection conectar() throws SQLException{
        String usuario = System.getenv("SQLSERVER_USER");
        String senha = System.getenv("SQLSERVER_PASSWORD");
        if(usuario == null || usuario.isBlank()){
            throw new IllegalStateException("A variável SQLSERVER_USER não foi configurada");
        }
        if(senha == null || senha.isBlank()){
            throw new IllegalStateException("A variável SQLSERVER_PASSWORD não foi configurada");
        }
        return DriverManager.getConnection(URL, usuario, senha);


    }
}
