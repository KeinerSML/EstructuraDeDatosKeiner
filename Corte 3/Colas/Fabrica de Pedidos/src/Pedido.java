public class Pedido {

    private String numeroPedido;
    private String cliente;
    private double totalPagar;
    private boolean cancelado;

    private Pedido siguiente;

    public Pedido(String numeroPedido, String cliente,
                   double totalPagar, boolean cancelado) {

        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.totalPagar = totalPagar;
        this.cancelado = cancelado;
        this.siguiente = null;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public Pedido getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Pedido siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {

        String estado;

        if (cancelado) {
            estado = "CANCELADO";
        } else {
            estado = "ACTIVO";
        }

        return "[" +
                numeroPedido + " | " +
                cliente + " | $" +
                totalPagar + " | " +
                estado + "]";
    }
}
