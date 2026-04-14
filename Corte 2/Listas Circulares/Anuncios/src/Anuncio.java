public class Anuncio {
    private String titulo;
    private int duracionSegundos;
    private int vecesRepetido;
    private String categoria;
    private Anuncio siguiente;

    public Anuncio(String titulo, int duracionSegundos, String categoria) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.categoria = categoria;
        this.vecesRepetido = 0;
        this.siguiente = null;
    }

    public String getTitulo() { return titulo; }
    public int getDuracionSegundos() { return duracionSegundos; }
    public int getVecesRepetido() { return vecesRepetido; }
    public String getCategoria() { return categoria; }
    public Anuncio getSiguiente() { return siguiente; }

    public void setVecesRepetido(int veces) { this.vecesRepetido = veces; }
    public void setSiguiente(Anuncio siguiente) { this.siguiente = siguiente; }
}