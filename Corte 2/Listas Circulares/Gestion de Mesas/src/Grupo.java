public class Grupo {
    private String nombreReserva;
    private int numeroPersonas;
    private boolean esVip;
    private int minutosEsperando;
    private Grupo siguiente;

    public Grupo(String nombreReserva, int numeroPersonas, boolean esVip, int minutosEsperando) {
        this.nombreReserva = nombreReserva;
        this.numeroPersonas = numeroPersonas;
        this.esVip = esVip;
        this.minutosEsperando = minutosEsperando;
        this.siguiente = null;
    }

    public String getNombreReserva() { return nombreReserva; }
    public int getNumeroPersonas() { return numeroPersonas; }
    public boolean isEsVip() { return esVip; }
    public int getMinutosEsperando() { return minutosEsperando; }
    public Grupo getSiguiente() { return siguiente; }

    public void setSiguiente(Grupo siguiente) { this.siguiente = siguiente; }
}