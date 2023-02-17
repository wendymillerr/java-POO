package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic - cristal", "verde", 5.0f);
        c1.tampada = false;
        c1.carga = 5;
        c1.setModelo("ponta fina");
        c1.status();
        c1.rabiscar();
    }
}
