public class Carro extends Veiculo{

    private double potenciaMotor;
    private int quantPortas;


    public double getPotenciaMotor() {
        return potenciaMotor;
    }
    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
    public int getQuantPortas() {
        return quantPortas;
    }
    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }
    
    public void imprimirVeiculo(){
        super.imprimirVeiculo();
        System.out.println("Motor: " + potenciaMotor);
        System.out.println("Quantidade de portas: " + quantPortas);
    }
}