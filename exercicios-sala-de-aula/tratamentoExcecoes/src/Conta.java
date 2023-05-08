public class Conta {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    

    public Conta(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double deposito){
        balance = balance + deposito;

    }

    public void withdrawinit(double valor){
        verificarTransacaoSaque(valor);
        balance -= valor;
    }

   public void verificarTransacaoSaque(double valor){
        if(valor > getWithdrawLimit()){
            throw new BusinessException("Erro de saque: A quantida excede o limite.");
        }else if(valor > balance){
            throw new BusinessException("Erro de saque: saldo insuficiente.");
        }
   }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    
}
