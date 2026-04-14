/*3. Planificador de CPU (Algoritmo Round Robin)
Los sistemas operativos usan el algoritmo Round Robin para repartir el tiempo del procesador entre varios 
procesos de forma justa: cada proceso recibe un pequeño intervalo de tiempo llamado quantum. 
Si no termina, espera su siguiente turno.

La Clase Proceso (Nodo): Debe contener nombre (String), pid (int), tiempoRestante (int) y prioridad (int - del 1 al 3).

El Problema: El planificador debe recorrer la lista circular en bucle. 
En cada turno, descuenta el quantum del tiempoRestante del proceso actual. 
Cuando tiempoRestante <= 0, el proceso termina y se elimina de la lista.

Reto: Implementa el método ejecutar(int quantum) que simule el planificador. 
Imprime en cada turno cuál proceso se está ejecutando, cuánto tiempo le queda y si terminó. 
El ciclo debe terminar cuando la lista quede vacía. Al final, imprime el orden en que terminaron los procesos. */


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();

        int opcion;

        do {
            System.out.println("\n===== PLANIFICADOR CPU (ROUND ROBIN) =====");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Mostrar procesos");
            System.out.println("3. Ejecutar Round Robin");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("PID: ");
                    int pid = scanner.nextInt();

                    System.out.print("Tiempo restante: ");
                    int tiempo = scanner.nextInt();

                    System.out.print("Prioridad (1-3): ");
                    int prioridad = scanner.nextInt();
                    scanner.nextLine();

                    lista.agregar(nombre, pid, tiempo, prioridad);
                    System.out.println("Proceso agregado.");
                    break;

                case 2:
                    lista.mostrar();
                    break;

                case 3:
                    System.out.print("Quantum: ");
                    int quantum = scanner.nextInt();
                    lista.ejecutar(quantum);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
