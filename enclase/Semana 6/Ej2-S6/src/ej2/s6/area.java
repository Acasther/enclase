
package ej2.s6;

import java.util.Scanner;


class area {
    Scanner in = new Scanner(System.in);
    public area () {
        System.out.println("Este es el menu del area, digite el numero que desea para realizar la operacion:");
        System.out.println("1- Cuadrado");
        System.out.println("2- Rectangulo");
        System.out.println("3- Circulo");
        int opc = in.nextInt();
        
        if (opc == 1) {
            System.out.println("Ingrese la medida del lado del cuadrado: ");
            int l = in.nextInt();
            int pc = l*l;
            System.out.println("El area del cuadrado es " + pc);
        } else if (opc == 2) {
            System.out.println("Ingrese la medida del largo del rectangulo: ");
            int w = in.nextInt();
            System.out.println("Ingrese la medida del ancho del rectangulo: ");
            int h = in.nextInt();
            int pr = w*h;
            System.out.println("El area del rectangulo es " + pr);
        } else if (opc == 3) {
            System.out.println("Ingrese la medida del radio del circulo: ");
            int r = in.nextInt();
            double po = 2*Math.PI*(r*r);
            System.out.println("El area del cuadrado es " + po);
        }
    }
}
