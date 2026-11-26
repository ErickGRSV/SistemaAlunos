USE SistemaAlunos;
GO

CREATE TABLE Aluno (
                       id INT IDENTITY(1,1) PRIMARY KEY,
                       nome NVARCHAR(100) NOT NULL,
                       email NVARCHAR(150) NOT NULL,
                       idade INT NOT NULL
);