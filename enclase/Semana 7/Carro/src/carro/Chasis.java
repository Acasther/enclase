
package carro;


public class Chasis {
    private final int sideSize2;
    
    public Chasis(int size) {
        sideSize2 = size;
    }
    
    public void draw() {
        for (int i = 0; i < sideSize2; i++){
            if (i == 0 || i == sideSize2 - 2) {
                printFullLine1();
                printEmptyLine();
                printFullLine2();
            }
        } 
    }
    
    private void printFullLine1() {
        System.out.print("-o");
        
    }
    private void printFullLine2() {
        System.out.print("o-'");
        
    }
    
    private void printEmptyLine() {
        System.out.print("-");
        for (int j = 0; j < sideSize2 - 2; j++) {
            System.out.print("-");
        }
        System.out.print("-");
    }
}
