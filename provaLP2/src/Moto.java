public class Moto extends Veiculo{
    private String tipoPartida;
    private double cilindradas;
    public String getTipoPartida() {
        return tipoPartida;
    }
    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }
    public double getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void imprimirVeiculo(){
        super.imprimirVeiculo();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Tipo partida: " + tipoPartida);
    }
    
}