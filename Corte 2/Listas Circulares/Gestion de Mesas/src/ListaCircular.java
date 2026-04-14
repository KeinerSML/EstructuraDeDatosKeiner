public class ListaCircular {
    private Grupo cabeza;

    public void agregar(String nombre, int personas, boolean vip, int minutos) {
        Grupo nuevo = new Grupo(nombre, personas, vip, minutos);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
        } else {
            Grupo actual = cabeza;
            while (actual.getSiguiente() != cabeza) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Grupo actual = cabeza;
        do {
            System.out.println(
                actual.getNombreReserva() +
                " | Personas: " + actual.getNumeroPersonas() +
                " | VIP: " + actual.isEsVip() +
                " | Espera: " + actual.getMinutosEsperando()
            );
            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }

    public void atenderSiguiente() {
        if (cabeza == null) {
            System.out.println("No hay grupos.");
            return;
        }

        Grupo atendido = cabeza;

        System.out.println("\nAtendiendo: " + atendido.getNombreReserva());

        if (cabeza.getSiguiente() == cabeza) {
            if (!atendido.isEsVip()) {
                cabeza = null;
                System.out.println("Grupo eliminado.");
            } else {
                System.out.println("VIP permanece.");
            }
            return;
        }

        Grupo ultimo = cabeza;
        while (ultimo.getSiguiente() != cabeza) {
            ultimo = ultimo.getSiguiente();
        }

        if (atendido.isEsVip()) {
            cabeza = cabeza.getSiguiente();
            ultimo.setSiguiente(atendido);
            atendido.setSiguiente(cabeza);
            System.out.println("VIP pasa al final.");
        } else {
            cabeza = cabeza.getSiguiente();
            ultimo.setSiguiente(cabeza);
            System.out.println("Grupo eliminado.");
        }

        System.out.println("\nEstado actual:");
        mostrar();
    }
}
