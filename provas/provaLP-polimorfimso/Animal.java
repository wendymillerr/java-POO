import java.util.Date;


public class Animal {
    protected String nome;
    protected Date dataNascimento;
    protected int peso;
    protected boolean alimentado;
    protected String alimento;

    public Animal(){
        alimentado = false;
    }

    public double quantAlim(){
       double quantidade = 0.05 * peso;
        System.out.println("Animal " + nome + " está comendo");
        return quantidade;
    }

    public void print(){
        System.out.println("Nome: " + nome);
        System.out.println("data nascimento: " + dataNascimento);
        System.out.println("peso: " + peso);
        System.out.println("Alimentado: " + alimentado);
        System.out.println("Tipo alimento: " + alimento);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public boolean isAlimentado() {
        return alimentado;
    }
    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }
    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }


    

}
