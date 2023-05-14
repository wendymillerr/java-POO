

public class Elefante extends Animal{
    private int tamanhoTromba;


    public Elefante(){
        super();
    }

    @Override
    public double quantAlim(){
        if(alimentado){
            double quantidade = 0.15 * peso;
            return quantidade;
        }
        return 0;
    }


    public int getTamanhoTromba() {
        return tamanhoTromba;
    }


    public void setTamanhoTromba(int tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }

    public void print(){
        super.print();
        System.out.println("Tamanho tromba: " + tamanhoTromba);
    }

    @Override
    public String toString() {
        System.out.println("Elefante: ");
        return super.toString();
    }

    
}
