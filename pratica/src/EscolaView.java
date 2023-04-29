import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class EscolaView {
    public static void main(String[] args) throws ParseException  {
       
        ProfessorDao professorDao = new ProfessorDao();

        Date data = new Date();
        Date dataInicio = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        ProfessorHorista professorHorista1 = new ProfessorHorista();
        professorHorista1.setNome("João");
        data = formato.parse("10/12/1990");
        professorHorista1.setDataNascimento(data);
        professorHorista1.setHorasTrabalhadas(40);
        professorHorista1.setMatricula("3515284");
        professorHorista1.setNivelEscolaridade1("superior");
        professorHorista1.setDisciplina("matemática");


        ProfessorHorista professorHorista2 = new ProfessorHorista();
        professorHorista2.setNome("Maria");
        data = formato.parse("10/11/1998");
        professorHorista2.setDataNascimento(data);
        professorHorista2.setHorasTrabalhadas(15);
        professorHorista2.setMatricula("20226888555");
        professorHorista2.setNivelEscolaridade1("superior");
        professorHorista2.setDisciplina("história");


        ProfessorHorista professorHorista3 = new ProfessorHorista();
        professorHorista3.setNome("Clara");
        data = formato.parse("05/09/1995");
        professorHorista3.setDataNascimento(data);
        professorHorista3.setHorasTrabalhadas(20);
        professorHorista3.setMatricula("20226888566");
        professorHorista3.setNivelEscolaridade1("doutorado");
        professorHorista3.setDisciplina("português");

        ProfessorHorista professorHorista4 = new ProfessorHorista();
        professorHorista4.setNome("Samir");
        data = formato.parse("05/09/1980");
        professorHorista4.setDataNascimento(data);
        professorHorista4.setHorasTrabalhadas(20);
        professorHorista4.setMatricula("20226865566");
        professorHorista4.setNivelEscolaridade1("mestrado");
        professorHorista4.setDisciplina("português");

        ProfessorIntegral professorIntegral1 = new ProfessorIntegral();
        dataInicio = formato.parse("29/04/2024");
        professorIntegral1.setDataInicio(dataInicio);
        data = formato.parse("15/02/2000");
        professorIntegral1.setDataNascimento(data);
        professorIntegral1.setDisciplina("matemática");
        professorIntegral1.setMatricula("65411614");
        professorIntegral1.setNome("Marcelo");
        professorIntegral1.setSalario(3000);
        professorIntegral1.setNivelEscolaridade1("doutorado");

        ProfessorIntegral professorIntegral2 = new ProfessorIntegral();
        dataInicio = formato.parse("29/07/2021");
        professorIntegral2.setDataInicio(dataInicio);
        data = formato.parse("25/03/2001");
        professorIntegral2.setDataNascimento(data);
        professorIntegral2.setDisciplina("matemática");
        professorIntegral2.setMatricula("6541161455");
        professorIntegral2.setNome("Rafael");
        professorIntegral2.setSalario(3000);
        professorIntegral2.setNivelEscolaridade1("mestrado");

        professorDao.adicionarProf(professorHorista2);
        professorDao.adicionarProf(professorHorista1);
        professorDao.adicionarProf(professorHorista3);
        professorDao.adicionarProf(professorIntegral1);
        professorDao.adicionarProf(professorHorista4);
        professorDao.adicionarProf(professorIntegral2);

        professorDao.professorMaisJovem();
        professorDao.quantidadeProfessores();
        professorDao.maiorSalario();
        professorDao.listarMediaHoras();
        professorDao.professorMaisVelho();
        professorDao.valorTotalSalarios();
        professorDao.lecionaPortMatem();
        professorDao.listaMestradoDoutorado();

    }

    
}
