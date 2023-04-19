import java.util.Date;

public class Professor{
    private String nome;
    private String matricula;
    private Date dataNascimento;
    private double salario;
    private String nivelEscolaridade1;
    private String disciplina;
    private int numeroDependentes;

    public Professor(){
        this.salario = 0;
    }

    public double calcularSalario(){
        return this.salario += 150;
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
    public int getNumeroDependentes() {
        return numeroDependentes;
    }
    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }


}