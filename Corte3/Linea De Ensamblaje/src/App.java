import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese nombre de la pieza: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese número de serie: ");
                    String serie = sc.nextLine();

                    System.out.print("¿La pieza es defectuosa? (true/false): ");
                    boolean defectuosa = sc.nextBoolean();

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

        sc.close();
    }
}
