package sudoku;

/**
 *<pre>
 * Clase Sudoku:
 * Contiene todos los métodos necesarios para validar y resolver el Sudoku de manera eficiente. 
 * 
 * 
 * @author Marco Palermo
 * @author Alberto Jafif
 * @author Abraham Attie
 * @author Patricio Falcón
 * @author David Ramos
 * 
 * </pre>
 */

public class Sudoku {
    
    private int[][] matriz, original;
    private int [] primeraMod;
    
   /**
    * <pre>
    * Construye un Sudoku con base en los datos ingresados por el usuario. 
    * @param matriz Recibe un arreglo bidimensional de enteros de 9 renglones y 9 columnas.
    * @throws Exception si la matriz no cumple con el reglamento del Sudoku, si no es válido. 
    * La matriz es el Sudoku que el usuario creo en el programa mediante la interfaz gráfica. 
    * @see validacionInicial
    * @see copia
    * @see firstCell
    * </pre>
    */
    public Sudoku(){
        this.matriz = new int[9][9];
        this.original = copia(matriz);
    }
    
    public Sudoku(int[][] matriz) throws Exception{
        setMatriz(matriz);
    }
    
    public void setMatriz(int[][] matriz) throws Exception{
        this.matriz = matriz;
        if (!validacionInicial())
            throw new Exception("la configuracion inicial no es valida!");
        this.original = copia(matriz);
        this.primeraMod = firstCell();
    }
   
    public int[][] getMatriz(){
       return this.matriz;
    }
    
    public int[][] getOriginal(){
        return this.original;
    }
    
   /**
    * Valida inicialmente el Sudoku que el usuario ingresó; revisa que no exista una repeticion iválida de números.
    * No se cerciora que la matriz sea de 9X9, ya que la matriz es recibida por la interfáz gráfica estrictamente de
    * ese tamaño.
    *    @return <ul>
    *    <li> true: si el Sudoku tiene solución y no tiene errores. </li>
    *    <li> false: si el Sudoku contiene algun error. </li>
    *    </ul>
    * @see validaRenglon
    * @see validaColumna
    * @see validaCuadricula
    */
    public boolean validacionInicial(){
        // valida todos los renglones y las columnas 
        boolean resp=true;
        int i=0, j=0;
        while(i<9 && resp==true){
            resp=validaRenglon(i) && validaColumna(i);
            i++;
        }
        // valida todas las cuadriculas
        for (i=0; i<7; i+=3){
            while(j<7 && resp==true){
                    resp=validaCuadricula(i,j);
                    j+=3;
            }
            j=0;
        }
        return resp;
    }
    
    /**
     * Hace una copia de la matriz original formando una matriz nueva.  
     * Se utiliza para saber cuáles elementos son modificables y cuáles son fijos.
     * @param matriz Recibe la matriz original; el Sudoku que el usuario ingreso.
     * @return Una copia identica de la matriz de 9x9 ingresada
     */
    public int[][] copia(int [][] matriz){
        int[][] nuevaMatriz = new int[9][9];
        for(int ren = 0; ren<9; ren++)
            System.arraycopy(matriz[ren], 0, nuevaMatriz[ren], 0, 9);
        return nuevaMatriz;
    }
    
    /**
     * Genera una cadena con los enteros que contiene el Sudoku.
     * El orden va de izquiera a derecha y de arriba a abajo. 
     * @return String con los enteros del Sudoku
     */
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
    /**
     * Revisa que un renglón no contenga elementos repetidos.
     * @param ren Recibe un entero entre 0 y 8 que indica el número de renglón de la matriz(Sudoku).
     * @return <ul>
     *    <li> true: si renglón no contiene elementos repetidos </li>
     *    <li> false: si el renglón contiene elementos repetidos </li>
     *    </ul>
     */
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
    
    /**
     * Revisa que una columna de la matriz no contenga elementos repetidos.
     * @param col Recibe un entero entre 0 y 8 que indica el número de columna de la matriz(Sudoku)
     * @return <ul>
     *    <li> true: si la columna no contiene elementos repetidos. </li>
     *    <li> false: si la columna contiene elementos repetidos. </li>
     *    </ul>
     */
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
    
