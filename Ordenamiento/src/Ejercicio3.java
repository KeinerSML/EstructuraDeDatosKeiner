/*3. El Salto de Shell (Optimización de Datos)
Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)

Contexto: Una empresa de logística maneja paquetes con diferentes pesos y 
necesita ordenarlos de forma más eficiente que el método de burbuja o inserción simple.
Detalle del ejercicio: Solicita al usuario el peso de N paquetes 
(se recomienda probar con al menos 10 para notar el efecto).
Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de N/2
El estudiante debe explicar en comentarios por qué este método 
es generalmente más rápido que la inserción simple al trabajar con elementos que 
están muy lejos de su posición final.
Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado 
después de aplicar todas las fases de reducción de saltos. */

import java.util.Scanner;

public class Ejercicio3 {

    public static void MostrarArreglo(int[] arr){
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static void ShellSort(int[] arr){
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de paquetes: ");
        int n = scanner.nextInt();

        int[] pesos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el peso del paquete " + (i + 1) + ": ");
            pesos[i] = scanner.nextInt();
        }

        // Mostrar arreglo original
        System.out.println("\nArreglo original:");
        MostrarArreglo(pesos);

        // Aplicar Shell Sort
        ShellSort(pesos);

        // Mostrar arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        MostrarArreglo(pesos);

        scanner.close();
    }
}
