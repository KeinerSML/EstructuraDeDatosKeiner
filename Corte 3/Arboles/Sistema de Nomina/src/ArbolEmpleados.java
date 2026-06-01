public class ArbolEmpleados {

    private Empleado raiz;

    public ArbolEmpleados() {
        raiz = null;
    }

    public void insertar(long cedula, String nombre, String cargo, double salario) {
        raiz = insertarRec(raiz, cedula, nombre, cargo, salario);
    }

    private Empleado insertarRec(Empleado nodo, long cedula,
                                 String nombre, String cargo, double salario) {

        if (nodo == null) {
            return new Empleado(cedula, nombre, cargo, salario);
        }

        if (cedula < nodo.cedula) {
            nodo.izquierda = insertarRec(nodo.izquierda, cedula, nombre, cargo, salario);
        } else if (cedula > nodo.cedula) {
            nodo.derecha = insertarRec(nodo.derecha, cedula, nombre, cargo, salario);
        }

        return nodo;
    }

    public void buscarMinimo() {

        if (raiz == null) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        Empleado actual = raiz;

        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }

        System.out.println("\n=== EMPLEADO CON MENOR CÉDULA ===");
        mostrarEmpleado(actual);
    }

    public void buscarMaximo() {

        if (raiz == null) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        Empleado actual = raiz;

        while (actual.derecha != null) {
            actual = actual.derecha;
        }

        System.out.println("\n=== EMPLEADO CON MAYOR CÉDULA ===");
        mostrarEmpleado(actual);
    }

    private void mostrarEmpleado(Empleado e) {
        System.out.println("Cédula: " + e.cedula);
        System.out.println("Nombre: " + e.nombreCompleto);
        System.out.println("Cargo: " + e.cargo);
        System.out.println("Salario: $" + e.salario);
    }

    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(Empleado nodo) {

        if (nodo == null) {
            return 0;
        }

        int izquierda = alturaRec(nodo.izquierda);
        int derecha = alturaRec(nodo.derecha);

        return Math.max(izquierda, derecha) + 1;
    }

    public int contarHojas() {
        return contarHojasRec(raiz);
    }

    private int contarHojasRec(Empleado nodo) {

        if (nodo == null) {
            return 0;
        }

        if (nodo.izquierda == null && nodo.derecha == null) {
            return 1;
        }

        return contarHojasRec(nodo.izquierda)
                + contarHojasRec(nodo.derecha);
    }

    public void reporteEficiencia() {

        System.out.println("\n=== REPORTE DE EFICIENCIA ===");
        System.out.println("Altura del árbol: " + altura());
        System.out.println("Número de hojas: " + contarHojas());
    }
}