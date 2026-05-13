public class Ejercicio8 {
    public static void main(String[] args){
        // Declaración y asignación inicial
        String ultimoMensaje = "Hola";
        String copiaTexto = ultimoMensaje;

        // Se cambia el valor de copiaTexto
        copiaTexto = "¿Cómo estás?";

        // Mostrar ambas variables
        System.out.println("Último mensaje: " + ultimoMensaje);
        System.out.println("Copia del texto: " + copiaTexto);

        /*
         En Java, los String son inmutables.
         Esto significa que su contenido no puede modificarse.

         Cuando hacemos:
         copiaTexto = "¿Cómo estás?";
         no estamos modificando el texto original,
         sino que copiaTexto ahora apunta a un nuevo objeto String.

         Por eso, ultimoMensaje sigue teniendo el valor "Hola".
        */
    }
}
