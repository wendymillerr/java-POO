public class Produto{
    protected String nome;
    protected double preco;
    protected String marca;
    protected String descricao;
  
    public void setNome(String nome){
      this.nome = nome;
    }
  
    public void setPreco(double preco){
      this.preco = preco;
    }
  
    public void setMarca(String marca){
      this.marca = marca;
    }
  
    public void setDescricao(String descricao){
      this.descricao = descricao;
    }
  
    public String getNome(){
      return this.nome;
    }
  
    public double getPreco(){
      return this.preco;
    }
  
    public String getMarca(){
      return this.marca;
    }
  
    public String getDescricao(){
      return this.descricao;
    }
    
  } 
