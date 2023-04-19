import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class BancoDados {

    private ArrayList<Professor>professores;

    public BancoDados(){
        professores = new ArrayList<Professor>();
    }

    public void addProfessor(Professor professor){
        professores.add(professor);
    }

    public void informarQuantProfessores(){
        System.out.println("Existem " +  professores.size() + " no banco de dados.");
    }

    public void maiorSalario(){

        double maiorSalario = 0;
        int indexProfessor = 0;

        for(Professor professor : professores){
            if (professor.getSalario() > maiorSalario){
                maiorSalario = professor.getSalario();
                indexProfessor = professores.indexOf(professor);

            }
        }

        System.out.println("O professor que possui maior salário é " + professores.get(indexProfessor).getNome() + "com valor: " + maiorSalario);
    }


    public void professorMaisJovem(){
        int indexProfessorMaisNovo = 0;
        Date dataMaisNovo = new Date();
       
        for (int i = 0; i < professores.size(); i++) {
            Professor professor = professores.get(i);
            if (professor.getDataNascimento().after(dataMaisNovo)) {
                dataMaisNovo = professor.getDataNascimento();
                indexProfessorMaisNovo = i;
            }
        }

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String dataString = formato.format(dataMaisNovo);
        System.out.println("O professor mais novo é " + professores.get(indexProfessorMaisNovo).getNome() + " e nasceu " + dataString);
        
            
    }



    public void professorMaisAntigo(){
        int indexProfessorMaisVelho = 0;
        Date dataMaisVelho = new Date();

        for (int i = 0; i < professores.size(); i++){
            Professor professor = professores.get(i);
            if (professor.getDataNascimento().before(dataMaisVelho)){
                dataMaisVelho = professor.getDataNascimento();
                indexProfessorMaisVelho = i;
            }
        }
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = formato.format(dataMaisVelho);
        System.out.println("O professor mais velho é " + professores.get(indexProfessorMaisVelho).getNome() + " e nasceu " + dateString);

    }

}