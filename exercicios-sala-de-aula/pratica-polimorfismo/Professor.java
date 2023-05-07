import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario {
    private Set<Aluno>alunos;
    private String tipo;

    public Professor(){
        alunos = new HashSet<Aluno>();
    }

    public ArrayList<Aluno> getAlunos() {
        
        return new ArrayList<Aluno>(alunos);
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void print(){
        super.print();
        System.out.println("   Tipo: " + getClass() +" imd.academia.Professor " +  "[" + tipo + "]"  );
    }

}
