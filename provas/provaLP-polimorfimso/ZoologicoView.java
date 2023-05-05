import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ZoologicoView  {

    public static void main(String[] args) throws ParseException{
    
    
    ZooDAO zooDAO = new ZooDAO();
    Date data = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    Girafa girafa1 = new Girafa();
    data = formato.parse("10/12/2005");
    girafa1.setDataNascimento(data);
    girafa1.setNome("Gigi");
    girafa1.setPeso(300);
    girafa1.setAlimento("planta");

    Girafa girafa2 = new Girafa();
    data = formato.parse("10/12/2007");
    girafa2.setDataNascimento(data);
    girafa2.setNome("Melmam");
    girafa2.setPeso(400);
    girafa2.setAlimento("planta");


    Tigre tigre1 = new Tigre();
    tigre1.setAlimento("carne");
    data = formato.parse("05/06/2007");
    tigre1.setDataNascimento(data);
    tigre1.setNome("diego");
    tigre1.setPeso(200);
    tigre1.setTipoTigre("Branco");

    Tigre tigre2 = new Tigre();
    tigre2.setAlimento("carne");
    data = formato.parse("05/06/2007");
    tigre2.setDataNascimento(data);
    tigre2.setNome("diego");
    tigre2.setPeso(250);
    tigre2.setTipoTigre("Branco");

    Elefante elefante1 = new Elefante();
    elefante1.setAlimentado(true);
    elefante1.setAlimento("planta");
    data = formato.parse("05/06/2009");
    elefante1.setDataNascimento(data);
    elefante1.setNome("Tantor");
    elefante1.setPeso(1000);
    elefante1.setTamanhoTromba(120);

    Elefante elefante2 = new Elefante();
    elefante2.setAlimentado(true);
    elefante2.setAlimento("planta");
    data = formato.parse("05/06/2008");
    elefante2.setDataNascimento(data);
    elefante2.setNome("titi");
    elefante2.setPeso(1000);
    elefante2.setTamanhoTromba(120);
    }
    

}
