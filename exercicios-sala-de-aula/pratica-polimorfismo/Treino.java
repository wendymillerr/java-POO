public class Treino {
    private String atividade;
    private String horario;

    public Treino(String horario, String atividade){
        this.atividade = atividade;
        this.horario = horario;
    }

    public String getAtividade() {
        return atividade;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void imprimirTreino(){
        System.out.println(atividade + " " + horario);
        
    }
}
