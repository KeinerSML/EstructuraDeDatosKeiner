public class ArbolRepuestos {

    private Repuesto raiz;

    public ArbolRepuestos() {
        raiz = null;
    }

    public void insertar(int codigoRef,
                         String descripcion,
                         String marca,
                         int stock) {

        raiz = insertarRec(
                raiz,
                codigoRef,
                descripcion,
                marca,
                stock);
    }

    private Repuesto insertarRec(
            Repuesto nodo,
            int codigoRef,
            String descripcion,
            String marca,
            int stock) {

        if (nodo == null) {
            return new Repuesto(
                    codigoRef,
                    descripcion,
                    marca,
                    stock);
        }

        if (codigoRef < nodo.codigoRef) {
            nodo.izquierda = insertarRec(
                    nodo.izquierda,
                    codigoRef,
                    descripcion,
                    marca,
                    stock);
        }
        else if (codigoRef > nodo.codigoRef) {
            nodo.derecha = insertarRec(
                    nodo.derecha,
                    codigoRef,
                    descripcion,
                    marca,
                    stock);
        }

        return nodo;
    }

    public void backupPreOrden() {

        if (raiz == null) {
            System.out.println("Inventario vacío.");
            return;
        }

        System.out.println("\n=== BACKUP PREORDEN ===");
        preOrdenRec(raiz);
    }

    private void preOrdenRec(Repuesto nodo) {

        if (nodo == null) {
            return;
        }

        System.out.println(
                "[" + nodo.codigoRef + "] "
                + nodo.descripcion
                + " - "
                + nodo.marca
                + " (" + nodo.stock + " uds)");

        preOrdenRec(nodo.izquierda);
        preOrdenRec(nodo.derecha);
    }

    public int contarHojas() {
        return contarHojasRec(raiz);
    }

    private int contarHojasRec(Repuesto nodo) {

        if (nodo == null) {
            return 0;
        }

        if (nodo.izquierda == null &&
            nodo.derecha == null) {

            return 1;
        }

        return contarHojasRec(nodo.izquierda)
             + contarHojasRec(nodo.derecha);
    }

    public void reporteRepuestosUnicos() {

        int hojas = contarHojas();

        System.out.println("\n=== REPORTE DE REPUESTOS ÚNICOS ===");
        System.out.println(
                "Hay "
                + hojas
                + " repuestos sin variantes relacionadas.");
    }
}
