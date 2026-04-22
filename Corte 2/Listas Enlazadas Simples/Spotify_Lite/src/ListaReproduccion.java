class ListaReproduccion {
    private Cancion cabeza;
    private Cancion actual;

    public ListaReproduccion() {
        cabeza = null;
        actual = null;
    }

    public void agregarAlFinal(String titulo, String artista, int duracion, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Cancion temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nueva;
        }
    }

    public void agregarSiguiente(String titulo, String artista, int duracion, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (actual == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            nueva.siguiente = actual.siguiente;
            actual.siguiente = nueva;
        }
    }

    public void mostrarLista() {
        Cancion temp = cabeza;
        while (temp != null) {
            String marcador = (temp == actual) ? " <-- Actual" : "";
            System.out.println(temp.titulo + " - " + temp.artista +
                               " (" + temp.duracionSegundos + "s)" + marcador);
            temp = temp.siguiente;
        }
    }

    public void siguienteCancion() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
        } else {
            System.out.println("No hay siguiente canción.");
        }
    }

    public void duracionTotal() {
        int totalSegundos = 0;
        Cancion temp = cabeza;

        while (temp != null) {
            totalSegundos += temp.duracionSegundos;
            temp = temp.siguiente;
        }

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        System.out.printf("Duración total: %02d:%02d\n", minutos, segundos);
    }
}
