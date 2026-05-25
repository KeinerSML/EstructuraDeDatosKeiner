public class ColaPedidos {

    private Pedido entrada;
    private Pedido salida;

    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Pedido nuevo) {

        if (isEmpty()) {

            salida = nuevo;
            entrada = nuevo;

        } else {

            entrada.setSiguiente(nuevo);
            entrada = nuevo;
        }
    }

    public Pedido dequeue() {

        if (isEmpty()) {
            return null;
        }

        Pedido auxiliar = salida;

        salida = salida.getSiguiente();

        if (salida == null) {
            entrada = null;
        }

        return auxiliar;
    }

    public void mostrarCola() {

        if (isEmpty()) {

            System.out.println("No hay pedidos en cola.");
            return;
        }

        System.out.println("\nSALIDA -> ");

        Pedido auxiliar = salida;

        while (auxiliar != null) {

            System.out.print(auxiliar + " -> ");

            auxiliar = auxiliar.getSiguiente();
        }

        System.out.println("ENTRADA");
    }

    public void procesarPedidos() {

        if (isEmpty()) {

            System.out.println("No hay pedidos para procesar.");
            return;
        }

        int totalDespachados = 0;
        int totalCancelados = 0;

        System.out.println("\n===== PROCESAMIENTO DE PEDIDOS =====");

        while (!isEmpty()) {

            Pedido actual = dequeue();

            if (actual.isCancelado()) {

                totalCancelados++;

                System.out.println("\nPedido cancelado descartado:");
                System.out.println(actual);

            } else {

                totalDespachados++;

                System.out.println("\nPedido despachado:");
                System.out.println(actual);
            }
        }

        System.out.println("\n===== RESUMEN FINAL =====");
        System.out.println("Total despachados: " +
                totalDespachados);

        System.out.println("Total cancelados: " +
                totalCancelados);
    }
}
