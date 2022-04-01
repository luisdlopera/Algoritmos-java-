
package matriz2;

import java.util.Scanner;

public class Matriz2 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la filas: ");
        int filas = leer.nextInt();

        System.out.println("Ingrese la columnas: ");
        int colum = leer.nextInt();
        
        int matriz1[][] = new int[filas][colum];
        int matriz2[][] = new int[filas][colum];
        int matriz3[][] = new int[filas][colum];
        
        //LLENADO DE MATRIZ 1
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                matriz1[i][j] = (int) (Math.random()*5);
            }
        }
        //LLENADO DE MATRIZ 2
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                matriz2[i][j] = (int) (Math.random()*5);
            }
        }
        
        //SUMA MATRICES 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        
        System.out.println("LAS MATRICES SON: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(" [ " + matriz1[i][j]+" ]");
            }
            
            if (i == 1) {
                System.out.print(" + ");
            }else{
                 System.out.print("   ");
            }
            
            for (int j = 0; j < colum; j++) {
                System.out.print(" [ " + matriz2[i][j]+" ]");
            }
            
            
             if (i == 1) {
                System.out.print(" = ");
            }else{
                 System.out.print("   ");
            }
             
            for (int j = 0; j < colum; j++) {
                System.out.print(" [ " + matriz3[i][j]+" ]");
            }
        
            System.out.println("");
            
        }
        

        
    }
    
}
