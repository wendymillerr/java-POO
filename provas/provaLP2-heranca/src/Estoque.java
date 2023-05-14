import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Estoque {
    private ArrayList<Veiculo>veiculos;
    private HashMap<String, Integer> marcas;

    public Estoque(){
        veiculos = new ArrayList<Veiculo>();
        marcas = new HashMap<String, Integer>();

    }

    public void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void listarVeiculos(){

       
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

    public void exibirVeiculosAlugados(){
        double valorTotal = 0;

        System.out.println("###############################################");
        System.out.println("Estão alugados os seguintes veículos: ");
        for(Veiculo veiculo : veiculos){
            if(veiculo.estaAlugado()){
               System.out.println("Marca" + veiculo.getMarca());
               System.out.println("Valor: " + veiculo.getValorAluguel()); 
               System.out.println("Placa: " + veiculo.getPlaca());
               valorTotal = veiculo.getValorAluguel();
               System.out.println();
            }

        }

        System.out.println("O aluguel de todos os veículos alugados equivale a: " + valorTotal + " reais");
    }

    public void exibirDisponiveis(){

        double menorValor = 0;
        double maiorValor = 0;
        int indexMaiorValor = 0;
        int indexMenorValor = 0;

        System.out.println("###############################################");
        System.out.println("Estão disponíveis os seguintes veículos: ");
        for (Veiculo veiculo : veiculos){
            if(!veiculo.estaAlugado()){
               System.out.println("Marca" + veiculo.getMarca());
               System.out.println("Valor: " + veiculo.getValorAluguel()); 
               System.out.println("Placa: " + veiculo.getPlaca());
               System.out.println("Valor do aluguel: " + veiculo.getValorAluguel());
               if(veiculo.getValorAluguel() > maiorValor){
                    maiorValor = veiculo.getValorAluguel();
                    indexMaiorValor = veiculos.indexOf(veiculo);
               }
            }
        }

        menorValor = maiorValor;
        for (Veiculo veiculo : veiculos){
            if(veiculo.getValorAluguel() < menorValor){
                menorValor = veiculo.getValorAluguel();
                indexMenorValor = veiculos.indexOf(veiculo);
           }
        }

        System.out.println("O maior valor de aluguel é: " + maiorValor + "e pertence ao veiculo ");
        veiculos.get(indexMaiorValor).imprimirVeiculo();
        System.out.println();

        System.out.println("O menor valor de aluguel é: " + menorValor + "e pertence ao veiculo ");
        veiculos.get(indexMenorValor).imprimirVeiculo();
        System.out.println();
        

    }

    public void controlarManutencao(){

        double litrosOleoTotal = 0;
        
        System.out.println("Carros e motos que trocaram óleo: ");
        for(Veiculo veiculo : veiculos){
            if(veiculo instanceof Carro){
                Carro carro = (Carro)veiculo;
                if((carro.getQuilometragem() % 100000) == 0){
                    System.out.println("CARRO: ");
                    carro.imprimirVeiculo();
                    System.out.println();
                    litrosOleoTotal += 3.5;
                }
            }else{
                Moto moto = (Moto)veiculo;
                if((moto.getQuilometragem() % 5000) == 0){
                    System.out.println("MOTO: ");
                    moto.imprimirVeiculo();
                    System.out.println();
                    litrosOleoTotal += 1.5;
                }
            }

        }

        System.out.println("No total foram utilizados " + litrosOleoTotal + " litros de óleo");
    }



}
