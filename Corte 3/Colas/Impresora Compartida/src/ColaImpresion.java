public class ColaImpresion {

    private Documento entrada;
    private Documento salida;

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Documento nuevo) {

        if (isEmpty()) {

            salida = nuevo;
            entrada = nuevo;

        } else {

            entrada.setSiguiente(nuevo);
            entrada = nuevo;
        }
    }

    public Documento dequeue() {

        if (isEmpty()) {
            return null;
        }

        Documento auxiliar = salida;

        salida = salida.getSiguiente();

        if (salida == null) {
            entrada = null;
        }

        return auxiliar;
    }

    public int calcularPaginasTotales() {

        int total = 0;

        Documento auxiliar = salida;

        while (auxiliar != null) {

            total += auxiliar.getNumeroPaginas();

            auxiliar = auxiliar.getSiguiente();
        }

        return total;
    }

    public void mostrarCola() {

        if (isEmpty()) {

            System.out.println("No hay documentos en cola.");
            return;
        }

        System.out.println("\nSALIDA -> ");

        Documento auxiliar = salida;

        while (auxiliar != null) {

            System.out.print(auxiliar + " -> ");

            auxiliar = auxiliar.getSiguiente();
        }

        System.out.println("ENTRADA");
    }
}