public class ListaPacientes {
    private Paciente cabeza;
    private Paciente cola;

    public ListaPacientes() {
        cabeza = null;
        cola = null;
    }

    public void agregarPaciente(String nombre, int edad, int nivelUrgencia) {
        Paciente nuevo = new Paciente(nombre, edad, nivelUrgencia);

        if (cabeza == null) {
            cabeza = cola = nuevo;
            return;
        }

        if (nivelUrgencia == 5) {
            nuevo.siguiente = cabeza.siguiente;
            nuevo.anterior = cabeza;

            if (cabeza.siguiente != null) {
                cabeza.siguiente.anterior = nuevo;
            }

            cabeza.siguiente = nuevo;

            if (cola == cabeza) {
                cola = nuevo;
            }

        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void mostrarPacientes() {
        if (cabeza == null) {
            System.out.println("No hay pacientes.");
            return;
        }

        Paciente actual = cabeza;
        while (actual != null) {
            System.out.println(actual.nombre + " | Edad: " + actual.edad + " | Urgencia: " + actual.nivelUrgencia);
            actual = actual.siguiente;
        }
    }

    public void pacienteMayorDesdeCola() {
        if (cola == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Paciente actual = cola;
        Paciente mayor = cola;

        while (actual != null) {
            if (actual.edad > mayor.edad) {
                mayor = actual;
            }
            actual = actual.anterior;
        }

        System.out.println("\nPaciente de mayor edad:");
        System.out.println("Nombre: " + mayor.nombre);
        System.out.println("Edad: " + mayor.edad);
        System.out.println("Urgencia: " + mayor.nivelUrgencia);
    }
}
