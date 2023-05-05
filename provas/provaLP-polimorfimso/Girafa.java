


public class Girafa extends Animal{
    private int tamanhoLingua;


    public Girafa(){
        super();
    }

    @Override
    public double quantAlim(){

        if(alimentado){
            double quantidade = 0.1 * peso;
            return quantidade;
        }
        return 0;
    }

    public void print(){
        super.print();
        System.out.println("Tamanho lingua: " + tamanhoLingua);
    }
}