     /**
      * 
     * Revisa que la matriz no contenga números repetidos en las cuadriculas de 3x3.  
     * Divide la matriz en 9 cuadrantes de 3x3 como establecido por el Sudoku.
     * @param ren El número de renglon de la casilla por validar.
     * @param col  El número de columna de la casilla por validar.
     * @return <ul>
     *    <li> true: si el cuadrante no contiene elementos repetidos. </li>
     *    <li> false: si el cuadrante contiene elementos repetidos.  </li>
     *  </ul>
     * 
     */ 
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
    
     /**
     * Verfica que el número de una casilla no se repita en su renglon, su columna ni su cuadrante.
     * @param ren El número de renglón de la casilla por validar.
     * @param col  El número de columna de la casilla por validar.
     * @return <ul>
     *    <li> true: el número es válido dentro del Sudoku.  </li>
     *    <li> false: el número es inválido dentro del sudoku.  </li>
     *    </ul>
     * @see validaRenglon
     * @see validaColumna
     * @see validaCuadricula
     */ 
    public boolean valida(int ren, int col){
        return validaRenglon(ren) &&
               validaColumna(col) &&
               validaCuadricula(ren, col);
    }
    
    //lamaremos casillas "modificables" a aquellas casillas que el usuario dejo vacías; 
    
    
    /**
     * <pre>
     * Busca la posición de la primera casilla vacía y modificable.
     * La busqueda comienza en la esquina superior izquierda. 
     * @return Arreglo de 2 índices que indica la posición(renglon, columna) de la primera casilla modificable. 
     * </pre>
     */ 
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
    
    /**
     * Busca la posición de la casilla modificable anterior a la casilla recibida como parámetro.
     * @param ren Renglón de la casilla actual.
     * @param col Columna de la casilla actual.
     * @return Arreglo de 2 índices con la posición (renglon, columna) de la casilla inmediatamente anterior 
     * que sea modificable. 
     */  
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
    
    /**
     * Busca el renglón de la casilla modificable anterior a la casilla recibida como parámetro. 
     * @param ren Renglón de la casilla actual
     * @param col Columna de la casilla actual
     * @return int número de renglón de la casilla modificable anterior a la casilla recibida.
     */
    public int prevRen(int ren, int col){
        return prevCell(ren, col)[0];
    }
    
    /**
     * Busca la columna de la casilla modificable anterior a la casilla recibida como parámetro.
     * @param ren Renglón de la casilla actual
     * @param col Columna de la casilla actual
     * @return int número de columna de la casilla modificable anterior a la casilla recibida.
     */
    public int prevCol(int ren, int col){
        return prevCell(ren, col)[1];
    }
    
    /**
     * Determina el número de renglón de la casilla siguiente a la recibida, recorriendo el Sudoku de
     * izquierda a derecha y de arriba hacia abajo.
     * En caso de ser  la última columna baja de renglón. 
     * @param ren Renglón de la casilla
     * @param col Columna de la casilla
     * @return Número del renglón de la casilla siguiente.
     */
    public int nextRen(int ren, int col){
        if (col == 8 && ren != 8)
            return ren+1;
        else
            return ren;
    }
    
    /**
     * Determina el número de columna de la casilla siguiente a la recibida, recorriendo el Sudoku de
     * izquierda a derecha y de arriba hacia abajo.
     * En caso de haber bajado de renglón, regresa 0. 
     * @param ren Renglón de la casilla
     * @param col Columna de la casilla
     * @return Número del columna de la casilla siguiente.
     */
    public int nextCol(int ren, int col){
        if (col == 8 && ren == 8)
            return col;
        else if (col == 8)
            return 0;
        else
            return col+1;
    }
    
    /**
     * <Pre>
     * El método resuelve el Sudoku comenzando por la casilla izquierda superior. 
     * Método público que contiene el método privado recursivo.
     * @return Número de recursiones el programa realizó. 
     * </pre>
     */
    
