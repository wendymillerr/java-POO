

-------------------------------------------------------------------------------------------
public void listarVeiculos(){
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

private ArrayList<Veiculo>veiculos;
    private HashMap<String, Integer> marcas;

    public Estoque(){
        veiculos = new ArrayList<Veiculo>();
        marcas = new HashMap<String, Integer>();

    }

*/
       
        System.out.println("Listando veiculos...");

        for(Veiculo veiculo : veiculos){
            veiculo.imprimirVeiculo();
            System.out.println(" ");
           

            if(veiculo instanceof Carro){
                if(marcas.containsKey(veiculo.getMarca())){
                    marcas.put(veiculo.getMarca(), marcas.get(veiculo.getMarca())+1);
                }else{
                    marcas.put(veiculo.getMarca(), 1 );
                }
            }
        }
            System.out.println("Marca com maior número de carros:");
            System.out.println(Collections.max(marcas.entrySet(), 
            Map.Entry.comparingByValue()).getKey());	        

    }


    /*---------------------------------------- DATA ------------------------------------ */

    import java.util.Date;
    import java.text.SimpleDateFormat;
    import java.text.ParseException;
    
    public static void main(String[] args) throws ParseException{}
    Date data = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    data = formato.parse("16-06-1995");
	an1.setDataNascimento(data);

/*-----------------------------------------------IDADE---------------------------------------*/


    public int getIdade(){
        int idade = 0;
        Calendar hoje = Calendar.getInstance();
        int anoPresente = hoje.get(Calendar.YEAR);

        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(this.dataNascimento);
        int anoNascimento = nascimento.get(Calendar.YEAR);

        idade = anoPresente - anoNascimento;
        return idade;
    }


/*------------------------------------------------tO STRING--------------------------------------- */

public String toString() {
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    String dataNascimentoStr = format.format(dataNascimento);
    return "nome= " + nome + "\ndataNascimento= " + dataNascimentoStr;
}

public String toString() {
    String pessoaStr = super.toString();
    
    return pessoaStr + "\npeso=" + peso + "\naltura=" + altura + "\n";
}



---------------------------------------------------------ORDENAR--------------------------------------------------------------------------------

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

/*-------------------------------------ORDENAR POR MAIS DE UM CRITERIO:------------------------------------------------- */

elefantes.sort(
    Comparator.comparing(Animal::getIdade)
              .thenComparing(Animal::getNome)
              .thenComparing(Animal::getPeso)
);

