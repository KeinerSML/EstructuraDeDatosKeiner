import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] listaNegra = {50, 120, 450, 800, 999};
        int[] intentos = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese ID de intento " + (i + 1) + ": ");
            intentos[i] = scanner.nextInt();
        }

        int mayor = intentos[0];
        for (int i = 1; i < intentos.length; i++) {
            if (intentos[i] > mayor) {
                mayor = intentos[i];
            }
        }

        System.out.println("ID más alto detectado: " + mayor);

        int izquierda = 0;
        int derecha = listaNegra.length - 1;
        boolean encontrado = false;

        while (izquierda <= derecha) {

            int medio = (izquierda + derecha) / 2;

            if (listaNegra[medio] == mayor) {
                encontrado = true;
                break;
            } else if (listaNegra[medio] < mayor) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        if (encontrado) {
            System.out.println("El atacante ya estaba en la lista negra.");
        } else {
            System.out.println("Nuevo atacante detectado, procediendo a bloquear.");
        }

        scanner.close();
    }
}
