import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EscolaView {

    public static void main(String[] args) throws ParseException {
        Date dt = new Date();
        BancoDados bancoDados = new BancoDados();

		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");


    ProfessorHorista professor1 = new ProfessorHorista();
   professor1.setNome("Bruno moura");
    dt = formato.parse("10-05-2024");
    professor1.setDataNascimento(dt);
    bancoDados.addProfessor(professor1);
    bancoDados.professorMaisJovem();
    }
   


}
