package aula006;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos especiais
    
    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = volume;
        this.ligado = ligado;
        this.tocando = tocando;
    }

    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean isLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean isTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("---------MENU----------");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i < getVolume(); i +=10){
            System.out.print("+");
        }
    }
    
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
             this.setVolume(50);
        }else{
            System.out.println("Error! First, turn on the control.");
        }
       
    }
 
    public void ligarMudo() {

        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
       }else{
           System.out.println("Error! First, turn on the control.");
       }
        
    }


    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 1);
        }
    }


    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(getVolume() - 1);
        }
        
    }

    
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            System.out.println("Pause");
        }
        
    }

  
    public void play() {
        if(this.isLigado() && !this.isTocando()){
            System.out.println("play sucess");
        }
    }
}
