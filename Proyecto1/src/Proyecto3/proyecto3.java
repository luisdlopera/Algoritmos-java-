package Proyecto3;
//Realizar un juego para adivinar un numero. para ello generar un numero aleatorio entre 0 y 100 
//y luego ir pidiendo numero indicando es "mayor" o "menor" segun sea mayor o menor con respecto a N

import java.util.Scanner;

//el proceso termina cuando el usuario acierta y muestra el numero de intentos
public class proyecto3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, aleatorio, contador = 0;

        aleatorio = (int)( Math.random() * 100);

        System.out.println("escribe un numero para empezar a adivinar");
        numero = leer.nextInt();

        do {

            if (numero > aleatorio) {
                System.out.println("escribe un numero MENOR");
                numero = leer.nextInt();
            } else {
                System.out.println("escribe un numero MAYOR");
                numero = leer.nextInt();
            }
            contador++;
        } while (numero != aleatorio);
        
        if (numero == aleatorio) {
           System.out.println("GENIALLLL! HAS CERTADO");  
           
            System.out.println("el numero de intentos que hciste fue de "+ contador);
        }
        
        
       
        
        
    }

}
