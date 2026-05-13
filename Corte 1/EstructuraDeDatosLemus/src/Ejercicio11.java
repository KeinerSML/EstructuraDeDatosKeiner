public class Ejercicio11 {
    public static void main(String[] args) {

        // Crear arreglo con capacidad para 6 pasajeros
        String[] pasajeros = new String[6];

        // Llenar el arreglo con nombres (ejemplo)
        pasajeros[0] = "Keiner Lemus";
        pasajeros[1] = "Pacho Rincon";
        pasajeros[2] = "Kikin Quintero";
        pasajeros[3] = "Alfonso Vargas";
        pasajeros[4] = "Yimer Sarabia";
        pasajeros[5] = "Yanelis Carrascal";

        // Contador de asientos ocupados
        int asientosOcupados = 0;

        System.out.println("=== Lista de Pasajeros ===");

        // Recorrer el arreglo
        for (int i = 0; i < pasajeros.length; i++) {
            if (pasajeros[i] != null) {
                System.out.println("Asiento " + (i + 1) + ": " + pasajeros[i]);
                asientosOcupados++;
            }
        }

        // Mostrar total de asientos ocupados
        System.out.println("Total de asientos ocupados: " + asientosOcupados);
    }
}
