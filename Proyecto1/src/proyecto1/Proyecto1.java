package proyecto1;

// leer un numero y mostrar su cuadrado, repetir su proceso hasta que se introduzca un numero negativo
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Proyecto1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        

        boolean sw = true;
        while (sw) {
            System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
            
            int cuadrado = (int)Math.pow(numero,2);
            if (numero > 0) {

                System.out.println("el cuadrado del numero que ingreso es  " + cuadrado);

            }else{
                System.out.println("lo siento has intrioducido un numero negativo, el programa ah finalizado");
                sw = false;
            }

        }
    }

}
