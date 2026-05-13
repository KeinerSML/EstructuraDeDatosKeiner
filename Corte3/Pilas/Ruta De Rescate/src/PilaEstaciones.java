public class PilaEstaciones {

    private Estacion tope;

    public PilaEstaciones() {
        tope = null;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void push(String nombrePunto, int profundidad, double nivelOxigeno) {

        Estacion nueva = new Estacion(nombrePunto, profundidad, nivelOxigeno);

        nueva.siguiente = tope;
        tope = nueva;

        System.out.println("Estación agregada correctamente.");
    }

    public void pop() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println("Estación retirada: "
                    + tope.getNombrePunto());

            tope = tope.siguiente;
        }
    }

    public void peek() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println("\n=== ESTACIÓN EN EL TOPE ===");
            System.out.println("Punto: " + tope.getNombrePunto());
            System.out.println("Profundidad: " + tope.getProfundidad());
            System.out.println("Nivel de oxígeno: "
                    + tope.getNivelOxigeno() + "%");
        }
    }

    public void mostrarPila() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");
            return;
        }

        Estacion auxiliar = tope;

        System.out.println("\nTOPE");

        while (auxiliar != null) {

            System.out.println(" ↓");

            System.out.println("[Punto: " + auxiliar.getNombrePunto()
                    + " | Profundidad: "
                    + auxiliar.getProfundidad()
                    + " | Oxígeno: "
                    + auxiliar.getNivelOxigeno() + "%]");

            auxiliar = auxiliar.siguiente;
        }

        System.out.println("BASE");
    }

    public void retrocederASuperficie() {

        if (isEmpty()) {

            System.out.println("No hay estaciones registradas.");
            return;
        }

        System.out.println("\n=== RETROCEDIENDO A LA SUPERFICIE ===");

        while (!isEmpty()) {

            System.out.println("\nPasando por estación: "
                    + tope.getNombrePunto());

            System.out.println("Profundidad: "
                    + tope.getProfundidad());

            System.out.println("Nivel de oxígeno: "
                    + tope.getNivelOxigeno() + "%");

            if (tope.getNivelOxigeno() < 18) {

                System.out.println("⚠ ALERTA: Uso de Tanque de Emergencia Requerido");
            }

            tope = tope.siguiente;
        }

        System.out.println("\nEl equipo ha salido de la cueva.");
    }
}
