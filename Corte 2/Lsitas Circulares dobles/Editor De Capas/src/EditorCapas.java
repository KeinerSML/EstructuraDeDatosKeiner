public class EditorCapas {
    private Capa cabeza;
    private Capa cola;
    private Capa capaActiva;

    public void agregar(String nombre, boolean visible, String tipo) {
        Capa nueva = new Capa(nombre, visible, tipo);

        if (cabeza == null) {
            cabeza = cola = capaActiva = nueva;
            nueva.siguiente = nueva.anterior = nueva;
        } else {
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cola.siguiente = nueva;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void subirCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.siguiente;
        }
    }

    public void bajarCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.anterior;
        }
    }

    public void toggleVisibilidad() {
        if (capaActiva != null) {
            capaActiva.toggleVisible();
        }
    }

    public void eliminarActiva() {
        if (capaActiva == null) return;

        if (cabeza == cola) {
            cabeza = cola = capaActiva = null;
            return;
        }

        Capa eliminada = capaActiva;

        capaActiva = capaActiva.siguiente;

        eliminada.anterior.siguiente = eliminada.siguiente;
        eliminada.siguiente.anterior = eliminada.anterior;

        if (eliminada == cabeza) cabeza = eliminada.siguiente;
        if (eliminada == cola) cola = eliminada.anterior;
    }

    public void mostrarCapas() {
        if (cabeza == null) {
            System.out.println("No hay capas");
            return;
        }

        Capa temp = cabeza;
        System.out.println("\n--- CAPAS ---");

        do {
            String activa = (temp == capaActiva) ? "[✓]" : "[ ]";
            String vis = temp.isVisible() ? "Visible" : "Oculta";

            System.out.println(activa + " " + temp.getNombre() +
                    " | " + temp.getTipo() +
                    " | " + vis);

            temp = temp.siguiente;
        } while (temp != cabeza);
    }

    public void setActiva(int index) {
        if (cabeza == null) return;

        Capa temp = cabeza;
        int i = 0;

        do {
            if (i == index) {
                capaActiva = temp;
                return;
            }
            temp = temp.siguiente;
            i++;
        } while (temp != cabeza);
    }
}