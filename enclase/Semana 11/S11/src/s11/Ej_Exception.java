
package s11;


public class Ej_Exception {
    
    private static double divide(int n1, int n2) {
        if (n1 == 0) {
            throw new NumberFormatException("0  is not expected");
        }
        
        if (n1 == 25){
            System.out.println();
            
        }
        return n1 / n2;
    }
    
    public static void main(String[] args) {
        try {
            double res = divide(25, 0);
            System.out.println("Resultado: " + res);
        } catch (NumberFormatException ex) {
            System.out.println("Ocurrio un error!");
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Excepcion aritmetica");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Esto siempre se ejecuta!!!");
        }
    }
    
}
