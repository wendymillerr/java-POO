package br.ufrn.imd.modelo;

public class Mulher  extends PessoaIMC{
    
    @Override
    public String resultIMC() {
        if(calculaIMC(altura, peso) < 19){
            return "Abaixo do peso ideal";
        }else if((calculaIMC(altura, peso) > 19) && (calculaIMC(altura, peso) < 25.8) ){
            return "Pesso ideal";
        }else if((calculaIMC(altura, peso) > 25.8)){
            return "Acima do peso ideal";
        }
        return null;
    }
        
    
}
