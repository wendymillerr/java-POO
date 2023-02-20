package luta;

public class Lutador implements Metodos {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int quantVitorias;
    private int quantDerrotas;
    private int quantEmpates;


    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, 
            int quantVitorias, int quantDerrotas, int quantEmpates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.quantVitorias = quantVitorias;
        this.quantDerrotas = quantDerrotas;
        this.quantEmpates = quantEmpates;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }


    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    public float getPeso() {
        return peso;
    }


    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if( this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 102.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }


    public int getQuantVitorias() {
        return quantVitorias;
    }


    public void setQuantVitorias(int quantVitorias) {
        this.quantVitorias = quantVitorias;
    }


    public int getQuantDerrotas() {
        return quantDerrotas;
    }


    public void setQuantDerrotas(int quantDerrotas) {
        this.quantDerrotas = quantDerrotas;
    }


    public int getQuantEmpates() {
        return quantEmpates;
    }


    public void setQuantEmpates(int quantEmpates) {
        this.quantEmpates = quantEmpates;
    }


    public void apresentar() {
        System.out.println("Lutador: "+ getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + "anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso() + " kg");
        System.out.println("Ganhou: " + getQuantVitorias());
        System.out.println("Perdeu: " + getQuantDerrotas());
        System.out.println("Empatou: " + getQuantEmpates());
    }


    public void empatarLuta() {
        setQuantEmpates(getQuantEmpates() + 1);
    }


    public void ganharLuta() {
        setQuantVitorias(getQuantVitorias() + 1);
    }


    public void perderLuta() {
        setQuantDerrotas(getQuantDerrotas() + 1);
        
    }

    public void status() {
        System.out.println(getNome());
        System.out.println(getQuantVitorias() + " vitórias");
        System.out.println(getQuantDerrotas() + " derrotas");
        System.out.println(getQuantEmpates() + " empates");
    }


    

}
