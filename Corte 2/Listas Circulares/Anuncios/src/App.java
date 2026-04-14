/*2. Carrusel de Anuncios (Pantalla Digital)
Una tienda tiene una pantalla que muestra anuncios en rotación continua. Cuando termina el último anuncio, 
vuelve automáticamente al primero.

La Clase Anuncio (Nodo): Debe contener titulo (String), duracionSegundos (int), 
vecesRepetido (int) y categoria (String - ej: "Oferta", "Marca", "Evento").
El Problema: La pantalla necesita saber cuánto tiempo total lleva encendida y cuál es el anuncio 
que más veces se ha repetido.

Reto: Implementa el método reproducir(int ciclos) que simule ciclos pasadas completas 
por todos los anuncios, incrementando vecesRepetido en cada paso e imprimiendo qué anuncio está en pantalla. 
Al finalizar, muestra el anuncio más repetido y el tiempo total acumulado en pantalla. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();

        int opcion;

        do {
            System.out.println("\n===== CARRUSEL DE ANUNCIOS =====");
            System.out.println("1. Agregar anuncio");
            System.out.println("2. Mostrar anuncios");
            System.out.println("3. Reproducir anuncios");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Categoría: ");
                    String categoria = sc.nextLine();

                    lista.agregar(titulo, duracion, categoria);
                    System.out.println("Anuncio agregado.");
                    break;

                case 2:
                    lista.mostrar();
                    break;

                case 3:
                    System.out.print("Ingrese ciclos: ");
                    int ciclos = sc.nextInt();
                    lista.reproducir(ciclos);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
