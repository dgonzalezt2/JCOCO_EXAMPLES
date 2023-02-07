import java.util.Scanner;
public class juan {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        if (numero % 2 == 0)
            System.out.println("El número es par");
        if (numero % 4 == 0)
            System.out.println("El numero es multiplo de 4");
        if (numero % 10 == 0)
            System.out.println("El numero es multiplo de 10");
    }
}
