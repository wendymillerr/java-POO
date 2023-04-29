import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ProfessorDao {
    
    private ArrayList<Professor>professores;

    public ProfessorDao(){
        professores = new ArrayList<Professor>();
    }

    public void adicionarProf(Professor professor){
        professores.add(professor);
    }

    public void removerProf(Professor professor){
        professores.remove(professor);
    }

    public int quantidadeProfessores(){
        int  quantidadeProfessores = professores.size();
        System.out.println("Existem " + quantidadeProfessores + " professores na escola");
        return quantidadeProfessores;
    }

    public void maiorSalario(){
        double maiorSalario = 0;
        int indexProfessor = 0;
        String nomeProfessor;

        for (Professor professor : professores){
            if(professor.getSalario() > maiorSalario){
                maiorSalario = professor.getSalario();
                indexProfessor = professores.indexOf(professor);
            }
        }
        nomeProfessor = professores.get(indexProfessor).getNome();
        System.out.println("O maior salário é: " + maiorSalario + " e pertence a(o) professor/professora: " + nomeProfessor);
        System.out.println();
    }

    public void professorMaisJovem(){
        int indexProfessorMaisNovo = 0;
        Date dataMaisNovo = new Date();
        dataMaisNovo = professores.get(0).getDataNascimento();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");


        for(int i = 0; i < professores.size(); i++){
            Professor professor = professores.get(i);
            if(professor.getDataNascimento().after(dataMaisNovo)){
                dataMaisNovo = professor.getDataNascimento();
                indexProfessorMaisNovo = i;
            }
        }
        
        String dataString = formato.format(dataMaisNovo);
        System.out.println();
        System.out.println("O professor mais novo é " + professores.get(indexProfessorMaisNovo).getNome() + " e nasceu " + dataString);
        System.out.println();
    }


    public void professorMaisVelho(){
        int professorMaisVelho;
        int indexProfessorMaisVelho = 0;
        Date dataMaisVelho = new Date();
        Format formato = new SimpleDateFormat("dd/MM/yyyy");
        dataMaisVelho = professores.get(0).getDataNascimento();

        for(int i = 0; i < professores.size(); i++){
            Professor professor = professores.get(i);
            if(professor.getDataNascimento().before(dataMaisVelho)){
                dataMaisVelho = professor.getDataNascimento();
                indexProfessorMaisVelho = i;
            }
        }

        String dataString = formato.format(dataMaisVelho);
        System.out.println();
        System.out.println("O professor mais velho é " + professores.get(indexProfessorMaisVelho).getNome() + " e nasceu " + dataString);
        System.out.println();

    }



    public void valorTotalSalarios(){
        double valorTotalSalarios = 0;
        for(Professor professor : professores){
            valorTotalSalarios += professor.getSalario();
        }
        System.out.println();
        System.out.println("O valor total a ser pago em salários pela escola é: " + valorTotalSalarios);
        System.out.println();
    }


    public void listarMediaHoras(){
        int horasTotais = 0;
        double mediaHoras = 0;

        for(Professor professor : professores){
            if(professor instanceof ProfessorHorista){
                ProfessorHorista professorHorista = (ProfessorHorista)professor;
                
                horasTotais += professorHorista.getHorasTrabalhadas();
            }
        }
        mediaHoras = horasTotais/professores.size();
        System.out.println();
        System.out.println("Valor médio das horas trabalhadas por professores horistas: " + mediaHoras);
        System.out.println();
    }

    
    public void lecionaPortMatem(){
        System.out.println("##########################################################");
        System.out.println("Listando professores que lecionam português e matemática... ");
        System.out.println();
        for (Professor professor : professores) {
            if((professor.getDisciplina().equals("matemática")) ||  (professor.getDisciplina().equals("português"))){
                System.out.println("Nome: " + professor.getNome());
                System.out.println("Disciplina: " + professor.getDisciplina());
                System.out.println();
            }
        }

    }

    public void listaMestradoDoutorado(){
        System.out.println("##########################################################");
        System.out.println("Listando professores que possuem mestrado e doutorado... ");
        System.out.println();   
        
        for (Professor professor : professores) {
            if((professor.getNivelEscolaridade1().equals("mestrado")) || (professor.getNivelEscolaridade1().equals("doutorado"))){
                System.out.println("Nome: " + professor.getNome());
                System.out.println("Nível de escolaridade: " + professor.getNivelEscolaridade1());
                System.out.println();
            }
        }
    
    
    }


}
