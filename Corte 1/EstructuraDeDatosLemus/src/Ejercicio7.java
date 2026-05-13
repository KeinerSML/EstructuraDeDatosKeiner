public class Ejercicio7 {
    public static void main(String[] args){
        int[] stockAlmacen = {50, 30, 20, 15, 40};

        // Asignar la misma referencia a otro arreglo
        int[] stockReportes = stockAlmacen;

        // Simular una venta: reducir 5 unidades del producto en posición 1
        stockReportes[1] = stockReportes[1] - 5;

        // Mostrar el contenido de ambos arreglos
        System.out.println("=== Stock desde Almacén ===");
        for (int i = 0; i < stockAlmacen.length; i++) {
            System.out.println("Producto " + i + ": " + stockAlmacen[i]);
        }

        System.out.println("=== Stock desde Reportes ===");
        for (int i = 0; i < stockReportes.length; i++) {
            System.out.println("Producto " + i + ": " + stockReportes[i]);
        }

        /*
         Los arreglos en Java son objetos.
         Cuando hacemos: stockReportes = stockAlmacen;
         no se crea una copia, sino que ambas variables apuntan
         al mismo arreglo en memoria.

         Por eso, al modificar stockReportes[1],
         también cambia stockAlmacen[1], porque es el mismo objeto.
        */
    }
}
