

public class Tigre extends Animal {
    private String tipoTigre;

    public String getTipoTigre() {
        return tipoTigre;
    }

    public void setTipoTigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
    }

    public Tigre(){
        super();
    }

    @Override
    public double quantAlim(){
        if(alimentado){
            double quantidade = 0.04 * peso;
            return quantidade;
        }
        return 0;
    }

    public void print(){
        super.print();
        System.out.println("Tipo tigre: " + tipoTigre);
    }
}
