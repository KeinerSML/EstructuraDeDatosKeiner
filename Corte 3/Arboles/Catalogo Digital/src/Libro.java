public class Libro {
    long isbn;
    String titulo;
    String autor;
    int anioPublicacion;

    Libro izquierda;
    Libro derecha;

    public Libro(long isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.izquierda = null;
        this.derecha = null;
    }
}