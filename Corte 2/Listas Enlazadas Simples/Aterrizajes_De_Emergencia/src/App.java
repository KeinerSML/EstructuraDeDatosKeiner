/*3. Torre de Control (Aterrizajes de Emergencia)
Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.

La Clase Vuelo (Nodo): Debe contener numeroVuelo(String), aerolinea(String), combustibleRestante(int) y pasajeros(int).
El Problema: Normalmente los vuelos se forman al final de la cola. Sin embargo, si un vuelo reporta menos de 10 unidades de combustible, debe ser movido inmediatamente al inicio de la lista (Cabeza).
Reto: Implementar el método reportarEmergencia(String numeroVuelo)que busque un vuelo en la cola y lo mueva al principio. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaVuelos cola = new ColaVuelos();
        int opcion;

        do {
            System.out.println("\n======== TORRE DE CONTROL ========");
            System.out.println("1. Agregar vuelo");
            System.out.println("2. Mostrar cola");
            System.out.println("3. Reportar emergencia");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Número de vuelo: ");
                    String numero = sc.nextLine();

                    System.out.print("Aerolínea: ");
                    String aerolinea = sc.nextLine();

                    System.out.print("Combustible restante: ");
                    int combustible = sc.nextInt();

                    System.out.print("Pasajeros: ");
                    int pasajeros = sc.nextInt();

                    cola.agregarVuelo(numero, aerolinea, combustible, pasajeros);
                    break;

                case 2:
                    System.out.println("\nCola de vuelos:");
                    cola.mostrarCola();
                    break;

                case 3:
                    System.out.print("Ingrese número de vuelo en emergencia: ");
                    String numEmergencia = sc.nextLine();
                    cola.reportarEmergencia(numEmergencia);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}
