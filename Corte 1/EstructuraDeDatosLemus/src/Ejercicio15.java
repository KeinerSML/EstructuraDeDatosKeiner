public class Ejercicio15 {
    public static void main(String[] args) {

        // Arreglo con las temperaturas máximas de la semana
        double[] temperaturas = {30.5, 28.0, 31.2, 29.8, 32.5, 27.9, 30.0};

        double suma = 0;

        // Calcular la suma de las temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
        }

        // Calcular el promedio
        double promedio = suma / temperaturas.length;

        System.out.println("Promedio semanal: " + promedio);

        // Días de la semana
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println("Días con temperatura por encima del promedio:");

        // Mostrar los días que superan el promedio
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > promedio) {
                System.out.println(dias[i] + " (" + temperaturas[i] + "°C)");
            }
        }
    }
}
