import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.text.Utilities;

import java.util.Calendar;
import java.util.Comparator;

public class ZooDAO {
    private ArrayList<Animal>animais;
    private Date dataNascimento;
    
    public ZooDAO(){
        animais = new ArrayList<Animal>();
       
    }

    public void addAnimal(Animal animal){
        animais.add(animal);
        
    }

    public void alimentoHerb(){
        double quantAlimentoHerb = 0;
        double quantAlimentoCarn = 0;

        for (Animal animal : animais){
            if((animal instanceof Elefante)){
                Elefante elefante = (Elefante)animal;
                quantAlimentoHerb += elefante.quantAlim();

            }else if( animal instanceof Girafa){
                Girafa girafa = (Girafa)animal;
                quantAlimentoHerb += girafa.quantAlim();

            }else{
                Tigre tigre = (Tigre)animal;
                quantAlimentoCarn += tigre.quantAlim();
            }
        }

        System.out.println("Animais herbivoros consomem " + quantAlimentoHerb + "quilos de alimento");
        System.out.println("Animais carnívoros consomem " + quantAlimentoCarn + "quilos de alimento");


    }

    public void animaisJaula(){
        System.out.println("A lista de animais enjaulados é: ");
        for (Animal animal : animais) {
            animal.print();
            System.out.println();
        }
    }

    public void consulta(){
        
            int indexAnimalMaisNovo = 0;
            Date dataMaisNovo = new Date();
            dataMaisNovo = animais.get(0).getDataNascimento();
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    
    
            for(int i = 0; i < animais.size(); i++){
                Animal animal = animais.get(i);
                if(animal.getDataNascimento().after(dataMaisNovo)){
                    dataMaisNovo = animal.getDataNascimento();
                    indexAnimalMaisNovo = i;
                }
            }
            
            String dataString = formato.format(dataMaisNovo);
            System.out.println();
            System.out.println("O animal mais novo é " + animais.get(indexAnimalMaisNovo).getNome() + " e nasceu " + dataString);
            System.out.println();
        

            
            int indexAnimalMaisVelho = 0;
            Date dataMaisVelho = new Date();
            dataMaisNovo = animais.get(0).getDataNascimento();
           
        
            for(int i = 0; i < animais.size(); i++){
                Animal animal = animais.get(i);
                    if(animal.getDataNascimento().before(dataMaisVelho)){
                        dataMaisNovo = animal.getDataNascimento();
                        indexAnimalMaisVelho = i;
                    }
                }
                
            dataString = formato.format(dataMaisVelho);
            System.out.println();
            System.out.println("O Animal mais velho é " + animais.get(indexAnimalMaisVelho).getNome() + " e nasceu " + dataString);
            System.out.println();
            
        
    
    }

    
    public void listarConsultas(){
        System.out.println("Animais que precisam de consulta");
        System.out.println();
        for (Animal animal : animais) {
            if(animal instanceof Tigre){
                
                if(animal.getIdade() % 3 == 0){
                    System.out.println(animal.toString());
                    System.out.println();
                }
            }
            else if(animal instanceof Elefante){
                if(animal.getIdade() % 7 == 0){
                    System.out.println(animal.toString());
                    System.out.println();
                }
            }else{
                if(animal.getIdade() % 5 == 0){
                    System.out.println(animal.toString());
                    System.out.println();
                }
            }
        }

    }

    public void listarIdade(){

        ArrayList<Tigre>tigres = new ArrayList<Tigre>();
        ArrayList<Elefante>elefantes = new ArrayList<Elefante>();
        ArrayList<Girafa>girafas = new ArrayList<Girafa>();


        for (Animal animal : animais) {
            if(animal instanceof Tigre){
                tigres.add((Tigre)animal);
            }
            else if(animal instanceof Elefante){
                elefantes.add((Elefante)animal);
            }else{
                girafas.add((Girafa)animal);
            }
        }

        int ultimo = elefantes.size() - 1;
        elefantes.sort(Comparator.comparing(Animal::getIdade));
        System.out.println("Elefante mais jovem: " + elefantes.get(0).getNome() + " " + elefantes.get(0).getIdade());
        System.out.println("Elefante mais velho: " + elefantes.get(ultimo).getNome() + " " + elefantes.get(ultimo).getIdade());
        System.out.println();

        ultimo = girafas.size() - 1;
        girafas.sort(Comparator.comparing(Animal::getIdade));
        System.out.println("Girafa mais jovem: " + girafas.get(0).getNome() + " " + girafas.get(0).getIdade());
        System.out.println("Girafa mais velha: " + girafas.get(ultimo).getNome() + " " + girafas.get(ultimo).getIdade());

        ultimo = tigres.size() - 1;
        tigres.sort(Comparator.comparing(Animal::getIdade));
        System.out.println("Tigre mais jovem: " + tigres.get(0).getNome() + " " + tigres.get(0).getIdade());
        System.out.println("Tigre mais velho: " + tigres.get(ultimo).getNome() + " " + tigres.get(ultimo).getIdade());


    }

    public void iniciarZoo(){
        listarConsultas();
        animaisJaula();
        alimentoHerb();
        listarIdade();
    }

}
