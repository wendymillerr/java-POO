
import luta.*;



public class App {
    public static void main(String[] args) throws Exception {
     Lutador lutador[] = new Lutador[4];

     lutador[0] =  new Lutador("pretty boy", "frança", 31, 1.83f, 68.9f, 11, 2, 1);
     lutador[0].status();
     lutador[1] = new Lutador("Snapshadow", "Brasil", 35, 1.78f, 120.0f, 10, 3, 2);
     lutador[2] = new Lutador("Nerdaart", "EUA", 30, 1.70f, 83.0f, 8, 5, 0);
     lutador[3] = new Lutador("UFOCobol", "Australia", 38, 1.9f, 110.0f, 11, 1, 0);
     lutador[0].ganharLuta();
     lutador[0].status();
    }
}
