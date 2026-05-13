public class Ejercicio12 {
    public static void main(String[] args){
        // Arreglo con 7 ventas del día
        double[] ventas = {150.50, 320.75, 89.99, 450.00, 210.30, 99.90, 500.25};

        // Inicializamos variables
        double ventaMayor = ventas[0];
        double ventaMenor = ventas[0];
        double totalDia = 0;

        // Recorrer el arreglo
        for (int i = 0; i < ventas.length; i++) {

            // Sumar al total
            totalDia += ventas[i];

            // Verificar venta mayor
            if (ventas[i] > ventaMayor) {
                ventaMayor = ventas[i];
            }

            // Verificar venta menor
            if (ventas[i] < ventaMenor) {
                ventaMenor = ventas[i];
            }
        }

        // Mostrar resultados
        System.out.println("=== Historial de Ventas del Día ===");
        System.out.println("Venta más alta: $" + ventaMayor);
        System.out.println("Venta más baja: $" + ventaMenor);
        System.out.println("Total vendido en el día: $" + totalDia);
    }
}
