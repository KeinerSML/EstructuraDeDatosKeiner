public class Pieza {

    private String nombrePieza;
    private String numeroSerie;
    private boolean esDefectuosa;

    Pieza siguiente;

    public Pieza(String nombrePieza, String numeroSerie, boolean esDefectuosa) {
        this.nombrePieza = nombrePieza;
        this.numeroSerie = numeroSerie;
        this.esDefectuosa = esDefectuosa;
        this.siguiente = null;
    }

    public String getNombrePieza() {
        return nombrePieza;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public boolean isEsDefectuosa() {
        return esDefectuosa;
    }
}
