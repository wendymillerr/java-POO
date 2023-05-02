public class Veiculo {
    
    private String marca;
    private String placa;
    private double quilometragem;
    private double valorAluguel;
    private boolean estaAlugado;


    public String getMarca() {
        return marca;
    }

    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }


    public void verificarQuilometragem(){

    }

    public void efetuarTrocaOleo(){

    }

    public void imprimirVeiculo(){
        System.out.println("Marca: " + marca);
        System.out.println("Placa: " + placa);
        System.out.println("Quilometragem: " + quilometragem);
        System.out.println("Valor aluguel: " + valorAluguel);
    }



    public boolean estaAlugado() {
        return estaAlugado;
    }



    public void setEstaAlugado(boolean estaAlugado) {
        this.estaAlugado = estaAlugado;
    }

}
