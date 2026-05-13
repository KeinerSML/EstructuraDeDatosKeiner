/*4. Control de Acceso (Gimnasio)
Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. La lista está ordenada de menor a mayor.

El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la lista de "pagos al día". Si no está, se le niega la entrada.
Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada. */



import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] codigos = {1010, 1025, 1050, 1100, 1200, 1300, 1500};

        System.out.print("Digite su código de acceso: ");
        int codigoIngresado = scanner.nextInt();

        int inicio = 0;
        int fin = codigos.length - 1;
        boolean accesoPermitido = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (codigos[medio] == codigoIngresado) {
                accesoPermitido = true;
                break;
            } else if (codigoIngresado < codigos[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        if (accesoPermitido) {
            System.out.println("Acceso permitido. Bienvenido al gimnasio");
        } else {
            System.out.println("Acceso denegado. Debe ponerse al día con su pago.");
        }

        scanner.close();
    }
}
