public class Ejercicio9 {
    public static void main(String[] args){
        // El profesor crea el arreglo con las notas iniciales
        double[] notasProfesor = {4.0, 2.5, 3.8, 4.5};

        // El coordinador recibe la misma referencia al arreglo
        double[] notasCoordinador = notasProfesor;

        // El coordinador corrige la nota del estudiante 2 (índice 1)
        notasCoordinador[1] = 3.0;

        // Mostrar notas desde la perspectiva del profesor
        System.out.println("=== Notas vistas por el Profesor ===");
        for (int i = 0; i < notasProfesor.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notasProfesor[i]);
        }

        // Mostrar notas desde la perspectiva del coordinador
        System.out.println("=== Notas vistas por el Coordinador ===");
        for (int i = 0; i < notasCoordinador.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notasCoordinador[i]);
        }

        /*
         En Java, los arreglos son objetos y se manejan por referencia.
         Cuando hacemos:
         double[] notasCoordinador = notasProfesor;

         No se crea una copia del arreglo.
         Ambas variables apuntan al mismo espacio en memoria.

         Por eso, al modificar notasCoordinador[1],
         también cambia notasProfesor[1],
         porque realmente es el mismo arreglo.
        */
    }
}
