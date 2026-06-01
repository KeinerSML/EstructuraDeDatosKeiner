public class ArbolLibros {

    private Libro raiz;

    public ArbolLibros() {
        raiz = null;
    }

    public void insertar(long isbn, String titulo, String autor, int anio) {
        raiz = insertarRec(raiz, isbn, titulo, autor, anio);
    }

    private Libro insertarRec(Libro nodo, long isbn, String titulo, String autor, int anio) {

        if (nodo == null) {
            return new Libro(isbn, titulo, autor, anio);
        }

        if (isbn < nodo.isbn) {
            nodo.izquierda = insertarRec(nodo.izquierda, isbn, titulo, autor, anio);
        } else if (isbn > nodo.isbn) {
            nodo.derecha = insertarRec(nodo.derecha, isbn, titulo, autor, anio);
        }

        return nodo;
    }

    public boolean existeISBN(long isbn) {
        return existeISBNRec(raiz, isbn);
    }

    private boolean existeISBNRec(Libro nodo, long isbn) {

        if (nodo == null) {
            return false;
        }

        if (nodo.isbn == isbn) {
            return true;
        }

        if (isbn < nodo.isbn) {
            return existeISBNRec(nodo.izquierda, isbn);
        } else {
            return existeISBNRec(nodo.derecha, isbn);
        }
    }

    public void imprimirCatalogo() {
        if (raiz == null) {
            System.out.println("No hay libros registrados.");
            return;
        }

        System.out.println("\n=== CATÁLOGO ORDENADO POR ISBN ===");
        imprimirInOrden(raiz);
    }

    private void imprimirInOrden(Libro nodo) {

        if (nodo != null) {
            imprimirInOrden(nodo.izquierda);

            System.out.println(
                    nodo.isbn + " - " +
                    nodo.titulo + " - " +
                    nodo.autor);

            imprimirInOrden(nodo.derecha);
        }
    }
}