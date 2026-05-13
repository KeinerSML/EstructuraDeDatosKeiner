/*2. Control de Calidad (Línea de Ensamblaje)
Un brazo robótico en una fábrica de motores apila componentes siguiendo una secuencia precisa. Un sensor de visión artificial inspecciona cada pieza después de ser colocada.

La Clase Pieza (Nodo): Debe contener nombrePieza (String), numeroSerie (String) y esDefectuosa (boolean).
El Problema: Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente.
Reto: Crea un método limpiarHastaDefecto() que extraiga (pop) todas las piezas de la pila hasta encontrar 
la primera que tenga esDefectuosa = true. El método debe imprimir el nombre de todas 
las piezas "buenas" que tuvieron que ser retiradas y descartadas antes de llegar a la pieza fallida. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaContenedores pila = new PilaContenedores();

        int opcion;

        do {

            System.out.println("\n===== PUERTO MARÍTIMO =====");
            System.out.println("1. Agregar contenedor");
            System.out.println("2. Retirar contenedor");
            System.out.println("3. Ver contenedor del tope");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Contar contenedores por empresa");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese código: ");
                    String codigo = scanner.nextLine();

                    System.out.print("Ingrese empresa: ");
                    String empresa = scanner.nextLine();

                    System.out.print("Ingrese peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Ingrese tipo de carga: ");
                    String tipo = scanner.nextLine();

                    pila.push(codigo, empresa, peso, tipo);

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

                    System.out.print("Ingrese nombre de la empresa: ");
                    String nombreEmpresa = scanner.nextLine();

                    int cantidad = pila.contarPorEmpresa(nombreEmpresa);

                    System.out.println("Cantidad de contenedores de "
                            + nombreEmpresa + ": " + cantidad);

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