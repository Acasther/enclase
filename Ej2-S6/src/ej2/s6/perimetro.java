
package ej2.s6;

import java.util.Scanner;


class perimetro {
    Scanner in = new Scanner(System.in);
    public perimetro () {
        System.out.println("Este es el menu del perimetro, digite el numero que desea para realizar la operacion:");
        System.out.println("1- Cuadrado");
        System.out.println("2- Rectangulo");
        System.out.println("3- Circulo");
        int opt = in.nextInt();
        
        if (opt == 1) {
            System.out.println("Ingrese la medida del lado del cuadrado: ");
            int l = in.nextInt();
            int pc = l*4;
            System.out.println("El perimetro del cuadrado es " + pc);
        } else if (opt == 2) {
            System.out.println("Ingrese la medida del largo del rectangulo: ");
            int w = in.nextInt();
            System.out.println("Ingrese la medida del ancho del rectangulo: ");
            int h = in.nextInt();
            int pr = (w*2)+(h*2);
            System.out.println("El perimetro del rectangulo es " + pr);
        } else if (opt == 3) {
            System.out.println("Ingrese la medida del radio del circulo: ");
            int r = in.nextInt();
            double po = (2*Math.PI)*r;
            System.out.println("El perimetro del cuadrado es " + po);
        }
    }
    
}
