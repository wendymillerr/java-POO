import animal.*;

public class App {
    public static void main(String[] args) throws Exception {
        Peixe peixe = new Peixe();
        Reptil lagarto = new Reptil();
        Mamifero cachorro = new Mamifero();

        peixe.alimentar();
        lagarto.alimentar();
        cachorro.emitirSom();

    }
}
