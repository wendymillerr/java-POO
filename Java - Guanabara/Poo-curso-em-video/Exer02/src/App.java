import exemplopratico.*;

public class App {
    public static void main(String[] args) throws Exception {
       ContaBanco pessoa1 = new ContaBanco();
       pessoa1.setDono("wendy");
       pessoa1.setTipo("CC");
       pessoa1.setNumConta(36651);
       pessoa1.setSaldo(10000);
       pessoa1.setStatus(true);
       pessoa1.estadoAtual();
       pessoa1.pagarMensal();
       pessoa1.abrirConta("CP");
       System.out.println(pessoa1.getTipo());
       
    }
}
