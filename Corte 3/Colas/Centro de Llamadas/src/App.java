import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ColaLlamadas cola = new ColaLlamadas();

        int opcion;

        do {

            System.out.println("\n====== CENTRO DE LLAMADAS ======");
            System.out.println("1. Agregar llamada");
            System.out.println("2. Atender llamada");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Contar llamadas por motivo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ID de llamada: ");
                    String id = scanner.nextLine();

                    System.out.print("Nombre del cliente: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Motivos disponibles:");
                    System.out.println("- Facturación");
                    System.out.println("- Soporte Técnico");
                    System.out.println("- Cancelación");
                    System.out.println("- Información");

                    System.out.print("Motivo de consulta: ");
                    String motivo = scanner.nextLine();

                    System.out.print("Duración estimada (minutos): ");
                    int duracion = scanner.nextInt();
                    scanner.nextLine();

                    Llamada nueva = new Llamada(
                            id,
                            nombre,
                            motivo,
                            duracion
                    );

                    cola.enqueue(nueva);

                    System.out.println("Llamada agregada correctamente.");
                    break;

                case 2:

                    Llamada atendida = cola.dequeue();

                    if (atendida == null) {
                        System.out.println("No hay llamadas en espera.");
                    } else {
                        System.out.println("Atendiendo llamada:");
                        System.out.println(atendida);
                    }

                    break;

                case 3:

                    cola.mostrarCola();
                    break;

                case 4:

                    System.out.print("Ingrese el motivo a buscar: ");
                    String buscar = scanner.nextLine();

                    int cantidad = cola.contarPorMotivo(buscar);

                    System.out.println("Cantidad de llamadas con motivo '"
                            + buscar + "': " + cantidad);

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
