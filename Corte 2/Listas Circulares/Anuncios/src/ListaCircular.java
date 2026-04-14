public class ListaCircular {
    private Anuncio cabeza;

    public void agregar(String titulo, int duracion, String categoria) {
        Anuncio nuevo = new Anuncio(titulo, duracion, categoria);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
        } else {
            Anuncio actual = cabeza;
            while (actual.getSiguiente() != cabeza) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay anuncios.");
            return;
        }

        Anuncio actual = cabeza;
        do {
            System.out.println("Titulo: " + actual.getTitulo() +
                    " | Duración: " + actual.getDuracionSegundos() +
                    " | Categoría: " + actual.getCategoria() +
                    " | Repeticiones: " + actual.getVecesRepetido());
            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }

    public void reproducir(int ciclos) {
        if (cabeza == null) {
            System.out.println("No hay anuncios.");
            return;
        }

        int tiempoTotal = 0;
        Anuncio masRepetido = cabeza;

        Anuncio actual = cabeza;

        for (int i = 0; i < ciclos; i++) {
            do {
                System.out.println("Mostrando: " + actual.getTitulo());

                actual.setVecesRepetido(actual.getVecesRepetido() + 1);
                tiempoTotal += actual.getDuracionSegundos();

                if (actual.getVecesRepetido() > masRepetido.getVecesRepetido()) {
                    masRepetido = actual;
                }

                actual = actual.getSiguiente();

            } while (actual != cabeza);
        }

        System.out.println("\nAnuncio más repetido: " + masRepetido.getTitulo() +
                " (" + masRepetido.getVecesRepetido() + " veces)");

        System.out.println("Tiempo total en pantalla: " + tiempoTotal + " segundos");
    }
}