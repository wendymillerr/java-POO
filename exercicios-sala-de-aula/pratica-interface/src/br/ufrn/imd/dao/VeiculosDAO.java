package br.ufrn.imd.dao;
import java.util.ArrayList;
import br.ufrn.imd.modelo.Veiculo;


public class VeiculosDAO {
    private ArrayList<Veiculo>veiculos;

    public VeiculosDAO(){
        veiculos = new ArrayList<Veiculo>();
    }

    public void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void listCustoMensal(){
        for (Veiculo veiculo : veiculos) {
            veiculo.custoMensal();
        }
    }
}
