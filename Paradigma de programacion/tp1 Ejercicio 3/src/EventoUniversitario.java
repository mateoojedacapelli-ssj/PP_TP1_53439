import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {

    private final String id ;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    private Sala sala;
    private List<Actividad> actividades;


    public EventoUniversitario(String id, String titulo, int costoBase, boolean gratuito) {

        this.id = id;
        this.titulo = this.titulo;
        this.gratuito = gratuito;
        cantidadEventos++;
        this.actividades = new ArrayList<>();

        if (gratuito == true) {
            this.costoBase = 0;
        } else {
            this.costoBase = costoBase;
        }
    }
    public EventoUniversitario (EventoUniversitario obj) {
        this.id = obj.id;
        this.titulo = obj.titulo;
        this.gratuito = obj.gratuito;
        this.costoBase = obj.costoBase;
        this.actividades = new ArrayList<>();
        cantidadEventos++;


    }

    public void mostrarDatos() {

        System.out.println("Id del evento: " + this.id + ", titulo del evento: " + this.titulo + ", costo del evento: " + this.costoBase);
    }

    public double calcularCostoEstimado () {

        return this.costoBase + (this.costoBase*10/100);

    }

    public void asignarSala (Sala sala) {

        this.sala = sala;

    }

    public void crearActividad (int idActividad, String tituloActividad, int cupoMax, String tipo) {

        if (tipo.equalsIgnoreCase("charla")) {

            Charla nuevaActividad = new Charla ("disrtante a confirmar", idActividad, tituloActividad, cupoMax); //llamo al constructor
            this.actividades.add(nuevaActividad); //Añado esta actividad creada a la lista de actividades
        }
        else  {

            Taller nuevaActividad = new Taller(true, idActividad, tituloActividad, cupoMax);
            this.actividades.add(nuevaActividad); //Añado esta actividad creada a la lista de actividades
        }



    }

    public int getCantidadEventos () {

        return cantidadEventos;

    }

    public List<Actividad> getActividades() {
        return this.actividades;
    }
}
