public class Comando {
    private String texto;
    private boolean exitoso;
    private String directorio;

    Comando siguiente;
    Comando anterior;

    public Comando(String texto, boolean exitoso, String directorio) {
        this.texto = texto;
        this.exitoso = exitoso;
        this.directorio = directorio;
    }

    public String getTexto() {
        return texto;
    }

    public boolean isExitoso() {
        return exitoso;
    }

    public String getDirectorio() {
        return directorio;
    }
}
