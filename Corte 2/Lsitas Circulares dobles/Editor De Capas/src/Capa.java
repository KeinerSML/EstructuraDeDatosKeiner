public class Capa {
    private String nombre;
    private boolean visible;
    private String tipo;

    Capa siguiente;
    Capa anterior;

    public Capa(String nombre, boolean visible, String tipo) {
        this.nombre = nombre;
        this.visible = visible;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isVisible() {
        return visible;
    }

    public void toggleVisible() {
        this.visible = !this.visible;
    }

    public String getTipo() {
        return tipo;
    }
}
