public class Galeria {
    private Foto cabeza;
    private Foto cola;
    private Foto actual;

    public void agregar(String titulo, String fecha) {
        Foto nueva = new Foto(titulo, fecha);

        if (cabeza == null) {
            cabeza = cola = actual = nueva;
            nueva.siguiente = nueva.anterior = nueva;
        } else {
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cola.siguiente = nueva;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void siguiente() {
        if (actual != null) {
            actual = actual.siguiente;
        }
    }

    public void anterior() {
        if (actual != null) {
            actual = actual.anterior;
        }
    }

    public void toggleFavorita() {
        if (actual != null) {
            actual.toggleFavorita();
        }
    }

    public void eliminarActual() {
        if (actual == null) return;

        if (cabeza == cola) {
            cabeza = cola = actual = null;
            return;
        }

        Foto eliminada = actual;

        actual = actual.siguiente;

        eliminada.anterior.siguiente = eliminada.siguiente;
        eliminada.siguiente.anterior = eliminada.anterior;

        if (eliminada == cabeza) cabeza = eliminada.siguiente;
        if (eliminada == cola) cola = eliminada.anterior;
    }

    public void mostrarGaleria() {
        if (cabeza == null) {
            System.out.println("Galería vacía");
            return;
        }

        Foto temp = cabeza;
        System.out.println("\n--- GALERÍA ---");

        do {
            String actualMark = (temp == actual) ? "[▶]" : "[ ]";
            String favMark = temp.isFavorita() ? "[★]" : "[ ]";

            System.out.println(actualMark + " " + favMark + " " +
                    temp.getTitulo() + " (" + temp.getFecha() + ")");

            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}