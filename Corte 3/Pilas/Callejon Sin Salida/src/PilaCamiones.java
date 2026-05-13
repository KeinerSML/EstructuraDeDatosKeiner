public class PilaCamiones {

    private Camion tope;

    public PilaCamiones() {
        tope = null;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void push(String placa, String conductor, double cargaToneladas) {

        Camion nuevo = new Camion(placa, conductor, cargaToneladas);

        nuevo.siguiente = tope;
        tope = nuevo;

        System.out.println("Camión agregado correctamente.");
    }

    public void pop() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println("Camión retirado: " + tope.getPlaca());

            tope = tope.siguiente;
        }
    }

    public void peek() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println("\n=== CAMIÓN EN EL TOPE ===");
            System.out.println("Placa: " + tope.getPlaca());
            System.out.println("Conductor: " + tope.getConductor());
            System.out.println("Carga (Ton): " + tope.getCargaToneladas());
        }
    }

    public void mostrarPila() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");
            return;
        }

        Camion auxiliar = tope;

        System.out.println("\nTOPE");

        while (auxiliar != null) {

            System.out.println(" ↓");

            System.out.println("[Placa: " + auxiliar.getPlaca()
                    + " | Conductor: " + auxiliar.getConductor()
                    + " | Carga: " + auxiliar.getCargaToneladas() + " Ton]");

            auxiliar = auxiliar.siguiente;
        }

        System.out.println("BASE");
    }

    public double calcularCargaTotal() {

        double suma = 0;

        PilaCamiones auxiliar = new PilaCamiones();

        while (!isEmpty()) {

            Camion temp = tope;

            suma += temp.getCargaToneladas();

            auxiliar.push(
                    temp.getPlaca(),
                    temp.getConductor(),
                    temp.getCargaToneladas()
            );

            tope = tope.siguiente;
        }

        while (!auxiliar.isEmpty()) {

            Camion temp = auxiliar.tope;

            push(
                    temp.getPlaca(),
                    temp.getConductor(),
                    temp.getCargaToneladas()
            );

            auxiliar.tope = auxiliar.tope.siguiente;
        }

        return suma;
    }
}