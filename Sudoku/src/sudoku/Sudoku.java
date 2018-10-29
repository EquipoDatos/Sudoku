
package sudoku;

/**
 *
 * @author Marco Palermo
 * @author Alberto Jafif
 * @author Abraham Attie
 * @author Patricio Falcón
 * @author David Ramos
 */

public class Sudoku {
    
    private int[][] matriz, original;
    private int [] primeraMod;
    
    public Sudoku(int[][] matriz){
        this.matriz = matriz;
        this.original = copia(matriz);
        this.primeraMod = firstCell();
    }
    
    public void setElemento(int ren, int col, int newElement){
        matriz[ren][col] = newElement;
    }
    
    public int[][] copia(int [][] matriz){
        int[][] nuevaMatriz = new int[9][9];
        for(int ren = 0; ren<9; ren++)
            System.arraycopy(matriz[ren], 0, nuevaMatriz[ren], 0, 9);
        return nuevaMatriz;
    }
    
    @Override 
    public String toString(){
        StringBuilder cadena = new StringBuilder();
        for (int ren = 0; ren<9; ren++){
            if (ren != 0)
                cadena.append("\n");
            for(int col = 0; col<9; col++){
                cadena.append(matriz[ren][col]).append(" ");
                if(col%3 == 2 && col != 8)
                    cadena.append("| ");
            }
            if(ren%3 == 2 && ren != 8)
                cadena.append("\n---------------------");
        }
        return cadena.toString();
    }
    
    public boolean validaRenglon(int ren){
        boolean resp = true;
        int col = 0;
        ConjuntoA conjunto = new ConjuntoA();
        while(col<9 && resp == true){
            if ( matriz[ren][col] !=0 && conjunto.contiene(matriz[ren][col]))
                resp = false;
            else
                conjunto.agrega(matriz[ren][col]);
            col++;
            }
        return resp;
    }
    
    public boolean validaColumna(int col){
        boolean resp = true; 
        int ren = 0;
        ConjuntoA conjunto = new ConjuntoA();
        while(ren<9 && resp == true){
            if (matriz[ren][col] != 0 && conjunto.contiene(matriz[ren][col]))
                resp = false;
            conjunto.agrega(matriz[ren][col]);
            ren++;
            }
        return resp;
    }
    
    public boolean validaCuadricula(int ren, int col){
        boolean resp = true; 
        int i,maxI, j, maxJ;
        maxI = ren-ren%3+3;
        maxJ = col-col%3+3;
        ConjuntoA conjunto = new ConjuntoA();
        for (i = ren-ren%3; i<maxI; i++)
            for(j = col-col%3; j<maxJ; j++){
                if (matriz[i][j] != 0 && conjunto.contiene(matriz[i][j]))
                    resp = false;
                conjunto.agrega(matriz[i][j]);
                }
        return resp;
        }
    
    public boolean valida(int ren, int col){
        return validaRenglon(ren) &&
               validaColumna(col) &&
               validaCuadricula(ren, col);
    }
    
    public int[] firstCell(){
        boolean resp = false;
        int[] res = new int[2];
        int j;
        int i = 0;
        while(i<9 && resp == false){
            j = 0;
            while(j<9 && resp == false){
                if (original[i][j] == 0 && resp == false){
                    res[0] = i;
                    res[1] = j;
                    resp = true;
                }
                j++;
            }
            i++;
        }
        return res;
    }
    
    public int[] prevCell(int ren, int col){
        boolean resp = false;
        int[] res = new int[2];
        int a = -1, b =-1, j;
        int i = 0;
        while(i <= 8 && !resp){
            j = 0;
            while(j <= 8 && !resp){
                if (i == ren && j == col)
                        resp=true;
                if (original[i][j] == 0 && !(i == ren && j == col)){
                    a = i;
                    b = j;
                }
                j++;
            }
            i++;
        }
        res[0] = a; res[1] = b;
        return res;
    }
    
    public int prevRen(int ren, int col){
        return prevCell(ren, col)[0];
    }
    
    public int prevCol(int ren, int col){
        return prevCell(ren, col)[1];
    }
    
    public int nextRen(int ren, int col){
        if (col == 8 && ren != 8)
            return ren+1;
        else
            return ren;
    }
    public int nextCol(int ren, int col){
        if (col == 8 && ren == 8)
            return col;
        else if (col == 8)
            return 0;
        else
            return col+1;
    }
    
