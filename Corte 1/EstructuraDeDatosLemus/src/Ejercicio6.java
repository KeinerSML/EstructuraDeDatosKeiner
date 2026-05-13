public class Ejercicio6 {
    public static void main(String[] args){
        int turnoActual = 15;

        // Asignamos el valor de turnoActual a turnoEnPantalla
        int turnoEnPantalla = turnoActual;

        // Cambiamos el valor de turnoEnPantalla
        turnoEnPantalla = 16;

        // Mostramos los valores
        System.out.println("Turno actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);

        /*
         En Java, los tipos primitivos como int se copian por valor.
         Esto significa que turnoEnPantalla recibe una COPIA del valor
         de turnoActual, no la variable original.
         Por eso, al cambiar turnoEnPantalla, turnoActual no se ve afectado.
        */
    }
}
