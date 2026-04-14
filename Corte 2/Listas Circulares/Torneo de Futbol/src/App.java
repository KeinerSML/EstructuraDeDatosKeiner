/*5. Torneo de Fútbol (Fixture Round Robin)
En un torneo de fútbol por todos contra todos, cada equipo debe enfrentarse exactamente una vez 
contra cada uno de los demás equipos. El algoritmo Round Robin fija los partidos rotando los equipos en un ciclo.

La Clase Equipo (Nodo): Debe contener nombre (String), ciudad (String), puntos (int) y golesFavor (int).
El Problema: El fixture se genera rotando la lista: en cada jornada, se enfrentan los equipos opuestos del ciclo 
(el primero con el último, el segundo con el penúltimo, etc.). Un equipo queda fijo (la cabeza) y el resto 
rota una posición hacia adelante en cada jornada.
Reto: Implementa el método generarFixture() que imprima todos los partidos de una jornada completa 
para 6 equipos (3 partidos por jornada). Luego, rota los equipos una posición y repite hasta que 
todos se hayan enfrentado. Al final, imprime la tabla de posiciones ordenando 
los equipos de mayor a menor puntaje (puedes asignar puntos aleatorios o fijos para la simulación). */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();

        int opcion;

        do {
            System.out.println("\n===== TORNEO FÚTBOL =====");
            System.out.println("1. Agregar equipo");
            System.out.println("2. Mostrar equipos");
            System.out.println("3. Generar fixture");
            System.out.println("4. Cargar equipos de prueba");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ciudad: ");
                    String ciudad = scanner.nextLine();

                    lista.agregar(nombre, ciudad);
                    System.out.println("Equipo agregado.");
                    break;

                case 2:
                    lista.mostrar();
                    break;

                case 3:
                    lista.generarFixture();
                    break;

                case 4:
                    lista.agregar("Equipo A", "Bogotá");
                    lista.agregar("Equipo B", "Medellín");
                    lista.agregar("Equipo C", "Cali");
                    lista.agregar("Equipo D", "Barranquilla");
                    lista.agregar("Equipo E", "Cartagena");
                    lista.agregar("Equipo F", "Bucaramanga");
                    System.out.println("Equipos de prueba cargados.");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}