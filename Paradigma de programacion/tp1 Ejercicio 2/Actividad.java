import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Actividad {

    private int id;
    private String titulo;
    private int cupoMaximo;
    public final static int CUPO_MINIMO = 5;
    private List<Inscripcion> inscripciones;



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
            System.out.println("Estudiante: " + inscripcion.getEstudiante().getNombre() +
                    " - Fecha: " + inscripcion.getFecha() +
                    " - Estado: " + inscripcion.getEstado());
        }
    }

}
