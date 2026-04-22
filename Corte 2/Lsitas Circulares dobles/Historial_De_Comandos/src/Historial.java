public class Historial {
    private Comando cabeza;
    private Comando cola;
    private Comando cursor;

    public void agregar(String texto, boolean exitoso, String directorio) {
        Comando nuevo = new Comando(texto, exitoso, directorio);

        if (cabeza == null) {
            cabeza = cola = cursor = nuevo;
            nuevo.siguiente = nuevo.anterior = nuevo;
        } else {
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cola.siguiente = nuevo;
            cabeza.anterior = nuevo;
            cola = nuevo;
        }
    }

    public void arriba() {
        if (cursor != null) {
            cursor = cursor.anterior;
        }
    }

    public void abajo() {
        if (cursor != null) {
            cursor = cursor.siguiente;
        }
    }

    public void eliminarActual() {
        if (cursor == null) return;

        if (cabeza == cola) {
            cabeza = cola = cursor = null;
            return;
        }

        Comando eliminado = cursor;
        cursor = cursor.siguiente;

        eliminado.anterior.siguiente = eliminado.siguiente;
        eliminado.siguiente.anterior = eliminado.anterior;

        if (eliminado == cabeza) cabeza = eliminado.siguiente;
        if (eliminado == cola) cola = eliminado.anterior;
    }

    public void mostrarCursor() {
        if (cursor == null) {
            System.out.println("Historial vacío");
        } else {
            System.out.println("\nCursor en:");
            System.out.println(cursor.getTexto() + " | " + cursor.getDirectorio());
        }
    }

    public void mostrarHistorial() {
        if (cabeza == null) {
            System.out.println("Historial vacío");
            return;
        }

        Comando temp = cabeza;
        System.out.println("\n--- HISTORIAL ---");

        do {
            if (temp == cursor) {
                System.out.println("-> " + temp.getTexto() + " (CURSOR)");
            } else {
                System.out.println("   " + temp.getTexto());
            }
            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}
