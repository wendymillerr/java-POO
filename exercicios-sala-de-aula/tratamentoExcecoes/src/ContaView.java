import java.util.Scanner;

public class ContaView {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os dados:");
        System.out.println("Numero");
        int number = scanner.nextInt();
        System.out.println("Nome:");
        String nome = scanner.next();
        System.out.println("Balanço");
        double balanco = scanner.nextDouble();
        System.out.println("Limite de saque:");
        double withdrawLimit = scanner.nextDouble();


        Conta conta = new Conta(number, nome, balanco, withdrawLimit);

        System.out.println("Informe a quantia que deseja sacar: ");
        double amount = scanner.nextDouble();
        try{
            conta.withdrawinit(amount);
            System.out.println( "Novo saldo: " + conta.getBalance());
        
        }catch(BusinessException e){
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
