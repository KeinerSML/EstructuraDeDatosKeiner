public class Ejercicio13 {
    // Clase NodoResiduo
    static class NodoResiduo {
        String nombre;
        NodoResiduo izquierdo;
        NodoResiduo derecho;

        public NodoResiduo(String nombre) {
            this.nombre = nombre;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    public static void main(String[] args) {

        // Construcción del árbol
        NodoResiduo raiz = new NodoResiduo("Residuos");

        raiz.izquierdo = new NodoResiduo("Orgánicos");
        raiz.derecho = new NodoResiduo("Inorgánicos");

        raiz.izquierdo.izquierdo = new NodoResiduo("Comida");
        raiz.izquierdo.derecho = new NodoResiduo("Jardín");

        raiz.derecho.izquierdo = new NodoResiduo("Plástico");
        raiz.derecho.derecho = new NodoResiduo("Papel");

        System.out.println("=== Clasificación de Residuos ===");

        // Imprimir árbol indicando nivel
        imprimirArbol(raiz, 0);
    }

    // Método recursivo para recorrer el árbol
    public static void imprimirArbol(NodoResiduo nodo, int nivel) {
        if (nodo != null) {
            System.out.println("Nivel " + nivel + ": " + nodo.nombre);
            imprimirArbol(nodo.izquierdo, nivel + 1);
            imprimirArbol(nodo.derecho, nivel + 1);
        }
    }
}
