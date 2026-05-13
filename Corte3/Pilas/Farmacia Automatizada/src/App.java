/*4. Farmacia Automatizada (Dispensador Tubo LIFO)
En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores verticales. 
El personal introduce las cajas por la parte superior y las retira de la misma forma 
(el último lote en llegar es el primero en ser despachado).

La Clase Medicamento (Nodo): Debe contener nombre (String), lote (String) y diasParaVencer (int).
El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
Reto: Implementa un método validarDespacho() que revise el medicamento en el tope. 
Si está a punto de vencer, debe ser retirado automáticamente y el sistema debe revisar el siguiente. 
El proceso se repite hasta que el tope sea un medicamento seguro o la pila quede vacía. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaMedicamentos pila = new PilaMedicamentos();

        int opcion;

        do {

            System.out.println("\n===== FARMACIA AUTOMATIZADA =====");
            System.out.println("1. Agregar medicamento");
            System.out.println("2. Retirar medicamento");
            System.out.println("3. Ver medicamento del tope");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Validar despacho");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese lote: ");
                    String lote = scanner.nextLine();

                    System.out.print("Ingrese días para vencer: ");
                    int dias = scanner.nextInt();

                    pila.push(nombre, lote, dias);

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

                    pila.validarDespacho();

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