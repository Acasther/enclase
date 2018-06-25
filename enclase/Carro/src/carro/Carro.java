
package carro;

import java.util.Scanner;


public class Carro {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la medida del largo del carro");
        int a = sc.nextInt();
        int n = 3;
        bodycar body = new bodycar(n - 1);
        Middle middle = new Middle(n - (n - 1));
        Chasis chasis = new Chasis(n - (n - 1));
        
        body.draw('_');
        System.out.println();
        
        middle.draw('|');
        System.out.println();
        
        chasis.draw();
        System.out.println();
    }
    
}
