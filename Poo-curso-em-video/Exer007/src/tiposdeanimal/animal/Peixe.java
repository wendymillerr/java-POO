package tiposdeanimal.animal;

public class Peixe extends Animal {
    private String corEscama;
   
    public void alimentar() {
       System.out.println("Comendo substâncias");
    }

   
    public void emitirSom() {
      System.out.println("Peixe não emite som");
    }


    public void locomover() {
        System.out.println("Nadando");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolhas...");
    }
    
}
