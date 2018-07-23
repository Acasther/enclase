
package carro;


public class bodycar {
    private final int sideSize;
    
    public bodycar(int size) {
        sideSize = size;
    }
    
    public void draw(char symbol) {
        for (int i = 0; i < sideSize; i++){
            if (i == 0 || i == sideSize - 2) {
                printFullLine(symbol);
            } else {
                printEmptyLine(symbol);
            }
        } 
    }
    
    private void printFullLine(char symbol) {
        for (int j = 0; j < sideSize; j++) {
            System.out.print(symbol);
        }
    }
    
    private void printEmptyLine(char symbol) {
        System.out.print(symbol);
        for (int j = 0; j < sideSize - 2; j++) {
            System.out.print(symbol);
        }
        System.out.print(symbol);
    }
}
