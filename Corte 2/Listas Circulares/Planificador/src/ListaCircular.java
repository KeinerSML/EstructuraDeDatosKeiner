public class ListaCircular {
    private Proceso cabeza;

    public void agregar(String nombre, int pid, int tiempo, int prioridad) {
        Proceso nuevo = new Proceso(nombre, pid, tiempo, prioridad);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
        } else {
            Proceso actual = cabeza;
            while (actual.getSiguiente() != cabeza) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay procesos.");
            return;
        }

        Proceso actual = cabeza;
        do {
            System.out.println(
                actual.getNombre() +
                " | PID: " + actual.getPid() +
                " | Tiempo: " + actual.getTiempoRestante() +
                " | Prioridad: " + actual.getPrioridad()
            );
            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }

    public void ejecutar(int quantum) {
        if (cabeza == null) {
            System.out.println("No hay procesos.");
            return;
        }

        String ordenFinalizacion = "";

        Proceso actual = cabeza;
        Proceso anterior = null;

        while (cabeza != null) {

            System.out.println("\nEjecutando: " + actual.getNombre());

            int nuevoTiempo = actual.getTiempoRestante() - quantum;
            actual.setTiempoRestante(nuevoTiempo);

            if (nuevoTiempo <= 0) {
                System.out.println("Proceso terminado: " + actual.getNombre());

                ordenFinalizacion += actual.getNombre() + " -> ";

                if (actual.getSiguiente() == actual) {
                    cabeza = null;
                    break;
                }

                if (anterior == null) {
                    anterior = cabeza;
                    while (anterior.getSiguiente() != cabeza) {
                        anterior = anterior.getSiguiente();
                    }
                }

                anterior.setSiguiente(actual.getSiguiente());

                if (actual == cabeza) {
                    cabeza = actual.getSiguiente();
                }

                actual = actual.getSiguiente();
            } else {
                System.out.println("Tiempo restante: " + actual.getTiempoRestante());
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }

        System.out.println("\nOrden de finalización:");
        System.out.println(ordenFinalizacion + "FIN");
    }
}