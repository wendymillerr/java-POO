import java.util.ArrayList;

public class Deposito{
  
  private ArrayList<Produto>produtos;

  public Deposito(){
    produtos =  new ArrayList<Produto>();
  }

  public void addProduto(Produto produto){
    produtos.add(produto);
  }

  public void removerProtudo(int index){
    produtos.remove(index);
  }

  public void getQuantProdutos(){
    int quantidadeProdutos = produtos.size();
    System.out.println("Existem " + quantidadeProdutos + " produto(s) no depósito." );
    
  }

  public void estaVazio(){
     boolean estoqueEstaVazio = this.produtos.isEmpty();
        if (estoqueEstaVazio == true)
            System.out.println("O estoque está vazio");
        else
            System.out.println("O estoque não está vazio");
  }

  public void maiorPreco(){
  
    double maiorPreco = 0;
    int indexProdutoMaisCaro = 0;
    
    for(Produto produto : produtos){
      
        if (produto.getPreco() > maiorPreco){
            maiorPreco = produto.getPreco();
            indexProdutoMaisCaro = produtos.indexOf(produto);
           
        }   
    }
    System.out.println("O maior preço é " + maiorPreco + " e pertence ao produto " + produtos.get(indexProdutoMaisCaro).getNome());
  }

}