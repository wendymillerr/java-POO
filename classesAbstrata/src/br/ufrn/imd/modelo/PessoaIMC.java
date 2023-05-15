package br.ufrn.imd.modelo;

public abstract class PessoaIMC extends Pessoa{
    protected Double peso;
    protected Double altura;


    public double calculaIMC(Double altura, Double peso){
        return peso/altura*altura;
    }

    public abstract String resultIMC();

    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        String pessoaStr = super.toString();
        
        return pessoaStr + "\npeso=" + peso + "\naltura=" + altura + "\n";
    }



    

}
