package tp1

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Estudiante> estudiantes;

            estudiantes = new ArrayList<>();

    EventoUniversitario evento1 = new EventoUniversitario( "AAB", "Maraton", 25, false); // Creo un evento

    EventoUniversitario evento2 = new EventoUniversitario(evento1); // Creo otro evento con el constructor copia

    Sala lugar1 = new Sala(1111, "campus"); // Creo una sala

    Sala lugar2 = new Sala(1222, "Pista atletismo"); // Creo otra sala

    evento1.asignarSala(lugar1); // asigno la sala "campus" al evento "maraton"

    evento2.asignarSala(lugar2); // Asigno la sala "pista atletismo" para el evento "maraton"

    evento1.crearActividad(001, "Venta comida", 75);

    evento2.crearActividad(002, "Venta ropa", 35);

    Estudiante estudiante1 = new Estudiante("AAAA", "Mateo");

        estudiantes.add(estudiante1);

    Estudiante estudiante2 = new Estudiante("AAAB", "Juan");

       estudiantes.add(estudiante2);


  }

