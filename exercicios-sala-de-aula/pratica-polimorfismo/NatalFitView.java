import java.util.*;

public class NatalFitView {
    public static void main(String[] args) throws Exception {

        DadosAcademia dados = new DadosAcademia();

        Professor professor1 = new Professor();
        professor1.setNome("Carlos Almeida");
        professor1.setMatricula(0);
        professor1.setTipo("Musculação");


        Professor professor2 = new Professor();
        professor2.setNome("Antonio Silva");
        professor2.setMatricula(2);
        professor2.setTipo("Natação");


        Recepcionista recepcionista1 = new Recepcionista();
        recepcionista1.setNome("Joao victor");
        recepcionista1.setMatricula(3);
        recepcionista1.setHorarioTrabalho("Quinta a Domingo, 9h às 18h");


        Recepcionista recepcionista2 = new Recepcionista();
        recepcionista2.setNome("Maria Eduarda");
        recepcionista2.setMatricula(4);
        recepcionista2.setHorarioTrabalho("Segunda a Quarta, 9h às 18h");

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Clara");
        aluno1.setCpf(593254899);
        //aluno1.setDataNascimento(null);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Bruno");
        aluno2.setCpf(593254855);
       // aluno1.setDataNascimento("31 outubro");

        aluno1.adicionarTreino("Segunda-feira, 10h", "Musculação");
        aluno1.adicionarTreino("Terça-feira, 15h", "Musculação");
        aluno1.adicionarTreino("Quarta-feira, 11h", "Esteira");

        aluno2.adicionarTreino("Quinta-feira, 12h", "Nado livre");
        aluno2.adicionarTreino("Domingo, 15h", "Nado borboleta");
        aluno2.adicionarTreino("Sábado, 11h", "Natação");

        professor1.addAluno(aluno1);
        professor2.addAluno(aluno2);


        dados.addFuncionario(professor1);
        dados.addFuncionario(professor2);
        dados.addFuncionario(recepcionista1);
        dados.addFuncionario(recepcionista2);
        dados.listarFuncionarios();
        dados.listarAtividadesAlunos();
        dados.listarRecepcionistas();
        dados.listarAlunos();
    }
}
