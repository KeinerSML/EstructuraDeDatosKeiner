/*3. Logística de Distribución (Callejón sin Salida)
Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy estrecho. 
Los camiones de reparto entran uno tras otro y quedan "atrapados" en el orden de llegada. 
El último camión en entrar debe ser obligatoriamente el primero en salir para permitir que los demás se retiren.

La Clase Camion (Nodo): Debe contener placa (String), conductor (String) y cargaToneladas (double).
El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover 
los camiones físicamente (solo consultando la estructura).
Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola) y calcule 
la suma total de cargaToneladas de todos los camiones estacionados. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaCamiones pila = new PilaCamiones();

        int opcion;

        do {

            System.out.println("\n===== LOGÍSTICA DE DISTRIBUCIÓN =====");
            System.out.println("1. Agregar camión");
            System.out.println("2. Retirar camión");
            System.out.println("3. Ver camión del tope");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Calcular carga total");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Ingrese conductor: ");
                    String conductor = scanner.nextLine();

                    System.out.print("Ingrese carga en toneladas: ");
                    double carga = scanner.nextDouble();

                    pila.push(placa, conductor, carga);

                    break;

                case 2:

                    pila.pop();

                    break;

                case 3:

                    pila.peek();

                    break;

                case 4:

                    pila.mostrarPila();

                    break;

                case 5:

                    double total = pila.calcularCargaTotal();

                    System.out.println("Carga total en el callejón: "
                            + total + " toneladas.");

                    break;

                case 6:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}