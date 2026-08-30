import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {

    protected int id;
    protected String titulo;
    protected int cupoMaximo;
    public final static int CUPO_MINIMO = 5;
    protected List<Inscripcion> inscripciones;



    public Actividad (int idActividad, String tituloActividad, int cupoMax) {
        this.id = idActividad;
        this.titulo = tituloActividad;
        this.cupoMaximo = cupoMax;
        this.inscripciones = new ArrayList<>();

    }

    public Inscripcion inscribir (Estudiante estudiante) {

        Inscripcion nuevainscripcion = new Inscripcion(LocalDate.now(), "En curso", estudiante, this);

        this.inscripciones.add(nuevainscripcion);

        return nuevainscripcion;

    }

    public void mostrarinscripciones() {

        System.out.println("la lista de inscrptos a la actividad " + this.titulo + "es: " );
        for (Inscripcion inscripcion : this.inscripciones) {
            System.out.println("Estudiante: " + inscripcion.getEstudiante().getNombre() + " - Fecha: " + inscripcion.getFecha() + " - Estado: " + inscripcion.getEstado());
        }
    }
    public final void mostrarIdentificacion() {
        System.out.println("El tipo de actividad es una " + this.getTipo() + " y si id es: " + this.id);
    }



    public abstract double calcularCostoMateriales();
    public abstract String getTipo();

}
