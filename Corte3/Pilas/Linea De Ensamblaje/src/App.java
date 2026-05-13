/*1. Puerto Marítimo (Gestión de Contenedores)
En un puerto de carga, los contenedores se apilan en columnas verticales dentro de 
los barcos o en el muelle. Debido al espacio restringido, solo se puede acceder al contenedor que está en la cima.

La Clase Contenedor (Nodo): Debe contener idCodigo (String), empresa (String), peso (double) y tipoCarga (String).
El Problema: El supervisor necesita un reporte rápido de cuánta carga hay de una empresa 
en particular sin retirar los contenedores.
Reto: Implementa un método contarPorEmpresa(String nombreEmpresa) que recorra la pila y devuelva 
la cantidad total de contenedores que pertenecen a esa empresa. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaPiezas pila = new PilaPiezas();

        int opcion;

        do {

            System.out.println("\n===== CONTROL DE CALIDAD =====");
            System.out.println("1. Agregar pieza");
            System.out.println("2. Retirar pieza");
            System.out.println("3. Ver pieza del tope");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Limpiar hasta defecto");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese nombre de la pieza: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese número de serie: ");
                    String serie = scanner.nextLine();

                    System.out.print("¿La pieza es defectuosa? (true/false): ");
                    boolean defectuosa = scanner.nextBoolean();

                    pila.push(nombre, serie, defectuosa);

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

                    pila.limpiarHastaDefecto();

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
