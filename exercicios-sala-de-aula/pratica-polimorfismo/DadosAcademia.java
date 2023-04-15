import java.util.ArrayList;

public class DadosAcademia {
    private ArrayList<Funcionario>funcionarios;

    public DadosAcademia(){
        funcionarios = new ArrayList<Funcionario>();
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    public void listarFuncionarios(){
        System.out.println();
        System.out.println("###############################  Funcionários  ###############################");

        for(Funcionario funcionario : funcionarios){
            funcionario.print();
        }
    }

    public void listarAtividadesAlunos(){
        System.out.println();
        System.out.println("###############################  Professores  ###############################");

        for(Funcionario funcionario : funcionarios){

            if(funcionario instanceof Professor){
                Professor professor = (Professor)funcionario;
                System.out.println("Professor [" + professor.getNome() + "]"); 

                for(Aluno aluno : professor.getAlunos()){
                    System.out.println("Aluno >> " + aluno.getNome());
                    aluno.listarTreino();
                    System.out.println();
                }
            }
        }

    }

    public void listarRecepcionistas(){
        System.out.println("###################### Recepcionistas #######################");
        for(Funcionario funcionario : funcionarios){
            if(funcionario instanceof Recepcionista){
                Recepcionista recepcionista = (Recepcionista)funcionario;
                System.out.println("Nome: " + recepcionista.getNome());
                System.out.println(recepcionista.getHorarioTrabalho());
            }
        }
    }

    public void listarAlunos(){
        System.out.println();
        System.out.println("################ Alunos ##############");
        for (Funcionario funcionario : funcionarios){
            if(funcionario instanceof Professor){
                Professor professor = (Professor)funcionario;
                for(Aluno aluno : professor.getAlunos()){
                    aluno.imprimirAluno();
                    System.out.println();
                }
            }
        }
    }

}
