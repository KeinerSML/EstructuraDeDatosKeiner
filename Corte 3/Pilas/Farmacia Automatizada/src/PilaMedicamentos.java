public class PilaMedicamentos {

    private Medicamento tope;

    public PilaMedicamentos() {
        tope = null;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void push(String nombre, String lote, int diasParaVencer) {

        Medicamento nuevo = new Medicamento(nombre, lote, diasParaVencer);

        nuevo.siguiente = tope;
        tope = nuevo;

        System.out.println("Medicamento agregado correctamente.");
    }

    public void pop() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println("Medicamento retirado: " + tope.getNombre());

            tope = tope.siguiente;
        }
    }

    public void peek() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println("\n=== MEDICAMENTO EN EL TOPE ===");
            System.out.println("Nombre: " + tope.getNombre());
            System.out.println("Lote: " + tope.getLote());
            System.out.println("Días para vencer: " + tope.getDiasParaVencer());
        }
    }

    public void mostrarPila() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");
            return;
        }

        Medicamento auxiliar = tope;

        System.out.println("\nTOPE");

        while (auxiliar != null) {

            System.out.println(" ↓");

            System.out.println("[Nombre: " + auxiliar.getNombre()
                    + " | Lote: " + auxiliar.getLote()
                    + " | Días para vencer: "
                    + auxiliar.getDiasParaVencer() + "]");

            auxiliar = auxiliar.siguiente;
        }

        System.out.println("BASE");
    }

    public void validarDespacho() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");
            return;
        }

        while (!isEmpty() && tope.getDiasParaVencer() < 10) {

            System.out.println("\nMedicamento retirado por vencimiento próximo:");
            System.out.println("Nombre: " + tope.getNombre());
            System.out.println("Lote: " + tope.getLote());
            System.out.println("Días para vencer: "
                    + tope.getDiasParaVencer());

            tope = tope.siguiente;
        }

        if (isEmpty()) {

            System.out.println("\nNo quedan medicamentos seguros para despachar.");

        } else {

            System.out.println("\nMedicamento seguro para despacho:");
            System.out.println("Nombre: " + tope.getNombre());
            System.out.println("Lote: " + tope.getLote());
            System.out.println("Días para vencer: "
                    + tope.getDiasParaVencer());
        }
    }
}
