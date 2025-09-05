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


        /*Random aleatorio = new Random();
        int a, b, z;
        System.out.println("Numero generado");
        a = aleatorio.nextInt(51);
        System.out.println("Segundo Numero ");
        b = aleatorio.nextInt((30 - 5) + 1) + 5;

    z=a+b;
        System.out.println("El resultado es: " + z);*/


       /* Random aleatorio = new Random();
        int a,b,sumaD1=0,sumaD2=0;
            for (int i=1;i<=20; i++) {
                System.out.println("Numero aleatorio dado 1");
                a =aleatorio.nextInt((6 - 1) + 1) + 1;
                sumaD1+=a;

                System.out.println("Numero aleatorio dado 2");
                b = aleatorio.nextInt((6 - 1) + 1) +1;
                sumaD2+=b;
            }

            if(sumaD1<sumaD2){
                System.out.println("El dado 1 gana="+sumaD1);

            }
            else if(sumaD1>sumaD2){
                System.out.println("El dado 2 gana="+sumaD2);
        }
                else if(sumaD1==sumaD2){
                    System.out.println("EMPATE="+sumaD2);
            }*/


            Random aleatorio = new Random();
            int a,b,c,sumaD1=0,sumaD2=0,sumaD3=0;
                for (int i=1;i<=20; i++) {
                    System.out.println("Numero aleatorio dado 1");
                    a =aleatorio.nextInt((6 - 1) + 1) + 1;
                    sumaD1+=a;
                    System.out.println("Dado 1: " + a);

                    System.out.println("Numero aleatorio dado 2");
                    b = aleatorio.nextInt((6 - 1) + 1) +1;
                    sumaD2+=b;
                    System.out.println("Dado 2: " + b);

                    System.out.println("Numero aleatorio dado 3");
                    c = aleatorio.nextInt((6 - 1) + 1) +1;
                    sumaD3+=c;
                    System.out.println("Dado 3: " + c);
                }

        if (sumaD1 == sumaD2 && sumaD2 == sumaD3) {
            System.out.println("EMPATE TOTAL - Todos los dados sumaron: " + sumaD1);
        }
        else if (sumaD1 == sumaD2) {
            System.out.println("EMPATE entre Dado 1 y Dado 2  : " + sumaD1 +
                    "\nDado 3: " + sumaD3 +
                    (sumaD3 > sumaD1 ? " (GANADOR)" : " (PERDEDOR)"));
        }
        else if (sumaD1 == sumaD3) {
            System.out.println("EMPATE entre Dado 1 y Dado 3  : " + sumaD1 +
                    "\nDado 2: " + sumaD2 +
                    (sumaD2 > sumaD1 ? " (GANADOR)" : " (PERDEDOR)"));
        }
        else if (sumaD2 == sumaD3) {
            System.out.println("EMPATE entre Dado 2 y Dado 3 : " + sumaD2 +
                    "\nDado 1: " + sumaD1 +
                    (sumaD1 > sumaD2 ? " (GANADOR)" : " (PERDEDOR)"));

        }
            else if (sumaD1>sumaD2 &&  sumaD2>sumaD3 ) {
                System.out.println("El ganador fue el Dado 1  : " + sumaD1 +
                        "\nEl de la mitad fue el Dado 2: " + sumaD2 +
                        "\nEl ultimo fue el Dado 3: " + sumaD3 );
        }
        else if (sumaD1>sumaD2 &&  sumaD3>sumaD2 ) {
            System.out.println("El ganador fue el Dado 1  : " + sumaD1 +
                    "\nEl de la mitad fue el Dado 3: " + sumaD3 +
                    "\nEl ultimo fue el Dado 2: " + sumaD2 );
        }
        else if (sumaD2>sumaD1 &&  sumaD1>sumaD3 ) {
            System.out.println("El ganador fue el Dado 2 : " + sumaD2 +
                    "\nEl de la mitad fue el Dado 1: " + sumaD1 +
                    "\nEl ultimo fue el Dado 3: " + sumaD3 );

        }
        else if (sumaD2>sumaD1 &&  sumaD3>sumaD1 ) {
            System.out.println("El ganador fue el Dado 2  : " + sumaD2 +
                    "\nEl de la mitad fue el Dado 3: " + sumaD3 +
                    "\nEl ultimo fue el Dado 1: " + sumaD1 );
        }
        else if (sumaD3>sumaD1 &&  sumaD1>sumaD2 ) {
            System.out.println("El ganador fue el Dado 3  : " + sumaD3 +
                    "\nEl de la mitad fue el Dado 1: " + sumaD1 +
                    "\nEl ultimo fue el Dado 2: " + sumaD2 );
        }
        else if (sumaD3>sumaD2 &&  sumaD2>sumaD1 ) {
            System.out.println("El ganador fue el Dado 3 : " + sumaD3 +
                    "\nEl de la mitad fue el Dado 2: " + sumaD2 +
                    "\nEl ultimo fue el Dado 1: " + sumaD1 );
        }




    }
}
