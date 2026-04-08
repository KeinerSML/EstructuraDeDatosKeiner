/*Reto 2: Contar los Nodos
A diferencia de los arreglos, que tienen la propiedad .length, en las listas enlazadas simples 
por lo general no sabemos la cantidad de elementos a menos que la contemos, o que llevemos una variable contadora.

Tu misión: Implementa el método public int contarNodos() en tu clase ListaEnlazada. 
Este método debe recorrer toda la lista, sumando 1 por cada nodo que visite, y retornar el total de elementos. 
Pruébalo en tu método main insertando diferentes cantidades de elementos y mostrando el resultado por consola. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        int opcion;

        do {
            System.out.println("\n========== LISTA ENLAZADA ==========");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Contar");
            System.out.println("0. Salir");
            System.out.println("==========================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int dato = scanner.nextInt();
                    lista.agregar(dato);
                    break;

                case 2:
                    lista.mostrar();
                    break;

                case 3:
                    int total = lista.contarNodos();
                    System.out.println("Cantidad de nodos: " + total);
                    break;

                case 0:
                    System.out.println("Saliendo.");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        scanner.close();
    }
}


