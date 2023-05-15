package br.ufrn.imd.visao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import br.ufrn.imd.modelo.Homem;
import br.ufrn.imd.modelo.Mulher;
import br.ufrn.imd.modelo.PessoaIMC;

public class PrincipalView {
    public static void main(String[] args) throws ParseException{
        ArrayList<PessoaIMC> pessoas = new ArrayList<PessoaIMC>();
        Date dataNascimento = new Date(0);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Homem homem1 = new Homem();
        Homem homem2 = new Homem();

        Mulher mulher1 = new Mulher();
        Mulher mulher2 = new Mulher();

        homem1.setAltura(1.86);
        homem1.setPeso(84.0);
        homem1.setNome("fabio");
        dataNascimento =  formato.parse("15-06-1998");
        homem1.setDataNascimento(dataNascimento);
        System.out.println(homem1.toString());


        homem2.setNome("Lucas");
        homem2.setAltura(1.85);
        homem2.setPeso(96.0);
        dataNascimento =  formato.parse("15-07-2000");
        homem2.setDataNascimento(dataNascimento);
        System.out.println(homem2.toString());
        

        mulher1.setNome("Adriana");
        mulher1.setAltura(1.76);
        mulher1.setPeso(65.0);
        dataNascimento = formato.parse("04-05-2002");
        mulher1.setDataNascimento(dataNascimento);
        System.out.println(mulher1.toString());

        mulher2.setNome("Jadna");
        mulher2.setAltura(1.85);
        mulher2.setPeso(120.0);
        dataNascimento = formato.parse("06-01-1992");
        mulher2.setDataNascimento(dataNascimento);
        System.out.println(mulher2.toString());
        
    }
}
