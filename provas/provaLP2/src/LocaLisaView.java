public class LocaLisaView {
    public static void main(String[] args) {
       
       Estoque estoque = new Estoque();
       
        Carro carro1 = new Carro();
        carro1.setMarca("Volvo");
        carro1.setPotenciaMotor(2);
        carro1.setPlaca("XRF123");
        carro1.setQuantPortas(4);
        carro1.setQuilometragem(1500);
        carro1.setValorAluguel(2000);
        carro1.setEstaAlugado(true);


        Carro carro2 = new Carro();
        carro2.setPlaca("XLI133");
        carro2.setMarca("Volvo");
        carro2.setPotenciaMotor(2);
        carro2.setQuantPortas(4);
        carro2.setQuilometragem(1500);
        carro2.setValorAluguel(2000);
        carro2.setEstaAlugado(false);

        Carro carro3 = new Carro();
        carro3.setPlaca("XLI133");
        carro3.setMarca("Ford");
        carro3.setPotenciaMotor(1.5);
        carro3.setQuantPortas(2);
        carro3.setQuilometragem(20000);
        carro3.setValorAluguel(500);
        carro3.setEstaAlugado(true);


        Moto moto1 = new Moto();
        moto1.setCilindradas(250);
        moto1.setMarca("XRL");
        moto1.setPlaca("TRF593");
        moto1.setQuilometragem(10000);
        moto1.setValorAluguel(1000);
        moto1.setEstaAlugado(true);
        moto1.setTipoPartida("eletrica");


        Moto moto2 = new Moto();
        moto2.setCilindradas(250);
        moto2.setMarca("Honda");
        moto2.setPlaca("CHB389");
        moto2.setQuilometragem(15000);
        moto2.setValorAluguel(500);
        moto2.setTipoPartida("eletrica");
        moto2.setEstaAlugado(true);

        Moto moto3 = new Moto();
        moto3.setCilindradas(300);
        moto3.setMarca("Honda");
        moto3.setPlaca("HFT987");
        moto3.setQuilometragem(5000);
        moto3.setValorAluguel(400);
        moto3.setEstaAlugado(false);
        moto3.setTipoPartida("eletrica");




        estoque.addVeiculo(carro1);
        estoque.addVeiculo(carro2);
        estoque.addVeiculo(carro3);
        estoque.addVeiculo(moto1);
        estoque.addVeiculo(moto2);
        estoque.addVeiculo(moto3);
        estoque.listarVeiculos();
        estoque.exibirVeiculosAlugados();
        estoque.controlarManutencao();

    }
}
