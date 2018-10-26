/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;
import static sudoku.Validation.*;

/**
 *
 * @author marcopalermo
 */
public class Sudoku {
    
    private int[][] matrix;
    
    public Sudoku(){
        this.matrix = new int[9][9];
    }
    
    public Sudoku(int[][] matrix) throws Exception {
        setMatrix(matrix, false);
    }
    
    public Sudoku(int[][] matrix, boolean override) throws Exception{
        setMatrix(matrix, override);
    }
    
    public int[][] getMatrix(){
        return matrix;
    }
    
    public void setElement(int row, int col, int newElement){
        matrix[row][col]=newElement;
    }
    
    public void setMatrix(int[][] matrix, boolean override) throws Exception{
        this.matrix = matrix;
        for (int row=0; row<9; row++){
            if (!(matrix.length==9 && matrix[row].length==9))
                throw new Exception("WRONG MATRIX SIZE!!");
            if (!override)
                for (int col=0; col<9; col++)
                    if (!valida(this,row,col))
                        throw new Exception("INVALID NUMBERS!!");
        }
    }
    
    public Sudoku copy() throws Exception{
        int[][] newmatrix = new int[9][9];
        for(int row=0;row<9;row++)
            System.arraycopy(matrix[row], 0, newmatrix[row], 0, 9);
        Sudoku copy = new Sudoku(newmatrix, true);
        return copy;
    }
    
    @Override 
    public String toString(){
        StringBuilder cadena = new StringBuilder();
        for (int row=0; row<9; row++){
            if (row!=0)
                cadena.append("\n");
            for (int col=0; col<9; col++){
                cadena.append(matrix[row][col]).append(" ");
                if (col%3==2 && col!=8)
                    cadena.append("| ");
            }
            if (row%3==2 && row!=8)
                cadena.append("\n---------------------");
        }
        return cadena.toString();
    }
}
