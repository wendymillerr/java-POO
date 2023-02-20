package luta;

import java.util.Random;

public class Luta implements LutaMetodos{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void lutar() {
        if(this.isAprovada()){
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiante + "venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiado + "venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }

        }else{
            System.out.println("Luta não pode acontecer");
        }

    }

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if(lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2){
            this.setAprovada(true);
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        }else{
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }

    }

}
