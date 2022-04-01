
package proyecto4;
//pedir numero hasta que se introduzca uno negativo y calcular la media
//La media se calcula sumando todos los valores y dividiendo la suma entre el número total de valores.
import java.util.Scanner;

public class proyecto4 {
    
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        int suma =0, contador=0;
        boolean sw = true;
        while (sw) {
            System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
             
            if (numero >= 0) {
                sw=true;
            }else{
                sw=false;
            }
            
            suma = suma +numero;
            contador++;
        }
        
        System.out.println("la media es "+ (suma/contador));
    
    
    
    
    
    }
    
    
    
    
}
