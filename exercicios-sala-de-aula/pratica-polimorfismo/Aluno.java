import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Aluno {
    private String nome;
    private int cpf;
    private Date dataNascimento;
    private Set<Treino>treinos;

    public Aluno(){
        treinos = new HashSet<Treino>();
    }

    public void adicionarTreino(String horario, String atividade){
        Treino treino = new Treino(horario, atividade);
        treinos.add(treino);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Treino> getTreinos() {
        return new ArrayList<Treino>(treinos);
    }

    public void listarTreino(){
        for(Treino treino : getTreinos()){
            treino.imprimirTreino();
        }
    }

    public void imprimirAluno(){
        System.out.println("Nome " + nome);
        System.out.println("CPF: " + cpf);
        
    }
    
}
