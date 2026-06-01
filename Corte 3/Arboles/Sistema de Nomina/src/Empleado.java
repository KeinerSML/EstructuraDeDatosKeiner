public class Empleado {

    long cedula;
    String nombreCompleto;
    String cargo;
    double salario;

    Empleado izquierda;
    Empleado derecha;

    public Empleado(long cedula, String nombreCompleto, String cargo, double salario) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.salario = salario;

        izquierda = null;
        derecha = null;
    }
}