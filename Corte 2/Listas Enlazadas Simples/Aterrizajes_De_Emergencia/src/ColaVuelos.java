public class ColaVuelos {
    private Vuelo cabeza;

    public ColaVuelos() {
        cabeza = null;
    }

    public void agregarVuelo(String numero, String aerolinea, int combustible, int pasajeros) {
        Vuelo nuevo = new Vuelo(numero, aerolinea, combustible, pasajeros);

        if (combustible < 10) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Vuelo actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }
    }

    public void mostrarCola() {
        Vuelo actual = cabeza;
        while (actual != null) {
            System.out.println("Vuelo: " + actual.numeroVuelo +
                               ", Aerolínea: " + actual.aerolinea +
                               ", Combustible: " + actual.combustibleRestante +
                               ", Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }

    public void reportarEmergencia(String numeroVuelo) {
        if (cabeza == null) return;

        if (cabeza.numeroVuelo.equals(numeroVuelo)) {
            System.out.println("El vuelo ya está en prioridad.");
            return;
        }

        Vuelo actual = cabeza;
        Vuelo anterior = null;

        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Vuelo no encontrado.");
            return;
        }

        anterior.siguiente = actual.siguiente;

        actual.siguiente = cabeza;
        cabeza = actual;

        System.out.println("Vuelo movido a prioridad de aterrizaje.");
    }
}
