
package s5;

import java.util.Random;
import java.util.Scanner;


public class S5 {

    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int number;
        
        number = 0+random.nextInt(100);
        int guess;
        boolean win = false;
        
        
        while(win == false){
            System.out.println("Adivine el numero entre 0 y 100: ");
            guess = scanner.nextInt();
            if (number < guess){
                System.out.println("El numero es menor a " + guess);
            }    
            if (number > guess) {
                System.out.println("El numero es mayor a " + guess);
            }    
            if (guess == number){
                win = true;
            }
        }
    
}
}