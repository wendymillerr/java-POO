package br.ufrn.imd.visao;

import br.ufrn.imd.dao.VeiculosDAO;
import br.ufrn.imd.modelo.Carro;
import br.ufrn.imd.modelo.Moto;
import br.ufrn.imd.modelo.Taxi;

public class VeiculosView {
    public static void main(String[] args) {

        VeiculosDAO veiculosDao = new VeiculosDAO();
        Carro carro1 = new Carro();
        carro1.setMotor(2);
        carro1.setQuilometragem(50);

        Carro carro2 = new Carro();
        carro2.setMotor(1.5);
        carro2.setQuilometragem(1000);


        Moto moto1 = new Moto();
        moto1.setCilindrada(150);
        moto1.setQuilometragem(700);

        Moto moto2 = new Moto();
        moto2.setCilindrada(600);
        moto2.setQuilometragem(300);

        Taxi taxi1 = new Taxi();
        taxi1.setQuantPessoas(4);
        taxi1.setQuilometragem(200);

        Taxi taxi2 = new Taxi();
        taxi2.setQuantPessoas(4);
        taxi2.setQuilometragem(5000);

        veiculosDao.addVeiculo(taxi2);
        veiculosDao.addVeiculo(taxi1);
        veiculosDao.addVeiculo(carro1);
        veiculosDao.addVeiculo(carro2);
        veiculosDao.addVeiculo(moto1);
        veiculosDao.addVeiculo(moto2);   
        veiculosDao.listCustoMensal();
    
    }



    

}
