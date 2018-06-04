
package semana4clase;

import java.util.Scanner;


public class Semana4Clase {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite un numero para saber si es primo:");
       int number = scanner.nextInt();
       boolean isPrime = true;
       
       for (int i = 2; i < number; i++) {
           if (number % i == 0) {
               isPrime = false;
               break;
           }
        }
    
        System.out.println("El numero " + (isPrime ? "si" : "no") + " es primo");
}

    }
    

