import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ColaPacientes cola = new ColaPacientes();

        int opcion;

        do {

            System.out.println("\n====== URGENCIAS HOSPITALARIAS ======");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Atender un paciente");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Atender todos los pacientes");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Cédula: ");
                    String cedula = scanner.nextLine();

                    System.out.print("Nombre completo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Síntoma principal: ");
                    String sintoma = scanner.nextLine();

                    Paciente nuevo = new Paciente(
                            cedula,
                            nombre,
                            edad,
                            sintoma
                    );

                    cola.enqueue(nuevo);

                    System.out.println("Paciente registrado correctamente.");
                    break;

                case 2:

                    Paciente atendido = cola.dequeue();

                    if (atendido == null) {

                        System.out.println("No hay pacientes en espera.");

                    } else {

                        System.out.println("\nPaciente atendido:");
                        System.out.println(atendido);
                    }

                    break;

                case 3:

                    cola.mostrarCola();
                    break;

                case 4:

                    cola.atenderTodos();
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
