public class ProfessorHorista extends Professor{
    
    private int horasTrabalhadas;
    public static final double VALOR_HORA_TRABALHO = 25;
    
    
    @Override
    public void lecionar() {
        System.out.println("O professor horista " + nome + " está lecionando.");
    }
    
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getSalario() {
        return salario + horasTrabalhadas * VALOR_HORA_TRABALHO;
    }
    



}
