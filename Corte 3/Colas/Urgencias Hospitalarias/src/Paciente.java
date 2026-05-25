public class Paciente {

    private String cedula;
    private String nombreCompleto;
    private int edad;
    private String sintomaPrincipal;

    private Paciente siguiente;

    public Paciente(String cedula, String nombreCompleto,
                     int edad, String sintomaPrincipal) {

        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sintomaPrincipal = sintomaPrincipal;
        this.siguiente = null;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSintomaPrincipal() {
        return sintomaPrincipal;
    }

    public void setSintomaPrincipal(String sintomaPrincipal) {
        this.sintomaPrincipal = sintomaPrincipal;
    }

    public Paciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Paciente siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {

        return "[" +
                cedula + " | " +
                nombreCompleto + " | " +
                edad + " años | " +
                sintomaPrincipal + "]";
    }
}
