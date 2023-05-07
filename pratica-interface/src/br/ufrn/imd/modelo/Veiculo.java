package br.ufrn.imd.modelo;

public class Veiculo implements ICarbonFootprint{

    protected int quilometragem;
    private static final double VALOR_COMBUSTIVEL = 7;
   

    public double custoMensal(){
        double valor = 0;
        valor = quilometragem * VALOR_COMBUSTIVEL; 
        System.out.println("custo: " + valor);
        return valor;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public double getCarbonFootprint(){

        return 0;
    }

    
}