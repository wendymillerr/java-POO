public class Recepcionista extends Funcionario {
    private String horarioTrabalho;

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public void print(){
        super.print();
        System.out.println( "   Tipo: " + getClass() + " imd.academia.Recepcionista");
    }

}
