public class Ejercicio2 {
    public static void main(String[] args){
        // Declaración de variables
        double precioUnitario = 25.50;
        int cantidad = 4;
        double descuento = 10.0; // porcentaje

        // Cálculos
        double subtotal = precioUnitario * cantidad;
        double descuentoAplicado = subtotal * (descuento / 100);
        double totalPagar = subtotal - descuentoAplicado;

        // Mostrar resultados
        System.out.println("=== Factura ===");
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total a pagar: $" + totalPagar);


    }
}