    public int resuelve(){ 
        return resuelve(0, 0, 0);
    }
    /**
     * <Pre>
     * Método recursivo que resuelve el Sudoku.  
     * Coloca un número en orden ascendente (comenzando por el 1) en la primera casilla modificable y despues lo valida.
     * En caso de ser válido, pasa a la casilla siguiente. Si no, incrementa el número.
     * Si para números del 1-9 la validación es falsa, establece la casilla actual en 0,
     * regresa a la casilla anterior y repite el proceso (incrementándola en 1).  
     * El estado base es cuando se halla validado hasta la última casilla modificable.
     * Avanza por todas las casillas, pero sólo retrocede hacia las modificables.
     * @param ren Número de renglón
     * @param col Número de columna
     * @param numRecursiones Cantidad de recursiones.
     * @return Número de recursiones que se realizaron.
     * </pre>
     */
    private  int resuelve(int ren, int col, int numRecursiones){
        // Estado base donde el problema ha sido resuelto
        if (ren == 8 && col == 8 && matriz[ren][col] != 0 && valida(ren, col))
            return numRecursiones;
        // Si la celda no es modificable
        else if (original[ren][col] != 0)
            return resuelve(nextRen(ren,col), nextCol(ren,col), numRecursiones+1);
        // Si la celda es modificable 
        else {
            // Si la celda llegó al límite y no es válido
            if(matriz[ren][col] == 9){
                matriz[ren][col] = 0;
                return resuelve(prevRen(ren,col), prevCol(ren,col), numRecursiones+1);
            }
            // Si no ha llegado a su límite
            else {
                matriz[ren][col] = matriz[ren][col]+1;
                if (valida(ren, col))
                    return resuelve(nextRen(ren,col), nextCol(ren,col), numRecursiones+1);
                else 
                    while(!valida(ren,col) && matriz[ren][col]<9){
                        matriz[ren][col] = matriz[ren][col] + 1;
                        if(valida(ren, col))
                            return resuelve(nextRen(ren,col), nextCol(ren,col), numRecursiones+1);
                    }
                matriz[ren][col] = 0;
                return resuelve(prevRen(ren,col), prevCol(ren,col), numRecursiones+1);
            }
        }
    }
        
    
    

    public static void main(String[] args) throws Exception{
        int[][] matriz = 
                        {{5,3,0,0,7,0,0,0,0},
                         {6,0,0,1,9,5,0,0,0},
                         {0,9,8,0,0,0,0,6,0},
                         {8,0,0,0,6,0,0,2,3},
                         {4,0,0,8,0,3,0,0,1},
                         {7,0,0,0,2,0,0,0,6},
                         {0,6,0,0,0,0,2,8,0},
                         {0,0,0,4,1,9,0,0,5},
                         {0,0,0,0,8,0,0,7,9}};
        int[][] matriz2 = 
                        {{7,0,0,3,0,9,0,0,1},
                         {0,0,0,0,5,0,0,0,0},
                         {8,2,0,0,6,0,0,0,0},
                         {0,5,9,0,0,0,0,0,3},
                         {6,0,2,0,0,0,1,0,9},
                         {3,0,0,0,0,0,6,5,0},
                         {0,0,0,0,7,0,0,9,4},
                         {0,0,0,0,8,0,0,0,0},
                         {9,0,0,1,0,3,0,0,7}};
        /*El sudoku más difícil del mundo*/
        int[][] matriz3 = 
                        {{8,0,0,0,0,0,0,0,0},
                         {0,0,3,6,0,0,0,0,0},
                         {0,7,0,0,9,0,2,0,0},
                         {0,5,0,0,0,7,0,0,0},
                         {0,0,0,0,4,5,7,0,0},
                         {0,0,0,1,0,0,0,3,0},
                         {0,0,1,0,0,0,0,6,8},
                         {0,0,8,5,0,0,0,1,0},
                         {0,9,0,0,0,0,4,0,0}};
        Sudoku s = new Sudoku(matriz);
        Sudoku s2 = new Sudoku(matriz2);
        Sudoku s3 = new Sudoku(matriz3);
        System.out.println("Sudoku 1");
        System.out.println(s.resuelve());
        System.out.println(s.toString()+"\n");
        System.out.println("Sudoku 2");
        System.out.println(s2.resuelve());
        System.out.println(s2.toString()+"\n");
        System.out.println("Sudoku 3");
        System.out.println(s3.resuelve());
        System.out.println(s3.toString()+"\n");
        
        StringBuilder cadena = new StringBuilder();
        for (int i =0; i<9; i++)
            for (int j=0; j<9; j++)
                cadena.append("casilla").append(i).append(j).append(", ");
        System.out.println(cadena.toString());

        
    }
}