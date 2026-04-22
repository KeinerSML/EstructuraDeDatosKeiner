class Producto {
    String nombre;
    int cantidad;
    int vencimiento;
    Producto siguiente;

    public Producto(String nombre, int cantidad, int vencimiento) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.vencimiento = vencimiento;
        this.siguiente = null;
    }
}
