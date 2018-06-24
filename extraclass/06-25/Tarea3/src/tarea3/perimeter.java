
package tarea3;

import java.util.Scanner;


class perimeter {
Scanner in = new Scanner(System.in);
public perimeter () {
    System.out.println("Este es el menu del perimetro, digite el numero que desea para realizar la operacion:");
    System.out.println("1- Cuadrado");
    System.out.println("2- Rectangulo");
    System.out.println("3- Circulo");
    System.out.println("4- Triangulo equilatero");
    System.out.println("5- Triangulo isoceles");
    System.out.println("6- Pentagono regular");
    int option2 = in.nextInt();
    
    if (option2 == 1) {
        System.out.println("Ingrese la medida del lado del cuadrado: ");
        int side = in.nextInt();
        int persquare = side*4;
        System.out.println("El perimetro del cuadrado es " + persquare);
    } else if (option2 == 2) {
        System.out.println("Ingrese la medida del largo del rectangulo: ");
        int width = in.nextInt();
        System.out.println("Ingrese la medida del ancho del rectangulo: ");
        int height = in.nextInt();
        int perrec = (width*2)+(height*2);
        System.out.println("El perimetro del rectangulo es " + perrec);
    } else if (option2 == 3) {
        System.out.println("Ingrese la medida del radio del circulo: ");
        int radius = in.nextInt();
        double percircle = (2*Math.PI)*radius;
        System.out.println("El perimetro del circulo es " + percircle);
    } else if (option2 == 4) {
        System.out.println("Ingrese la medida de un lado del triangulo equilatero: ");
        int sides = in.nextInt();
        int pertriangleeq = sides*3;
        System.out.println("El perimetro del triangulo equilatero es " + pertriangleeq);
    } else if (option2 == 5) {
        System.out.println("Ingrese la medida de uno de los lados repetidos: ");
        int side2 = in.nextInt();
        System.out.println("Ingrese la medida del lado corto o la base: ");
        int sideshort = in.nextInt();
        int pertriangleiso = ((side2*2)+sideshort);
        System.out.println("El perimetro del triangulo isoceles es " + pertriangleiso);
    } else if (option2 == 4) {
        System.out.println("Ingrese la medida de un lado del pentagono: ");
        int sidepentagon = in.nextInt();
        int perpentagon = sidepentagon*5;
        System.out.println("El perimetro del pentagono es " + perpentagon);
}
}
}