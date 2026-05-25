public class Llamada {

    private String idLlamada;
    private String nombreCliente;
    private String motivoConsulta;
    private int duracionEstimadaMinutos;

    private Llamada siguiente;

    public Llamada(String idLlamada, String nombreCliente,
                    String motivoConsulta, int duracionEstimadaMinutos) {

        this.idLlamada = idLlamada;
        this.nombreCliente = nombreCliente;
        this.motivoConsulta = motivoConsulta;
        this.duracionEstimadaMinutos = duracionEstimadaMinutos;
        this.siguiente = null;
    }

    // Getters y Setters
    public String getIdLlamada() {
        return idLlamada;
    }

    public void setIdLlamada(String idLlamada) {
        this.idLlamada = idLlamada;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public int getDuracionEstimadaMinutos() {
        return duracionEstimadaMinutos;
    }

    public void setDuracionEstimadaMinutos(int duracionEstimadaMinutos) {
        this.duracionEstimadaMinutos = duracionEstimadaMinutos;
    }

    public Llamada getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Llamada siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "[" + idLlamada + " | " +
                nombreCliente + " | " +
                motivoConsulta + " | " +
                duracionEstimadaMinutos + " min]";
    }
}