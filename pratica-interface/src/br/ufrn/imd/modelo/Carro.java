package br.ufrn.imd.modelo;

public class Carro extends Veiculo {
    private double motor;

    @Override
    public double custoMensal() {

        System.out.println("O valor do custo da moto é: ");
        return super.custoMensal();
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    @Override
    public double getCarbonFootprint() {
        double carbono;

        if (motor > 2) {
            carbono = quilometragem * 185;
        } else if(motor < 1){
            carbono = quilometragem * 0.13;
        }else{
            carbono = quilometragem * 1.22;
        }

        return carbono;
    }
    
}
