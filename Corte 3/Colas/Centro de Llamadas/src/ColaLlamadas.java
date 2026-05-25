public class ColaLlamadas {

    private Llamada entrada;
    private Llamada salida;

    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Llamada nueva) {

        if (isEmpty()) {
            salida = nueva;
            entrada = nueva;
        } else {
            entrada.setSiguiente(nueva);
            entrada = nueva;
        }
    }

    public Llamada dequeue() {

        if (isEmpty()) {
            return null;
        }

        Llamada auxiliar = salida;
        salida = salida.getSiguiente();

        if (salida == null) {
            entrada = null;
        }

        return auxiliar;
    }

    public int contarPorMotivo(String motivo) {

        int contador = 0;

        Llamada auxiliar = salida;

        while (auxiliar != null) {

            if (auxiliar.getMotivoConsulta()
                    .equalsIgnoreCase(motivo)) {

                contador++;
            }

            auxiliar = auxiliar.getSiguiente();
        }

        return contador;
    }

    public void mostrarCola() {

        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }

        System.out.println("\nSALIDA -> ");

        Llamada auxiliar = salida;

        while (auxiliar != null) {

            System.out.print(auxiliar + " -> ");

            auxiliar = auxiliar.getSiguiente();
        }

        System.out.println("ENTRADA");
    }
}
