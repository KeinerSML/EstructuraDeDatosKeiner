class Navegador {
    private Pestana cabeza;
    private Pestana actual;

    public void abrirPestana(String titulo, String url, String hora) {
        Pestana nueva = new Pestana(titulo, url, hora);

        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Pestana temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nueva;
            nueva.anterior = temp;
            actual = nueva;
        }
    }

    public void mostrarActual() {
        if (actual != null) {
            System.out.println("\nPestaña actual:");
            System.out.println("Título: " + actual.tituloPagina);
            System.out.println("URL: " + actual.url);
            System.out.println("Hora: " + actual.horaApertura);
        } else {
            System.out.println("No hay pestañas abiertas.");
        }
    }

    public void cerrarPestanaActual(String url) {
        if (cabeza == null) {
            System.out.println("No hay pestañas para cerrar.");
            return;
        }

        Pestana temp = cabeza;

        while (temp != null && !temp.url.equals(url)) {
            temp = temp.siguiente;
        }

        if (temp == null) {
            System.out.println("No se encontró la pestaña.");
            return;
        }

        if (temp == cabeza && temp.siguiente == null) {
            cabeza = null;
            actual = null;
        }

        else if (temp == cabeza) {
            cabeza = temp.siguiente;
            cabeza.anterior = null;
            actual = cabeza;
        }

        else if (temp.siguiente == null) {
            temp.anterior.siguiente = null;
            actual = temp.anterior;
        }

        else {
            temp.anterior.siguiente = temp.siguiente;
            temp.siguiente.anterior = temp.anterior;
            actual = temp.anterior; 
        }

        System.out.println("Pestaña cerrada correctamente.");
    }

    // Navegación
    public void siguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarActual();
        } else {
            System.out.println("No hay pestañas a la derecha.");
        }
    }

    public void anterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            mostrarActual();
        } else {
            System.out.println("No hay pestañas a la izquierda.");
        }
    }

    // Mostrar todas
    public void mostrarTodas() {
        Pestana temp = cabeza;
        System.out.println("\nPestañas abiertas:");
        while (temp != null) {
            System.out.println(temp.tituloPagina + " - " + temp.url);
            temp = temp.siguiente;
        }
    }
}
