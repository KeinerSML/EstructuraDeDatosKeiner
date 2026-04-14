/*4. Gestión de Mesas en Restaurante (Lista de Espera Circular)
Un restaurante popular tiene un sistema de lista de espera. Cuando una mesa se libera, 
el siguiente grupo en espera ocupa el turno y pasa al final del ciclo por si quiere pedir 
la carta nuevamente (para clientes VIP).

La Clase Grupo (Nodo): Debe contener nombreReserva (String), numeroDPersonas (int), 
esVip (boolean) y minutosEsperando (int).

El Problema: Los grupos normales se atienden y salen de la lista. Los grupos VIP, al ser atendidos, 
vuelven al final de la lista circular para una segunda ronda de atención. El sistema debe atender un grupo por turno.
Reto: Implementa el método atenderSiguiente() que tome el grupo de la cabeza, muestre su información, 
y si esVip == true, lo reinserté al final; si no, lo elimine. Muestra el estado de la lista después de cada atención. 
Llama al método 6 veces para simular la dinámica del restaurante. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();

        int opcion;

        do {
            System.out.println("\n===== RESTAURANTE =====");
            System.out.println("1. Agregar grupo");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Atender siguiente");
            System.out.println("4. Simular 6 turnos");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre reserva: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Número de personas: ");
                    int personas = scanner.nextInt();

                    System.out.print("¿Es VIP? (true/false): ");
                    boolean vip = scanner.nextBoolean();

                    System.out.print("Minutos esperando: ");
                    int minutos = scanner.nextInt();
                    scanner.nextLine();

                    lista.agregar(nombre, personas, vip, minutos);
                    System.out.println("Grupo agregado.");
                    break;

                case 2:
                    lista.mostrar();
                    break;

                case 3:
                    lista.atenderSiguiente();
                    break;

                case 4:
                    for (int i = 1; i <= 6; i++) {
                        System.out.println("\n--- TURNO " + i + " ---");
                        lista.atenderSiguiente();
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
