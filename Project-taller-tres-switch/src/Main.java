import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Desarrolla un programa que de acuerdo a la calificación númerica ingresada, indique en qué categoría se encuentra la nota.
        //    El número que se debe ingresar debe ser en el rango de 1 a 10,
        //    Tenga en cuanta los siguientes datos de acuerdo al número ingresado:
        //            - Si es 1 o 2 imprime "Su calificación es: F"
        //            - Si es 3 o 4 imprime "Su calificación es: D"
        //            - Si es 5 o 6 imprime "Su calificación es: C"
        //            - Si es 7 o 8 imprime "Su calificación es: B"
        //            - Si es 9 o 10 imprime "Su calificación es: A"
        //            - Si es diferente al rango imprime "Número no válido, por favor verifique"

        Scanner calificacion = new Scanner(System.in);
        System.out.println("Ingrese calificación");
        int cal = calificacion.nextInt();

        switch (cal) {
            case 1:
            case 2:
                System.out.println("Calificación F");
                break;
            case 3:
            case 4:
                System.out.println("Calificación D");
                break;
            case 5:
            case 6:
                System.out.println("Calificación C");
                break;
            case 7:
            case 8:
                System.out.println("Calificación B");
                break;
            case 9:
            case 10:
                System.out.println("Calificación A");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");
        }


    }
}