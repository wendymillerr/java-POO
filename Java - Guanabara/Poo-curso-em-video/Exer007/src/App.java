import tiposdeanimal.animal.*;

public class App {
    public static void main(String[] args) throws Exception {
        Peixe peixe = new Peixe();
        Reptil lagarto = new Reptil();
        Cachorro cachorro = new Cachorro();

        peixe.alimentar();
        lagarto.alimentar();
        cachorro.emitirSom();
        cachorro.alimentar();

    }
}
