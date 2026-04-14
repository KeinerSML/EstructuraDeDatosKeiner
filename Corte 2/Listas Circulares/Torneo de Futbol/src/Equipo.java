public class Equipo {
    private String nombre;
    private String ciudad;
    private int puntos;
    private int golesFavor;
    private Equipo siguiente;

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = 0;
        this.golesFavor = 0;
        this.siguiente = null;
    }

    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public int getPuntos() { return puntos; }
    public int getGolesFavor() { return golesFavor; }
    public Equipo getSiguiente() { return siguiente; }

    public void setPuntos(int puntos) { this.puntos = puntos; }
    public void setGolesFavor(int goles) { this.golesFavor = goles; }
    public void setSiguiente(Equipo siguiente) { this.siguiente = siguiente; }
}