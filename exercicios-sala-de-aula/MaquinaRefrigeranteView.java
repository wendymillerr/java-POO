
public class MaquinaRefrigeranteView{


	public static void main(String args[]){
		System.out.println("Bem vindo ao programa!");
		MaquinaRefrigerante maquina = new MaquinaRefrigerante(5);
		maquina.imprimirPreco();
		System.out.println("");
		maquina.inserirDinheiro(20);
		System.out.println(" ");
		System.out.println("Balanço atual => " + maquina.getBalanco());

		maquina.comprarRefrigerante();
		maquina.setDarTroco();
		maquina.comprarRefrigerante();
	}

}