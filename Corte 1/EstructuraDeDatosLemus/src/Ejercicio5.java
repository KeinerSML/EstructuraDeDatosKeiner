public class Ejercicio5 {
    public static void main(String[] args){
        // Declaración de variables
        double tazas;
        double mililitros;
        double litros;

        // Asignación de valor de ejemplo
        tazas = 3.5;

        // Conversión
        mililitros = tazas * 236.588;
        litros = mililitros / 1000;

        // Mostrar resultados
        System.out.println("=== Conversor de Unidades ===");
        System.out.println("Tazas: " + tazas);
        System.out.println("En mililitros: " + mililitros + " ml");
        System.out.println("En litros: " + litros + " L");

    }
}
