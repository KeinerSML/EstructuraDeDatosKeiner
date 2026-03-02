public class Ejercicio1 {
    public static void main(String[] args) {

        int[] codigos = {456789, 123456, 770123, 987654, 345678};
        int codigoBuscado = 770123;

        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigoBuscado) {
                encontrado = true;
                posicion = i;
                break; // Se detiene cuando lo encuentra
            }
        }

        if (encontrado) {
            System.out.println("Producto encontrado en la posición: " + posicion);
        } else {
            System.out.println("Producto no disponible en la estantería.");
        }
    }
}
