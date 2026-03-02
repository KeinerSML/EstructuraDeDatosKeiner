public class Ejercicio4 {
    public static void main(String[] args) {

        int[] codigos = {1010, 1100, 1050, 1130, 1200, 1300, 1500};
        int codigoIngresado = 1100;

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
            System.out.println("Acceso permitido. Bienvenido al gimnasio. ");
        } else {
            System.out.println("Acceso denegado. Debe ponerse al día con su pago.");
        }
    }
}
