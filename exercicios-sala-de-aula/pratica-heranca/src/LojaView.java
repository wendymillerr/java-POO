import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class LojaView {
    public static void main(String[] args)  throws ParseException{

      Date data = new Date();
      SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

      Deposito deposito = new Deposito();

      ProdutoDuravel carro = new ProdutoDuravel();
      carro.setDescricao("motor forte");
      carro.setPreco(20000);
      carro.setMarca("fiat");
      carro.setNome("carro esportivo");
      carro.setDurabilidade(10);


      ProdutoDuravel livro = new ProdutoDuravel();
      livro.setDescricao("Livro romance");
      livro.setDurabilidade(5);
      livro.setMarca("leitura");
      livro.setPreco(26.00);


      ProdutoDuravel celular = new ProdutoDuravel();
      celular.setDescricao("Bateria de ponta");
      celular.setDurabilidade(3);
      celular.setMarca("xiaomi");
      celular.setPreco(1500.00);


      ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel();
      chocolate.setDescricao("com cubos de fruta");
      chocolate.setGenero("Alimenticio");
      chocolate.setMarca("Cacau show");
      chocolate.setNome("Mini show lanut 108g");
      data = formato.parse("20-06-2023");
      chocolate.setDataValidade(data);


      ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel();
      sabonete.setDescricao("Sabonete");
	  sabonete.setNome("Buque de Jasmim");
	  sabonete.setMarca("Lux");
	  sabonete.setPreco(2.69);
	  sabonete.setGenero("Higiene_pessoal");
	  data = formato.parse("10-05-2024");
	  sabonete.setDataValidade(data);

      System.out.println("Verificando depósito...");
      deposito.estaVazio();
      deposito.addProduto(sabonete);  
      deposito.addProduto(carro);
      deposito.addProduto(chocolate);
      deposito.addProduto(livro);
      deposito.addProduto(celular);

      System.out.println("Verificando produtos no depósito...");
      deposito.getQuantProdutos();

      deposito.maiorPreco();
      deposito.removerProtudo(0);
      System.out.println("Produtos no estoque: ");
      deposito.getQuantProdutos();




    }
  }