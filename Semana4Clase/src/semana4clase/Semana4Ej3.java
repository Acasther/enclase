
package semana4clase;

import java.util.Scanner;


public class Semana4Ej3 {

    public static void imprimirLineaCompleta(int lado) {
        System.out.print("*");
        for (int i = 0; i < lado - 2; i++) {
            System.out.print("*");
        }
        System.out.print("*");
    }

    public static void imprimirLineaVacia(int lado) {
        System.out.print("*");
        for (int j = 0; j < lado - 2; j++) {
            System.out.print(" ");
        }
        System.out.print("*"); 
    } 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                imprimirLineaCompleta(size);
            } else {
                imprimirLineaVacia(size);
            }
            System.out.print("\n");
        }
    }
    
}
    
    

