import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Navegador nav = new Navegador();

        int opcion;

        do {
            System.out.println("\n===== NAVEGADOR =====");
            System.out.println("1. Abrir pestaña");
            System.out.println("2. Ver pestaña actual");
            System.out.println("3. Ir a siguiente");
            System.out.println("4. Ir a anterior");
            System.out.println("5. Cerrar pestaña por URL");
            System.out.println("6. Mostrar todas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("URL: ");
                    String url = sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    nav.abrirPestana(titulo, url, hora);
                    break;

                case 2:
                    nav.mostrarActual();
                    break;

                case 3:
                    nav.siguiente();
                    break;

                case 4:
                    nav.anterior();
                    break;

                case 5:
                    System.out.print("URL a cerrar: ");
                    String cerrarUrl = sc.nextLine();
                    nav.cerrarPestanaActual(cerrarUrl);
                    break;

                case 6:
                    nav.mostrarTodas();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
