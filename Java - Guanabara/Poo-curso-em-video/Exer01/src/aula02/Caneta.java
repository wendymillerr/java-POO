package aula02;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("is the pen capped? " + this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true){
            boolean a = this.tampada;
            System.out.println(a);
            System.out.println("Error! first, uncap the pen.");
        }else{
            System.out.println("I'm doodling");
        }

        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
