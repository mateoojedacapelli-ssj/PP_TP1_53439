import java.util.List;
import java.util.ArrayList;

public class EventoUniversitario {

    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    private Sala sala;
    private List<Actividad> actividades;


    public EventoUniversitario(String kkl, String titulo, int i, boolean b) {

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

    public void crearActividad (int idActividad, String tituloActividad, int cupoMax) {

        Actividad nuevaActividad = new Actividad(idActividad, tituloActividad, cupoMax);
        this.actividades.add(nuevaActividad);

    }

    public int getCantidadEventos () {

        return cantidadEventos;

    }
}
