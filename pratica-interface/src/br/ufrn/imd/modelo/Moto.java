package br.ufrn.imd.modelo;

public class Moto extends Veiculo {
    private int cilindrada;

    @Override
    public double custoMensal() {
        // TODO Auto-generated method stub
        System.out.println("O valor do custo da moto é: ");

        return super.custoMensal();
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double getCarbonFootprint(){
        double carbono;
        if (cilindrada > 650) {
            carbono = quilometragem * 0.65;
        } else if(cilindrada < 150) {
            carbono = quilometragem * 0.2;
        }else{
            carbono = quilometragem * 0.5;
        }
        return carbono;
    }
    
}
