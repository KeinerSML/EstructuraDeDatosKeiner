public class Ejercicio3 {
    public static void main(String[] args) {

        // Declaración de variables
        double temperatura;
        String nombreSensor;
        int numeroLectura;
        boolean enAlarma;

        // Asignación de valores de ejemplo
        temperatura = 85.5;
        nombreSensor = "Sensor_Temperatura_A1";
        numeroLectura = 102;

        // Condición para activar la alarma
        enAlarma = temperatura > 80;

        // Impresión del estado del sensor
        System.out.println("=== Estado del Sensor ===");
        System.out.println("Nombre del sensor: " + nombreSensor);
        System.out.println("Número de lectura: " + numeroLectura);
        System.out.println("Temperatura actual: " + temperatura + " °C");
        System.out.println("En alarma: " + enAlarma);
    }
}
