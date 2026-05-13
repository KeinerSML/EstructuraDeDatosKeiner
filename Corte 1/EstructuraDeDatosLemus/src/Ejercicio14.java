import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio14 {
    // Clase NodoEmpleado
    static class NodoEmpleado {
        String cargo;
        NodoEmpleado izquierdo;
        NodoEmpleado derecho;

        public NodoEmpleado(String cargo) {
            this.cargo = cargo;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    public static void main(String[] args) {

        // Construcción del árbol
        NodoEmpleado gerente = new NodoEmpleado("Gerente");

        gerente.izquierdo = new NodoEmpleado("Supervisor1");
        gerente.derecho = new NodoEmpleado("Supervisor2");

        gerente.izquierdo.izquierdo = new NodoEmpleado("Analista1");
        gerente.izquierdo.derecho = new NodoEmpleado("Analista2");

        System.out.println("=== Jerarquía de la Empresa ===");

        // Recorrido por niveles
        recorrerPorNiveles(gerente);
    }

    // Método para recorrer el árbol nivel por nivel
    public static void recorrerPorNiveles(NodoEmpleado raiz) {

        if (raiz == null) return;

        Queue<NodoEmpleado> cola = new LinkedList<>();
        cola.add(raiz);

        int nivel = 0;

        while (!cola.isEmpty()) {

            int tamañoNivel = cola.size();
            System.out.println("Nivel " + nivel + ":");

            for (int i = 0; i < tamañoNivel; i++) {
                NodoEmpleado actual = cola.poll();
                System.out.println(" - " + actual.cargo);

                if (actual.izquierdo != null) {
                    cola.add(actual.izquierdo);
                }

                if (actual.derecho != null) {
                    cola.add(actual.derecho);
                }
            }

            nivel++;
        }
    }
}
