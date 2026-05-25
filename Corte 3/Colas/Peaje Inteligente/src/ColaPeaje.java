public class ColaPeaje {

    private Vehiculo entrada;
    private Vehiculo salida;

    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Vehiculo nuevo) {

        if (isEmpty()) {

            salida = nuevo;
            entrada = nuevo;

        } else {

            entrada.setSiguiente(nuevo);
            entrada = nuevo;
        }
    }

    public Vehiculo dequeue() {

        if (isEmpty()) {
            return null;
        }

        Vehiculo auxiliar = salida;

        salida = salida.getSiguiente();

        if (salida == null) {
            entrada = null;
        }

        return auxiliar;
    }

    public void mostrarCola() {

        if (isEmpty()) {

            System.out.println("No hay vehículos en la fila.");
            return;
        }

        System.out.println("\nSALIDA -> ");

        Vehiculo auxiliar = salida;

        while (auxiliar != null) {

            System.out.print(auxiliar + " -> ");

            auxiliar = auxiliar.getSiguiente();
        }

        System.out.println("ENTRADA");
    }

    public void cerrarTurno() {

        if (isEmpty()) {

            System.out.println("No hay vehículos registrados.");
            return;
        }

        double totalRecaudado = 0;
        int contador = 0;

        System.out.println("\n===== CIERRE DE TURNO =====");

        while (!isEmpty()) {

            Vehiculo atendido = dequeue();

            contador++;

            System.out.println("\nVehículo procesado #" + contador);
            System.out.println(atendido);

            if (!atendido.isEsExento()) {
                totalRecaudado += atendido.getTarifa();
            }
        }

        System.out.println("\nTotal recaudado: $" +
                totalRecaudado);
    }
}