package br.ufrn.imd.modelo;

public class Homem extends PessoaIMC{

    @Override
    public String resultIMC(){
        if(calculaIMC(altura, peso) < 20.7){
           return "Abaixo do peso ideal";
        }else if((calculaIMC(altura, peso) > 20.7) && (calculaIMC(altura, peso) < 26.4) ){
            return "Pesso ideal";
        }else if((calculaIMC(altura, peso) > 26.4)){
            return "Acima do peso ideal";
        }
        return null;
    }
    



    
}
