package br.ufrn.imd.modelo;

public class Taxi extends Veiculo {
    private int quantPessoas;


    @Override
    public double custoMensal() {
         System.out.println("O valor do custo da moto é: ");
        return super.custoMensal();
    }
    public int getQuantPessoas() {
        return quantPessoas;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    @Override
    public double getCarbonFootprint() {
        double carbono = quilometragem * 1.1;
        return carbono;
    }
}
