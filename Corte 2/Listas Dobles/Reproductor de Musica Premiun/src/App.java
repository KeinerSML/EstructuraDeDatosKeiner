/*5. Reproductor de Música Premium
Mejora el ejercicio de Spotify de la semana pasada usando listas dobles.

La Clase Cancion (Nodo): Debe contener titulo (String), artista (String) y duracion (int).
El Problema: El reproductor ahora permite la función "Canción Anterior" de manera eficiente sin tener que 
recorrer toda la lista desde el principio.
Reto: Implementa un método saltarAtras() que retroceda una posición y saltarAdelante() que avance una. 
Si se intenta saltar atrás desde la primera canción, debe mostrar un mensaje de error. */


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaReproduccion lista = new ListaReproduccion();

        int opcion;

        do {
            System.out.println("\n====== SPOTIFY PREMIUM ======");
            System.out.println("1. Agregar canción");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Mostrar canción actual");
            System.out.println("4. Siguiente canción");
            System.out.println("5. Canción anterior");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = scanner.nextInt();

                    lista.agregarCancion(titulo, artista, duracion);
                    System.out.println("Canción agregada.");
                    break;

                case 2:
                    lista.mostrarLista();
                    break;

                case 3:
                    lista.mostrarActual();
                    break;

                case 4:
                    lista.saltarAdelante();
                    break;

                case 5:
                    lista.saltarAtras();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
