public class MaquinaRefrigerante {
	
    // Atributos.
    private int preco;
    private int balanco;
    private int total;
    private boolean darTroco;

    // Método construtor para inicializar os atributos
    public MaquinaRefrigerante(int valor) {
        preco = valor;
        balanco = 0;
        total = 0;
	darTroco = false;
    }

    // Retorna o preço
    public int getPreco(){
        return preco;
    }

    // Retorna o balanço corrente
    public int getBalanco(){
        return balanco;
    }
    
    public void setDarTroco(){
	System.out.println("Entrou em setTroco");
	darTroco = true;

	}

    // Recebe um valor em dinheiro
    public void inserirDinheiro(int valor){

	if(valor > 0){
        	balanco += valor;
		System.out.println("Valor inserido com sucesso!!!!");
	}else{
		System.out.println("Use um valor positivo.");
	}
    }
  

     public void comprarRefrigerante(){

	if(balanco >= preco){
	System.out.println("################");
	System.out.println("## RECIBO ##");
	System.out.println("## Refrigerante ##");
	System.out.println("## R$ " + preco + ",00");
	System.out.println("#################");
	System.out.println();
	
	total += preco;
	balanco = balanco - preco;

		if(balanco > 0 && darTroco == true){
			System.out.println("################");
			System.out.println("## Troco ##");
			System.out.println("## R$ " + devolverTroco() + ",00");
			System.out.println("################");
			}
	}else{
		System.out.println("Você precisa inserir pelo menos: R$ " + (preco - balanco) + ",00");
	}

}


     public int devolverTroco(){
	int valorDevolver;
	valorDevolver = balanco;
	balanco = 0;

	return valorDevolver;

	}

    // Imprimir o preço do refrigerante
    public void imprimirPreco(){
        System.out.println("##################");
        System.out.println("# Preco ##########");
        System.out.println("# Refrigerante");
        System.out.println("# R$ " + preco + ",00");
        System.out.println("##################");
    }

		
}
