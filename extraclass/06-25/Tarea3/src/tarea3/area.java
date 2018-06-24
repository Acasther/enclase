
package tarea3;

import java.util.Scanner;


class area {
Scanner in = new Scanner(System.in);
public area () {
    System.out.println("Este es el menu del area, digite el numero que desea para realizar la operacion:");
    System.out.println("1- Cuadrado");
    System.out.println("2- Rectangulo");
    System.out.println("3- Circulo");
    System.out.println("4- Triangulo equilatero");
    System.out.println("5- Triangulo isoceles");
    System.out.println("6- Pentagono regular");
    int option2 = in.nextInt();
    
    if (option2 == 1) {
        System.out.println("Ingrese la medida del lado del cuadrado: ");
        int side1 = in.nextInt();
        int areasquare = side1*side1;
        System.out.println("El area del cuadrado es " + areasquare);
    } else if (option2 == 2) {
        System.out.println("Ingrese la medida del largo del rectangulo: ");
        int width1 = in.nextInt();
        System.out.println("Ingrese la medida del ancho del rectangulo: ");
        int height1 = in.nextInt();
        int arearec = width1*height1;
        System.out.println("El perimetro del rectangulo es " + arearec);
    } else if (option2 == 3) {
        System.out.println("Ingrese la medida del radio del circulo: ");
        int radius = in.nextInt();
        double areacircle = Math.PI*(radius*radius);
        System.out.println("El perimetro del circulo es " + areacircle);
    } else if (option2 == 4) {
        System.out.println("Ingrese la medida de la altura del triangulo equilatero: ");
        int height2 = in.nextInt();
        System.out.println("Ingrese la medida del ancho del triangulo equilatero: ");
        int width2 = in.nextInt();
        int areatriangleeq = (height2*(width2*width2));
        System.out.println("El area del triangulo equilatero es " + areatriangleeq);
    } else if (option2 == 5) {
        System.out.println("Ingrese la medida de uno de la altura: ");
        int height3 = in.nextInt();
        System.out.println("Ingrese la medida de la base: ");
        int base = in.nextInt();
        double areatriangleiso = ((base*height3)/2);
        System.out.println("El area del triangulo isoceles es " + areatriangleiso);
    } else if (option2 == 4) {
        System.out.println("Ingrese la medida de un lado del pentagono: ");
        int sidepentagon = in.nextInt();
        System.out.println("Ingrese la medida de la apotema: ");
        int ap = in.nextInt();
        int areapentagon = (5*sidepentagon*ap)/2;
        System.out.println("El area del pentagono es " + areapentagon);
}
}
}
