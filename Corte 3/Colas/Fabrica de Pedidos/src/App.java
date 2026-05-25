import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ColaPedidos cola = new ColaPedidos();

        int opcion;

        do {

            System.out.println("\n====== FÁBRICA DE PEDIDOS ======");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Procesar un pedido");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Procesar todos los pedidos");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Número del pedido: ");
                    String numero = scanner.nextLine();

                    System.out.print("Cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.print("Total a pagar: ");
                    double total = scanner.nextDouble();

                    System.out.print("¿Está cancelado? (true/false): ");
                    boolean cancelado = scanner.nextBoolean();
                    scanner.nextLine();

                    Pedido nuevo = new Pedido(
                            numero,
                            cliente,
                            total,
                            cancelado
                    );

                    cola.enqueue(nuevo);

                    System.out.println("Pedido agregado correctamente.");
                    break;

                case 2:

                    Pedido pedido = cola.dequeue();

                    if (pedido == null) {

                        System.out.println("No hay pedidos en cola.");

                    } else {

                        System.out.println("\nPedido procesado:");
                        System.out.println(pedido);
                    }

                    break;

                case 3:

                    cola.mostrarCola();
                    break;

                case 4:

                    cola.procesarPedidos();
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