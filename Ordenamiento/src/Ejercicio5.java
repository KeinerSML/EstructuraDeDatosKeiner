/*5. El Inspector de Eficiencia (Duelo de Métodos)
Algoritmos obligatorios: Selección vs Inserción

Contexto: Un analista de sistemas quiere saber cuál algoritmo es 
más "pesado" en términos de operaciones para un caso específico.
Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. 
El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
Lógica de Conteo:En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
Resultado esperado: El programa debe imprimir cuántos intercambios hizo 
Selección y cuántos movimientos hizo Inserción. El estudiante debe concluir cuál 
fue más eficiente para esos datos ingresados por el teclado. */
import java.util.Scanner;

public class Ejercicio5 {
    // Método Selection Sort
    public static int selectionSort(int[] arr) {

        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    // Método Insertion Sort
    public static int insertionSort(int[] arr) {

        int movimientos = 0;

        for (int i = 1; i < arr.length; i++) {

            int clave = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j--;
                movimientos++;
            }

            arr[j + 1] = clave;
        }

        return movimientos;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        System.out.println("Ingresa 6 numeros enteros: ");
        for (int i = 0; i < 6; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int[] copia1 = numeros.clone();
        int[] copia2 = numeros.clone();

        int swapsSeleccion = selectionSort(copia1);
        int movimientosInsercion = insertionSort(copia2);

        System.out.println("\nResultados del análisis:");

        System.out.println("Intercambios en Selection Sort: " + swapsSeleccion);
        System.out.println("Movimientos en Insertion Sort: " + movimientosInsercion);

        if (swapsSeleccion < movimientosInsercion) {
            System.out.println("Selection Sort fue más eficiente para estos datos.");
        } else if (movimientosInsercion < swapsSeleccion) {
            System.out.println("Insertion Sort fue más eficiente para estos datos.");
        } else {
            System.out.println("Ambos algoritmos tuvieron la misma eficiencia.");
        }

        scanner.close();
    }
}
