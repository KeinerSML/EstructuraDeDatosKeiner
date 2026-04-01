public class Monitoreo {
    private Lectura cabeza;

    public Monitoreo() {
        cabeza = null;
    }

    public void agregarLectura(int id, double temp, double presion, String hora) {
        Lectura nueva = new Lectura(id, temp, presion, hora);
        nueva.siguiente = cabeza;
        cabeza = nueva;
    }

    public void mostrarLecturas() {
        Lectura actual = cabeza;
        while (actual != null) {
            System.out.println("Sensor: " + actual.idSensor +
                               ", Temp: " + actual.temperatura +
                               ", Presión: " + actual.presion +
                               ", Hora: " + actual.hora);
            actual = actual.siguiente;
        }
    }

    public void mayorTemperatura() {
        if (cabeza == null) {
            System.out.println("No hay lecturas.");
            return;
        }

        Lectura actual = cabeza;
        Lectura max = cabeza;

        while (actual != null) {
            if (actual.temperatura > max.temperatura) {
                max = actual;
            }
            actual = actual.siguiente;
        }

        System.out.println("\nLectura con mayor temperatura:");
        System.out.println("Sensor: " + max.idSensor +
                           ", Temp: " + max.temperatura +
                           ", Presión: " + max.presion +
                           ", Hora: " + max.hora);
    }
}
