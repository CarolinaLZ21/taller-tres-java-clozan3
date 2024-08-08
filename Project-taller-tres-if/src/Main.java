import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Leer tres valores y almacenarlos en las variables A, B y C respectivamente.
    // Debe imprimir cual es el mayor y cuál es el menor.
    // Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos.
    // Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.

    public static void main(String[] args) {

        Scanner Valora = new Scanner(System.in);
        System.out.println("Valor para A");
        int a = Valora.nextInt();

        Scanner Valorb = new Scanner(System.in);
        System.out.println("Valor para B");
        int b = Valorb.nextInt();

        Scanner Valorc = new Scanner(System.in);
        System.out.println("Valor para C");
        int c = Valorc.nextInt();

        if (a == b || b == c || c == a)
            System.out.println("Los Valores son iguales, por favor ingresar valores diferentes");
        else if (a > b && a > c) {
            System.out.println("El valor mayor es: " + a);
            if (b > c) {
                System.out.println("El valor menor es: " + c);
            } else {
                System.out.println("El valor menor es: " + b);
            }
        } else if (b > a && b > c) {
            System.out.println("El valor mayor es: " + b);
            if (a > c) {
                System.out.println("El valor menor es: " + c);
            } else {
                System.out.println("El valor menor es: " + a);
            }
        } else {
            System.out.println("El valor mayor es: " + c);
            if (a > b) {
                System.out.println("El valor menor es: " + b);
            } else {
                System.out.println("El valor menor es: " + a);

            }


        }
    }
}
