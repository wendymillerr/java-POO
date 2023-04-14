import java.util.*;

public class ProdutoNaoDuravel extends Produto{

  private Date dataValidade;
  private String genero;

  public void setDataValidade(Date data){
    this.dataValidade = data;
  }
  public void setGenero(String genero){
    this.genero = genero;
  }

  public Date getDataValidade(){
    return this.dataValidade;
  }
  public String getGenero(){
    return this.genero;
  }
  
}