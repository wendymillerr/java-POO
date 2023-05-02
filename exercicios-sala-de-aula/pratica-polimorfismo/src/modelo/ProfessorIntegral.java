package modelo;
import java.util.Date;

public class ProfessorIntegral extends Professor {
    public Date dataInicio;


    @Override
    public void lecionar() {
        System.out.println("O professor integral " + nome + " está lecionando.");
    }
    

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

}
