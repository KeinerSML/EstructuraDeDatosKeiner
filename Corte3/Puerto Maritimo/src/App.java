import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Ingrese empresa: ");
                    String empresa = sc.nextLine();

                    System.out.print("Ingrese peso: ");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Ingrese tipo de carga: ");
                    String tipo = sc.nextLine();

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
                    String nombreEmpresa = sc.nextLine();

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

        sc.close();
    }
}
