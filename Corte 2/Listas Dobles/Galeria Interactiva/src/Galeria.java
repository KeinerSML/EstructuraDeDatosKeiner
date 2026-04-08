public class Galeria {
    private Fotografia cabeza;
    private Fotografia actual;

    public void agregarFoto(String nombre, double tamano, String resolucion) {
        Fotografia nueva = new Fotografia(nombre, tamano, resolucion);

        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Fotografia temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nueva;
            nueva.anterior = temp;
        }
    }

    public void siguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarActual();
        } else {
            System.out.println("No hay más fotos hacia adelante.");
        }
    }

    public void anterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            mostrarActual();
        } else {
            System.out.println("No hay más fotos hacia atrás.");
        }
    }

    public void mostrarActual() {
        if (actual != null) {
            System.out.println("\nFoto actual:");
            System.out.println("Nombre: " + actual.nombreArchivo);
            System.out.println("Tamaño: " + actual.tamanoMB + " MB");
            System.out.println("Resolución: " + actual.resolucion);
        } else {
            System.out.println("No hay fotos en la galería.");
        }
    }

    public void reproducirGaleria() {
        if (cabeza == null) {
            System.out.println("La galería está vacía.");
            return;
        }

        System.out.println("\nRecorriendo hacia adelante:");
        Fotografia temp = cabeza;

        while (temp != null) {
            System.out.println(temp.nombreArchivo + " - " + temp.resolucion);
            if (temp.siguiente == null) break;
            temp = temp.siguiente;
        }

        System.out.println("\nRecorriendo hacia atrás:");

        while (temp != null) {
            System.out.println(temp.nombreArchivo + " - " + temp.resolucion);
            temp = temp.anterior;
        }
    }
}
