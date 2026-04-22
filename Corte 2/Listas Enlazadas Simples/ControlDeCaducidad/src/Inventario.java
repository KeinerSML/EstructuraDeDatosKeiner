public class Inventario {
    private Producto cabeza;

    public Inventario() {
        cabeza = null;
    }

    public void agregarProducto(String nombre, int cantidad, int vencimiento) {
        Producto nuevo = new Producto(nombre, cantidad, vencimiento);

        if (vencimiento < 3) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Producto actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }
    }

    public void mostrarInventario() {
        Producto actual = cabeza;
        while (actual != null) {
            System.out.println("Nombre: " + actual.nombre +
                               ", Cantidad: " + actual.cantidad +
                               ", Días para vencer: " + actual.vencimiento);
            actual = actual.siguiente;
        }
    }

    public void productosPorVencer() {
        Producto actual = cabeza;

        System.out.println("\nProductos con menos de 5 días para vencer:");
        while (actual != null) {
            if (actual.vencimiento < 5) {
                System.out.println("Nombre: " + actual.nombre +
                                   ", Cantidad: " + actual.cantidad +
                                   ", Días: " + actual.vencimiento);
            }
            actual = actual.siguiente;
        }
    }
}
