import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ColaPeaje cola = new ColaPeaje();

        int opcion;

        do {

            System.out.println("\n====== PEAJE INTELIGENTE ======");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Cobrar vehículo");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Cerrar turno");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Tipo de vehículo: ");
                    String tipo = scanner.nextLine();

                    System.out.print("Tarifa: ");
                    double tarifa = scanner.nextDouble();

                    System.out.print("¿Es exento? (true/false): ");
                    boolean exento = scanner.nextBoolean();
                    scanner.nextLine();

                    Vehiculo nuevo = new Vehiculo(
                            placa,
                            tipo,
                            tarifa,
                            exento
                    );

                    cola.enqueue(nuevo);

                    System.out.println("Vehículo registrado correctamente.");
                    break;

                case 2:

                    Vehiculo atendido = cola.dequeue();

                    if (atendido == null) {

                        System.out.println("No hay vehículos en la fila.");

                    } else {

                        System.out.println("\nVehículo cobrado:");
                        System.out.println(atendido);
                    }

                    break;

                case 3:

                    cola.mostrarCola();
                    break;

                case 4:

                    cola.cerrarTurno();
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
