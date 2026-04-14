public class Proceso {
    private String nombre;
    private int pid;
    private int tiempoRestante;
    private int prioridad;
    private Proceso siguiente;

    public Proceso(String nombre, int pid, int tiempoRestante, int prioridad) {
        this.nombre = nombre;
        this.pid = pid;
        this.tiempoRestante = tiempoRestante;
        this.prioridad = prioridad;
        this.siguiente = null;
    }

    public String getNombre() { return nombre; }
    public int getPid() { return pid; }
    public int getTiempoRestante() { return tiempoRestante; }
    public int getPrioridad() { return prioridad; }
    public Proceso getSiguiente() { return siguiente; }

    public void setTiempoRestante(int tiempo) { this.tiempoRestante = tiempo; }
    public void setSiguiente(Proceso siguiente) { this.siguiente = siguiente; }
}
