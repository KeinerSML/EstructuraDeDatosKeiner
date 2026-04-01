import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        ColaTren tren = new ColaTren();

        do {
            System.out.println("\n===================================");
            System.out.println("    TREN DE CARGA - Menu Principal  ");
            System.out.println("===================================");
            System.out.println("1. Nuevo vagon (Agregar al final del tren). ");
            System.out.println("2. Calcular el peso total de la carga. ");
            System.out.println();
            System.out.println("0. Salir.");
            System.out.println("===================================");
            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el contenido del vagon: ");
                    scanner.nextLine();
                    String contenido = scanner.nextLine();
                    System.out.println("Ingrese el peso del vagon (TONELADAS): ");
                    double pesoToneladas = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingresa el origen del vagon: ");
                    String origen = scanner.nextLine();
                    System.out.println("Ingresa el destino del vagon: ");
                    String destino = scanner.nextLine();

                    Vagon nuevoVagon = new Vagon(contenido, pesoToneladas, origen, destino);
                    tren.agregarVagon(nuevoVagon);
                    break;
                case 2:
                    double pesoTotal = tren.calcularPesoTotal();
                    System.out.println("El peso total de la carga es:  " + pesoTotal + " toneladas");
                    break;    
                case 0:
                    System.out.println("Saliendo del modulo del Tren de Carga.");
                    break;
                default: 
                    System.out.println("Opcion no valida. Intenta de nuevo.");    
            }


        } while (opcion != 0);
        scanner.close();
    }
}
