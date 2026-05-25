public class Vehiculo {

    private String placa;
    private String tipoVehiculo;
    private double tarifa;
    private boolean esExento;

    private Vehiculo siguiente;

    public Vehiculo(String placa, String tipoVehiculo,
                     double tarifa, boolean esExento) {

        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.tarifa = tarifa;
        this.esExento = esExento;
        this.siguiente = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isEsExento() {
        return esExento;
    }

    public void setEsExento(boolean esExento) {
        this.esExento = esExento;
    }

    public Vehiculo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Vehiculo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {

        String estado;

        if (esExento) {
            estado = "EXENTO";
        } else {
            estado = "PAGA";
        }

        return "[" +
                placa + " | " +
                tipoVehiculo + " | $" +
                tarifa + " | " +
                estado + "]";
    }
}
