package exemplopratico;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50.0f);
        }else if(t == "CP"){
            this.setSaldo(150.0f);
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {

        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
        }
    }

    public void depositar(float valorDeposito){
        if(this.getStatus()){
            this.setSaldo(getSaldo() + valorDeposito);
        }else{
            System.out.println("Impossível depositar.");
        }
    }

    public void sacar(float valorSaque){
        if (this.getStatus()){
            if(this.getSaldo() > valorSaque){
                 this.setSaldo(getSaldo() - valorSaque);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(){
        float mensalidade = 0;

        if(this.getTipo() == "CC"){
            mensalidade = 12.0f;
        }else if(this.getTipo() == "CP"){
            mensalidade = 20.0f;
        }
        if(this.getStatus()){
            if(this.getSaldo() > 0){
                this.setSaldo(this.getSaldo() - mensalidade);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível pagar. Conta fechada.");
        }
    }


    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

}
