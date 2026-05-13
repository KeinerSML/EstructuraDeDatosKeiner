public class Contenedor {

    private String idCodigo;
    private String empresa;
    private double peso;
    private String tipoCarga;

    Contenedor siguiente;

    public Contenedor(String idCodigo, String empresa, double peso, String tipoCarga) {
        this.idCodigo = idCodigo;
        this.empresa = empresa;
        this.peso = peso;
        this.tipoCarga = tipoCarga;
        this.siguiente = null;
    }

    public String getIdCodigo() {
        return idCodigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getPeso() {
        return peso;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }
}
