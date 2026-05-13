public class PilaPiezas {

    private Pieza tope;

    // Constructor
    public PilaPiezas() {
        tope = null;
    }

    // Verificar si está vacía
    public boolean isEmpty() {
        return tope == null;
    }

    // Agregar pieza
    public void push(String nombrePieza, String numeroSerie, boolean esDefectuosa) {

        Pieza nueva = new Pieza(nombrePieza, numeroSerie, esDefectuosa);

        nueva.siguiente = tope;
        tope = nueva;

        System.out.println("Pieza agregada correctamente.");
    }

    // Retirar pieza
    public void pop() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println("Pieza retirada: " + tope.getNombrePieza());

            tope = tope.siguiente;
        }
    }

    // Ver pieza del tope
    public void peek() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println("\n=== PIEZA EN EL TOPE ===");
            System.out.println("Nombre: " + tope.getNombrePieza());
            System.out.println("Serie: " + tope.getNumeroSerie());
            System.out.println("¿Defectuosa?: " + tope.isEsDefectuosa());
        }
    }

    // Mostrar pila
    public void mostrarPila() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");
            return;
        }

        Pieza auxiliar = tope;

        System.out.println("\nTOPE");

        while (auxiliar != null) {

            System.out.println(" ↓");

            System.out.println("[Nombre: " + auxiliar.getNombrePieza()
                    + " | Serie: " + auxiliar.getNumeroSerie()
                    + " | Defectuosa: " + auxiliar.isEsDefectuosa() + "]");

            auxiliar = auxiliar.siguiente;
        }

        System.out.println("BASE");
    }

    // Método solicitado
    public void limpiarHastaDefecto() {

        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        boolean encontrada = false;

        while (!isEmpty()) {

            // Si la pieza es defectuosa
            if (tope.isEsDefectuosa()) {

                System.out.println("\n¡Pieza defectuosa encontrada!");
                System.out.println("Pieza defectuosa: " + tope.getNombrePieza());

                encontrada = true;

                break;
            }

            // Mostrar piezas buenas retiradas
            System.out.println("Pieza buena descartada: " + tope.getNombrePieza());

            // Eliminar pieza buena
            tope = tope.siguiente;
        }

        if (!encontrada) {
            System.out.println("No se encontró ninguna pieza defectuosa.");
        }
    }
}
