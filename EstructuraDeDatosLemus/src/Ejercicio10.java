public class Ejercicio10 {
    public static void main(String[] args){
        // Arreglo original (resolución y FPS)
        int[] configuracion = {1920, 1080, 60};

        // Crear un nuevo arreglo del mismo tamaño
        int[] copiaConfiguracion = new int[configuracion.length];

        // Copiar elemento por elemento
        for (int i = 0; i <= configuracion.length; i++) {
            copiaConfiguracion[i] = configuracion[i];
        }

        // Modificar la copia
        copiaConfiguracion[2] = 120; // Cambiamos los FPS

        // Mostrar arreglo original
        System.out.println("=== Configuración Original ===");
        for (int i = 0; i < configuracion.length; i++) {
            System.out.println(configuracion[i]);
        }

        // Mostrar copia modificada
        System.out.println("=== Copia Modificada ===");
        for (int i = 0; i < copiaConfiguracion.length; i++) {
            System.out.println(copiaConfiguracion[i]);
        }

        /*
         Diferencia importante:

         Si hubiéramos hecho:
         int[] copiaConfiguracion = configuracion;

         Solo estaríamos copiando la referencia,
         es decir, ambas variables apuntarían al mismo arreglo en memoria.

         Pero al crear un nuevo arreglo y copiar elemento por elemento,
         estamos creando un objeto diferente en memoria.

         Por eso, al modificar la copia,
         el arreglo original NO cambia.
        */
    }
}
