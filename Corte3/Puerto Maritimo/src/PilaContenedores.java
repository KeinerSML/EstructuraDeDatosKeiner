public class PilaContenedores {

    private Contenedor tope;

    public PilaContenedores() {
        tope = null;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void push(String idCodigo, String empresa, double peso, String tipoCarga) {

        Contenedor nuevo = new Contenedor(idCodigo, empresa, peso, tipoCarga);

        nuevo.siguiente = tope;
        tope = nuevo;

        System.out.println("Contenedor agregado correctamente.");
    }

    public void pop() {

        if (isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {

            System.out.println("Contenedor retirado: " + tope.getIdCodigo());

            tope = tope.siguiente;
        }
    }

    public void peek() {

        if (isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println("\n=== CONTENEDOR EN EL TOPE ===");
            System.out.println("Código: " + tope.getIdCodigo());
            System.out.println("Empresa: " + tope.getEmpresa());
            System.out.println("Peso: " + tope.getPeso());
            System.out.println("Tipo de carga: " + tope.getTipoCarga());
        }
    }

    public void mostrarPila() {

        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        Contenedor auxiliar = tope;

        System.out.println("\nTOPE");

        while (auxiliar != null) {

            System.out.println(" ↓");

            System.out.println("[Código: " + auxiliar.getIdCodigo()
                    + " | Empresa: " + auxiliar.getEmpresa()
                    + " | Peso: " + auxiliar.getPeso()
                    + " | Tipo: " + auxiliar.getTipoCarga() + "]");

            auxiliar = auxiliar.siguiente;
        }

        System.out.println("BASE");
    }

    public int contarPorEmpresa(String nombreEmpresa) {

        int contador = 0;

        PilaContenedores auxiliar = new PilaContenedores();

        while (!isEmpty()) {

            Contenedor temp = tope;

            if (temp.getEmpresa().equalsIgnoreCase(nombreEmpresa)) {
                contador++;
            }

            auxiliar.push(
                    temp.getIdCodigo(),
                    temp.getEmpresa(),
                    temp.getPeso(),
                    temp.getTipoCarga()
            );

            tope = tope.siguiente;
        }

        while (!auxiliar.isEmpty()) {

            Contenedor temp = auxiliar.tope;

            push(
                    temp.getIdCodigo(),
                    temp.getEmpresa(),
                    temp.getPeso(),
                    temp.getTipoCarga()
            );

            auxiliar.tope = auxiliar.tope.siguiente;
        }

        return contador;
    }
}
