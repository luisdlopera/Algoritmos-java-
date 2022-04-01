package Proyecto2;
// leer  numeros hasta que se introduzca un cero para cada uno indicar si es par o impar

import java.util.Scanner;

public class proyecto2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean sw = true;
        while (sw) {

            System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
            if (numero == 0) {
                System.out.println("el numero que introduciste es cero por lo tanto se finaliza el programa");
                sw = false;
            } else {
                if (numero % 2 == 0) {
                    System.out.println("el numero que introduciste es: " + numero + " y es par");
                } else {
                    System.out.println("el numero que introduciste es: " + numero + " y es impar");
                }

            }
        }

    }

}
