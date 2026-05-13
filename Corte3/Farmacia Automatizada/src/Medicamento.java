public class Medicamento {

    private String nombre;
    private String lote;
    private int diasParaVencer;

    Medicamento siguiente;

    public Medicamento(String nombre, String lote, int diasParaVencer) {
        this.nombre = nombre;
        this.lote = lote;
        this.diasParaVencer = diasParaVencer;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLote() {
        return lote;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }
}
