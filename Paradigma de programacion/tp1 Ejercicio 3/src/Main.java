import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        EventoUniversitario evento1 = new EventoUniversitario("1AA", "Evento nro 1", 1000, true);
        EventoUniversitario evento2 = new EventoUniversitario("1AB", "Evento nro 2", 1000, true);

        Sala lugar1 = new Sala(1212, "Campus");
        Sala lugar2 = new Sala(1213, "Pista atletismo");
        evento1.asignarSala(lugar1);
        evento2.asignarSala(lugar2);

        evento1.crearActividad(33, "Charla de emprendedores", 25, "charla");
        evento1.crearActividad(34, "Taller de ceramica", 15, "taller");
        evento2.crearActividad(12, "Taller de soldadura", 12, "taller");

        Estudiante estudiante1 = new Estudiante("1a", "Constanza Martinez");
        Estudiante estudiante2 = new Estudiante("1b", "Joaquin Lopez");
        Estudiante estudiante3 = new Estudiante("1c", "Tomas Capelli");

        Actividad primeraActividad = evento1.getActividades().get(0);
        Actividad segundaActividad = evento1.getActividades().get(1);
        Actividad PrimeraActividad = evento2.getActividades().get(0);

        evento1.getActividades().get(0).inscribir(estudiante1);
        evento1.getActividades().get(1).inscribir(estudiante3);
        evento2.getActividades().get(0).inscribir(estudiante2);
        evento2.getActividades().get(0).inscribir(estudiante1);

        if (evento1.getCantidadEventos() > 1) {
            System.out.println("La cantida de evento son:" + evento1.getCantidadEventos());
        } else {
            System.out.println("La cantidad de eventos es:" + evento1.getCantidadEventos());
        }
        evento1.mostrarDatos();
        System.out.println("Sus actividades son:");

        evento1.getActividades().get(0).mostrarIdentificacion();
        evento1.getActividades().get(1).mostrarIdentificacion();


        evento2.mostrarDatos();
        System.out.println("Sus actividades son:");

        evento2.getActividades().get(0).mostrarIdentificacion();

    }
}


