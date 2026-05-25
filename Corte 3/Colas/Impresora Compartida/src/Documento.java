public class Documento {

    private String nombreArchivo;
    private String usuario;
    private int numeroPaginas;
    private boolean esColor;

    private Documento siguiente;

    public Documento(String nombreArchivo, String usuario,
                      int numeroPaginas, boolean esColor) {

        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
        this.numeroPaginas = numeroPaginas;
        this.esColor = esColor;
        this.siguiente = null;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isEsColor() {
        return esColor;
    }

    public void setEsColor(boolean esColor) {
        this.esColor = esColor;
    }

    public Documento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Documento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {

        String tipo;

        if (esColor) {
            tipo = "Color";
        } else {
            tipo = "Blanco y Negro";
        }

        return "[" +
                nombreArchivo + " | " +
                usuario + " | " +
                numeroPaginas + " páginas | " +
                tipo + "]";
    }
}
