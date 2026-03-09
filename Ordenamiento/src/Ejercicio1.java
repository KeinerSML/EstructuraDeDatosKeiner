/*El Podio de la Competencia
Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico 
necesita determinar quiénes ganaron las medallas.
Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participarán 
(ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
Lógica de Selección: El algoritmo debe buscar el tiempo más bajo 
(el más rápido) en cada iteración y colocarlo al inicio.
Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, 
adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro 
(1er lugar), Plata (2do lugar) y Bronce (3er lugar). */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de corredores (5 - 10): ");
        int corredores = scanner.nextInt();

        double[] tiempos = new double[corredores];

        for (int i = 0; i < corredores; i++) {
            System.out.println("Ingrese el tiempo del corredor " + (i + 1) + ": ");
            tiempos[i] = scanner.nextDouble();
        }

        for (int i = 0; i < corredores; i++) {
            int posicion = i;
            for (int j = 0; j < corredores; j++) {
                if (tiempos[j] < tiempos[posicion]) {
                    posicion = j;
                }
            }

            double temp = tiempos[i];
            tiempos[i] = tiempos[posicion];
            tiempos[posicion] = temp;
        }

        System.out.println("\nTiempos ordenados:");
        for (int i = 0; i < corredores; i++) {
            System.out.println((i + 1) + " lugar: " + tiempos[i] + " segundos");
        }

        if (corredores >= 3) {
            System.out.println("\nPodio de la competencia:");
            System.out.println("Oro: " + tiempos[0] + " segundos");
            System.out.println("Plata: " + tiempos[1] + " segundos");
            System.out.println("Bronce: " + tiempos[2] + " segundos");
        }

        scanner.close();

    }
}
