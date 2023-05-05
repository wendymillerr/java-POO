import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ZooDAO {
    private ArrayList<Animal>animais;
    
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

    



}
