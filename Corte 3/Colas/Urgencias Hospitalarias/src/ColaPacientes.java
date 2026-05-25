public class ColaPacientes {

    private Paciente entrada;
    private Paciente salida;

    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Paciente nuevo) {

        if (isEmpty()) {

            salida = nuevo;
            entrada = nuevo;

        } else {

            entrada.setSiguiente(nuevo);
            entrada = nuevo;
        }
    }

    public Paciente dequeue() {

        if (isEmpty()) {
            return null;
        }

        Paciente auxiliar = salida;

        salida = salida.getSiguiente();

        if (salida == null) {
            entrada = null;
        }

        return auxiliar;
    }

    public void mostrarCola() {

        if (isEmpty()) {

            System.out.println("No hay pacientes en espera.");
            return;
        }

        System.out.println("\nSALIDA -> ");

        Paciente auxiliar = salida;

        while (auxiliar != null) {

            System.out.print(auxiliar + " -> ");

            auxiliar = auxiliar.getSiguiente();
        }

        System.out.println("ENTRADA");
    }

    public void atenderTodos() {

        if (isEmpty()) {

            System.out.println("No hay pacientes para atender.");
            return;
        }

        int contador = 0;

        System.out.println("\n===== ATENCIÓN DE PACIENTES =====");

        while (!isEmpty()) {

            Paciente atendido = dequeue();

            contador++;

            System.out.println("\nPaciente atendido #" + contador);
            System.out.println(atendido);
        }

        System.out.println("\nTotal de pacientes atendidos: "
                + contador);
    }
}
