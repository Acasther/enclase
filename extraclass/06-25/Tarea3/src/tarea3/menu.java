
package tarea3;

import java.util.Scanner;


class menu {
Scanner scanner = new Scanner(System.in);
    public menu () {
        System.out.println("Digite la tecla deseada para realizar la accion: ");
        System.out.println("1. Calcular area");
        System.out.println("2. Calcular perimetro");
        System.out.println("3. Salir");
        int option = scanner.nextInt();
        
        if (option == 1) {
            area area = new area();
        }
        if (option == 2) {
            perimeter perimeter = new perimeter();
        }
        if (option == 3) {
            System.out.println("Ha salido del programa");
        }
    }
    
}
