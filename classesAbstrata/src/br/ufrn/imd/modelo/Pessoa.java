package br.ufrn.imd.modelo;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Pessoa{
    protected String nome;
    protected Date dataNascimento;

    

    public Pessoa() {
      
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataNascimentoStr = format.format(dataNascimento);
        return "nome= " + nome + "\ndataNascimento= " + dataNascimentoStr;
    }


    
}