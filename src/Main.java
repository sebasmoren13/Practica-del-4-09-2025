import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        int n1, n2, suma;

        System.out.println("Ingrese el numero 1:");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el numero 2:");
        n2 = teclado.nextInt();
        suma = n1 + n2;
        System.out.println("El resultado es: " + suma);*/


        Random aleatorio = new Random();
        int a, b, z;
        System.out.println("Numero generado");
        a = aleatorio.nextInt(51);
        System.out.println("Segundo Numero ");
        b = aleatorio.nextInt((30 - 5) + 1) + 5;

    z=a+b;
        System.out.println("El resultado es: " + z);
    }
}
