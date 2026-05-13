/*. Registro Alfabético de Estudiantes
Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

Contexto: El profesor necesita pasar asistencia y requiere 
que la lista de nombres ingresada en el sistema se ordene alfabéticamente de la A a la Z.
Detalle del ejercicio: El programa debe preguntar cuántos alumnos 
hay en clase y solicitar sus nombres (cadenas de texto).
Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
Requisito técnico: El estudiante debe investigar y aplicar el 
método nombre1.compareToIgnoreCase(nombre2). Es vital explicar que 
si el resultado es mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto. */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de estudiantes: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] estudiantes = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = scanner.nextLine();
        }

        for (int i = 1; i < n; i++){
            String clave = estudiantes[i];
            int j = i - 1;

            while (j >= 0 && estudiantes[j].compareToIgnoreCase(clave) > 0) {
                estudiantes[j + 1] = estudiantes[j];
                j = j - 1;
            }

            estudiantes[j + 1] = clave;
        }

        System.out.println("\nLista de asistencia en orden alfabético:");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i]);
        }

        scanner.close();
    }
    
}
