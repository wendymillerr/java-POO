package modelo;
import java.util.Date;


public class Professor {
    protected String nome;
    protected String matricula;
    protected Date dataNascimento;
    protected double salario;
    protected String nivelEscolaridade1;
    protected String disciplina;

    public Professor(){
        salario = 0;
    }

    public void lecionar(){
        System.out.println("O professor " + nome + " está lecionando");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNivelEscolaridade1() {
        return nivelEscolaridade1;
    }
    public void setNivelEscolaridade1(String nivelEscolaridade1) {
        this.nivelEscolaridade1 = nivelEscolaridade1;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    



}
