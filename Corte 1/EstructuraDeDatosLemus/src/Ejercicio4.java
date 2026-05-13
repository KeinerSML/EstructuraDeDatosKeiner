public class Ejercicio4 {
    public static void main(String[] args){
        String placa;
        int Fabricacion;
        int cilindraje;
        double precioCompra;
        char inicialColor;
        boolean soatVigente;

        // Asignación de valores de ejemplo
        placa = "ABC123";
        Fabricacion = 2022;
        cilindraje = 1600;
        precioCompra = 45000000.0;
        inicialColor = 'R';  // R = Rojo
        soatVigente = true;

        // Impresión de datos
        System.out.println("=== Datos del Vehículo ===");
        System.out.println("Placa: " + placa);
        System.out.println("Año de fabricación: " + Fabricacion);
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Precio de compra: $" + precioCompra);
        System.out.println("Inicial del color: " + inicialColor);
        System.out.println("SOAT vigente: " + soatVigente);
    }
}
