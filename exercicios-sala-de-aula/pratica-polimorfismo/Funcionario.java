import java.util.ArrayList;

public class Funcionario {
    protected int matricula;
    protected String nome;
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void print(){
        System.out.print("Matrícula: " + matricula + " Nome: " + nome );
    }
    
}
