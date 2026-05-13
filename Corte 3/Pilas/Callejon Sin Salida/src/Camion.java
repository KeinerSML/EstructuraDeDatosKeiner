public class Camion {

    private String placa;
    private String conductor;
    private double cargaToneladas;

    Camion siguiente;

    public Camion(String placa, String conductor, double cargaToneladas) {
        this.placa = placa;
        this.conductor = conductor;
        this.cargaToneladas = cargaToneladas;
        this.siguiente = null;
    }

    public String getPlaca() {
        return placa;
    }

    public String getConductor() {
        return conductor;
    }

    public double getCargaToneladas() {
        return cargaToneladas;
    }
}