import java.util.Scanner;
public class Reto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double[] precios = new double[5];
 
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        double total = 0;
        double precioMasAlto = precios[0];

        
        for (double precio : precios) {
            total += precio;

            if (precio > precioMasAlto) {
                precioMasAlto = precio;
            }
        }

        System.out.println("Total sin descuento: " + total);
        System.out.println("El precio más alto ingresado fue: " + precioMasAlto);

        if (total > 20000) {
            System.out.println("¡Tienes un descuento de 2.000!");
            total -= 2000;
        }

        System.out.println("Total final a pagar: " + total);

        scanner.close();
    }
}
