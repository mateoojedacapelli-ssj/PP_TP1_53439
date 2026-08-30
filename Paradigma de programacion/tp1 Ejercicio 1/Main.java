public class Main {
    public static void main(String[] args) {
        EventoUniversitario nomeventouniversitario1 = new EventoUniversitario("Id", "Titulo", 2000, false);

        nomeventouniversitario1.mostrarDatos();

        EventoUniversitario nomeventouniversitario2 = new EventoUniversitario(nomeventouniversitario1);

        nomeventouniversitario2.mostrarDatos();

        nomeventouniversitario1.asignarSala("Espacio 12");

        nomeventouniversitario2.asignarSala("Espacio 15");

        nomeventouniversitario1.crearActividad(1214, "Titulo de la actividad", 200);

        nomeventouniversitario2.crearActividad(1215, "Titulo de la actividad", 250);

        System.out.println("La cantidad de eventos es: " + nomeventouniversitario1.getCantidadEventos());
    }

}