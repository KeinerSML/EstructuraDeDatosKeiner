import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria();

        int opcion;

        do {
            System.out.println("\n===== GALERÍA DE IMÁGENES =====");
            System.out.println("1. Agregar foto");
            System.out.println("2. Ver foto actual");
            System.out.println("3. Siguiente foto");
            System.out.println("4. Foto anterior");
            System.out.println("5. Reproducir galería");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del archivo: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tamaño (MB): ");
                    double tamano = sc.nextDouble();

                    sc.nextLine(); 

                    System.out.print("Resolución: ");
                    String resolucion = sc.nextLine();

                    galeria.agregarFoto(nombre, tamano, resolucion);
                    System.out.println("Foto agregada.");
                    break;

                case 2:
                    galeria.mostrarActual();
                    break;

                case 3:
                    galeria.siguiente();
                    break;

                case 4:
                    galeria.anterior();
                    break;

                case 5:
                    galeria.reproducirGaleria();
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
