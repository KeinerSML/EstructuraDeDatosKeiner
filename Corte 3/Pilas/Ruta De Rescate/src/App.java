/*5. Ruta de Rescate (Espeleología Geológica)
Un equipo de rescatistas entra en una cueva inexplorada. 
Para no perderse, van dejando "Estaciones de Seguridad" representadas por una 
baliza que registra los datos del entorno.

La Clase Estacion (Nodo): Debe contener nombrePunto (String), profundidad (int) y nivelOxigeno (double).
El Problema: Para salir de la cueva, el equipo debe seguir las estaciones en el orden inverso 
al que fueron colocadas (de la más profunda a la entrada).
Reto: Implementa el método retrocederASuperficie(). 
Este debe mostrar el nombre de cada estación a medida que se desapila. 
Importante: Si en alguna estación el nivelOxigeno es inferior al 18%, 
el sistema debe imprimir una alerta de "Uso de Tanque de Emergencia Requerido" al pasar por ese punto. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaEstaciones pila = new PilaEstaciones();

        int opcion;

        do {

            System.out.println("\n===== RUTA DE RESCATE =====");
            System.out.println("1. Agregar estación");
            System.out.println("2. Retirar estación");
            System.out.println("3. Ver estación del tope");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Retroceder a superficie");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese nombre del punto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese profundidad: ");
                    int profundidad = scanner.nextInt();

                    System.out.print("Ingrese nivel de oxígeno (%): ");
                    double oxigeno = scanner.nextDouble();

                    pila.push(nombre, profundidad, oxigeno);

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

                    pila.retrocederASuperficie();

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
