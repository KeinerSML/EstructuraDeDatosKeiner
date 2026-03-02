public class Ejercicio2 {
    public static void main(String[] args) {

        int[] cedulas = {1001, 1020, 1050, 1100, 1200, 1300, 1500, 1800, 2000};
        int cedulaBuscada = 1300;

        int inicio = 0;
        int fin = cedulas.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (cedulas[medio] == cedulaBuscada) {
                System.out.println("Cliente encontrado en la posición: " + medio);
                encontrado = true;
                break;
            } else if (cedulaBuscada < cedulas[medio]) {
                fin = medio - 1; 
            } else {
                inicio = medio + 1; 
            }
        }

        if (!encontrado) {
            System.out.println("Cliente no registrado en la base de datos.");
        }
    }
}