package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorJsonTest {

    @Test
    void deveExibirAluno() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitorJson visitor = new PessoaVisitorJson();
        String esperado = "{\n" +
                "  \"matricula\": \"1\",\n" +
                "  \"nome\": \"Ana\",\n" +
                "  \"curso\": \"Sistemas de Informação\"\n" +
                "}";
        assertEquals(esperado, visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessor() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaVisitorJson visitor = new PessoaVisitorJson();
        String esperado = "{\n" +
                "  \"matricula\": \"1\",\n" +
                "  \"nome\": \"Maria\",\n" +
                "  \"titulacao\": \"Doutorado\"\n" +
                "}";
        assertEquals(esperado, visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitorJson visitor = new PessoaVisitorJson();
        String esperado = "{\n" +
                "  \"codigo\": \"1\",\n" +
                "  \"nome\": \"Pedro\",\n" +
                "  \"salario\": 5000.0\n" +
                "}";
        assertEquals(esperado, visitor.exibir(funcionario));
    }

}