import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ColaImpresion cola = new ColaImpresion();

        int opcion;

        do {

            System.out.println("\n====== IMPRESORA COMPARTIDA ======");
            System.out.println("1. Agregar documento");
            System.out.println("2. Imprimir documento");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Calcular páginas totales");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre del archivo: ");
                    String archivo = scanner.nextLine();

                    System.out.print("Usuario: ");
                    String usuario = scanner.nextLine();

                    System.out.print("Número de páginas: ");
                    int paginas = scanner.nextInt();

                    System.out.print("¿Es a color? (true/false): ");
                    boolean color = scanner.nextBoolean();
                    scanner.nextLine();

                    Documento nuevo = new Documento(
                            archivo,
                            usuario,
                            paginas,
                            color
                    );

                    cola.enqueue(nuevo);

                    System.out.println("Documento agregado correctamente.");
                    break;

                case 2:

                    Documento impreso = cola.dequeue();

                    if (impreso == null) {

                        System.out.println("No hay documentos en cola.");

                    } else {

                        System.out.println("\nImprimiendo documento:");
                        System.out.println(impreso);
                    }

                    break;

                case 3:

                    cola.mostrarCola();
                    break;

                case 4:

                    int total = cola.calcularPaginasTotales();

                    System.out.println("\nTotal de páginas pendientes: "
                            + total);

                    break;

                case 5:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}