public class EventoUniversitario {

    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    private String sala;
    private int idActividad;
    private String tituloActividad;
    private int cupo;


    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {

        this.id = id;
        this.titulo = titulo;
        this.gratuito = gratuito;
        cantidadEventos++;

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
        cantidadEventos++;


    }

    public void mostrarDatos() {

        System.out.println("Id del evento: " + this.id + ", titulo del evento: " + this.titulo + ", costo del evento: " + this.costoBase);
    }

    public double calcularCostoEstimado () {

        return this.costoBase + (this.costoBase*10/100);

    }

    public void asignarSala (String sala) {

        this.sala = sala;

    }

    public void crearActividad (int idActividad, String tituloActividad, int cupo) {

        this.idActividad = idActividad;
        this.tituloActividad = tituloActividad;
        this.cupo = cupo;

    }

    public int getCantidadEventos () {

        return cantidadEventos;

    }
}
