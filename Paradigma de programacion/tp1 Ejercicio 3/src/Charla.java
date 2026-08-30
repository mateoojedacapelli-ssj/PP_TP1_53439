import java.util.List;
import java.util.ArrayList;

public class Charla extends Actividad {

    private String disertante;

    public Charla (String disertante, int idActividad, String tituloActividad, int cupoMAX) {
        super(idActividad, tituloActividad, cupoMAX);
        this.disertante = disertante;
    }

    public double calcularCostoMateriales() {

      return 0.0;
    }

    public String getTipo() {

        return "Charla";
    }
}
