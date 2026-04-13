public class ListaReproduccion {
    private Cancion cabeza;
    private Cancion cola;
    private Cancion actual;

    public ListaReproduccion() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    // Agregar canción
    public void agregarCancion(String titulo, String artista, int duracion) {
        Cancion nueva = new Cancion(titulo, artista, duracion);

        if (cabeza == null) {
            cabeza = cola = actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public void mostrarLista() {
        Cancion temp = cabeza;
        while (temp != null) {
            System.out.println(temp.titulo + " - " + temp.artista + " (" + temp.duracion + "s)");
            temp = temp.siguiente;
        }
    }

    public void mostrarActual() {
        if (actual != null) {
            System.out.println("\nReproduciendo:");
            System.out.println(actual.titulo + " - " + actual.artista);
        } else {
            System.out.println("No hay canciones.");
        }
    }

    public void saltarAdelante() {
        if (actual == null) {
            System.out.println("No hay canciones.");
            return;
        }

        if (actual.siguiente == null) {
            System.out.println("Ya estás en la última canción.");
        } else {
            actual = actual.siguiente;
            mostrarActual();
        }
    }

    public void saltarAtras() {
        if (actual == null) {
            System.out.println("No hay canciones.");
            return;
        }

        if (actual.anterior == null) {
            System.out.println("Error: estás en la primera canción.");
        } else {
            actual = actual.anterior;
            mostrarActual();
        }
    }
}
