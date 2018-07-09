
package s9;


public class S9 {

    
    public static void main(String[] args) {
        //int[][] matriz = new int[5][5];
        //int contador = 1;
        int[][] matriz = {
            ( 1, 2, 3, 4, 5 ),
            ( 1, 2, 3, 4, 5 ),
            ( 1, 2, 3, 4, 5 ),
            ( 1, 2, 3, 4, 5 ),
            ( 1, 2, 3, 4, 5 )
        };
        
        int nDiagonal = 0;
        boolean hasAssignedNDiagonal = false;
        boolean diagonalOk = true;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    if (!hasAssignedNDiagonal) {
                        hasAssignedNDiagonal = true;
                        nDiagonal = matriz[i][j];
                    } else if (nDiagonal != matriz[i][j]) {
                        diagonalOk = false;
                    }
                }
                //matriz[i][j] = contador++;
                //System.out.println(matriz[i][j] + " ");
            }
            System.out.println(matriz);
            //System.out.println();
        }
        //System.out.println("");
        
        }
    }
    