    public int resuelve(){ 
        return resuelve(0, 0, 0);
    }
    /*Regresa el número de recursiones que realizó
    y -1 si no se puede resolver el sudoku.
    También podemos cambiarlo simplemente a boolean.
    */
    private  int resuelve(int ren, int col, int numRecursiones){
        // Estado base donde no se puede resolver el problema
        if(ren == primeraMod[0] && col == primeraMod[1]
           && matriz[ren][col] == 9 && !valida(ren,col))
            return -1;
        // Estado base donde el problema ha sido resuelto
        else if (ren == 8 && col == 8 && matriz[ren][col] != 0 && valida(ren, col))
            return numRecursiones;
        // Si la celda no es modificable
        else if (original[ren][col] != 0)
            return resuelve(nextRen(ren,col), nextCol(ren,col), numRecursiones+1);
        // Si la celda es modificable
        else {
            // Si la celda llegó al límite y no es válido
            if(matriz[ren][col] == 9){
                setElemento(ren, col, 0);
                return resuelve(prevRen(ren,col), prevCol(ren,col), numRecursiones+1);
            }
            // Si no ha llegado a su límite
            else {
                setElemento(ren, col, matriz[ren][col]+1);
                if (valida(ren, col))
                    return resuelve(nextRen(ren,col), nextCol(ren,col), numRecursiones+1);
                else 
                    while(!valida(ren,col) && matriz[ren][col]<9){
                        matriz[ren][col] = matriz[ren][col] + 1;
                        if(valida(ren, col))
                            return resuelve(nextRen(ren,col), nextCol(ren,col), numRecursiones+1);
                    }
                setElemento(ren, col, 0);
                return resuelve(prevRen(ren,col), prevCol(ren,col), numRecursiones+1);
            }
        }
    }
        
    
    

    public static void main(String[] args) throws Exception{
        /*NO sirve, falta revisar por qué*/
        int[][] matriz = 
                        {{5,3,0,0,7,0,0,0,0},
                         {6,0,0,1,9,5,0,0,0},
                         {0,9,8,0,0,0,0,6,0},
                         {8,0,0,0,6,0,0,0,3},
                         {4,0,0,8,0,3,0,0,1},
                         {7,0,0,0,2,0,0,0,6},
                         {0,6,0,0,0,0,2,8,0},
                         {0,0,0,4,1,9,0,0,5},
                         {0,0,0,0,8,0,0,7,9}};
        //Sí sirve
        int[][] matriz2 = 
                        {{1,0,0,0,5,0,7,0,2},
                         {0,0,0,6,0,3,0,0,8},
                         {0,7,6,0,1,0,3,0,0},
                         {0,4,0,3,0,7,0,5,0},
                         {8,1,0,0,6,0,4,0,7},
                         {0,9,0,0,0,5,0,0,0},
                         {2,6,0,0,0,0,8,0,5},
                         {9,0,0,8,0,1,0,0,0},
                         {0,0,3,0,9,0,0,2,0}};
        //Sí sirve
        int[][] matriz3 = 
                        {{0,0,0,0,0,1,2,3,0},
                         {1,2,3,0,0,8,0,4,0},
                         {8,0,4,0,0,7,6,5,0},
                         {7,6,5,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,1,2,3},
                         {0,1,2,3,0,0,8,0,4},
                         {0,8,0,4,0,0,7,6,5},
                         {0,7,6,5,0,0,0,0,0}};
        //NO sirve
        int[][] matriz4 = 
                        {{7,0,0,3,0,9,0,0,1},
                         {0,0,0,0,5,0,0,0,0},
                         {8,2,0,0,6,0,0,0,0},
                         {0,5,9,0,0,0,0,0,3},
                         {6,0,2,0,0,0,1,0,9},
                         {3,0,0,0,0,0,6,5,0},
                         {0,0,0,0,7,0,0,9,4},
                         {0,0,0,0,8,0,0,0,0},
                         {9,0,0,1,0,3,0,0,7}};
        
        Sudoku s = new Sudoku(matriz);
        Sudoku s2 = new Sudoku(matriz2);
        Sudoku s3 = new Sudoku(matriz3);
        Sudoku s4 = new Sudoku(matriz4);
        s.resuelve();
        System.out.println("Sudoku 1");
        System.out.println(s.toString());
        System.out.println(s2.resuelve());
        System.out.println("Sudoku 2");
        System.out.println(s2.toString()+"\n");
        System.out.println(s3.resuelve());
        System.out.println("Sudoku 3");
        System.out.println(s3.toString()+"\n");
        System.out.println(s4.resuelve());
        System.out.println("Sudoku 4");
        System.out.println(s4.toString()+"\n");
        
    }
    
    
}
