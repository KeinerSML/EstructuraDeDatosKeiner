public class Ejercicio3 {
    public static void main(String[] args) {

        double[] temperaturas = {65.2, 70.5, 68.9, 72.3, 69.8, 75.1, 71.4};

        double maximo = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maximo) {
                maximo = temperaturas[i];
            }
        }

        System.out.println("La temperatura más alta registrada fue: " + maximo + "°C");
    }
}
