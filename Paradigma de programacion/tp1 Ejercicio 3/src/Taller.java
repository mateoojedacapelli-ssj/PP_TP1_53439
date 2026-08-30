public class Taller extends Actividad {

    private boolean requiereNotebook;

    public Taller (boolean requiereNotebook, int idActividad, String tituloActividad, int cupoMAX) {
        super(idActividad, tituloActividad, cupoMAX);
        this. requiereNotebook = requiereNotebook;
    }

    public double calcularCostoMateriales() {
        if (requiereNotebook) {
            return 5000.00;
        }
        return 2000.00;
    }

    public String getTipo () {
        return "Taller";
    }
}
