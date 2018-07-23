
package carro;


public class Middle {
    private final int sideSize2;
    
    public Middle(int size) {
        sideSize2 = size;
    }
    
    public void draw(char symbol) {
        for (int i = 0; i < sideSize2; i++){
            if (i == 0 || i == sideSize2 - 2) {
                printFullLine1(symbol);
                printEmptyLine(symbol);
                printFullLine2();
            }
        } 
    }
    
    private void printFullLine1(char symbol) {
        System.out.print(symbol);
        
    }
    private void printFullLine2() {
        System.out.print("[]\\");
        
    }
    
    private void printEmptyLine(char symbol) {
        System.out.print(" ");
        for (int j = 0; j < sideSize2 - 2; j++) {
            System.out.print(" ");
        }
        System.out.print(" ");
    }
}
