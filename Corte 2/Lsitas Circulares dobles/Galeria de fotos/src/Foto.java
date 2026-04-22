public class Foto {
    private String titulo;
    private String fecha;
    private boolean esFavorita;

    Foto siguiente;
    Foto anterior;

    public Foto(String titulo, String fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.esFavorita = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isFavorita() {
        return esFavorita;
    }

    public void toggleFavorita() {
        this.esFavorita = !this.esFavorita;
    }
}
