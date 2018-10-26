/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author marcopalermo
 */
public class Validation {
    
    public static boolean validaRenglon(Sudoku sudoku, int row){
        boolean resp = true; 
        int col=0;
        ConjuntoA conjunto = new ConjuntoA();
        while(col<9 && resp==true){
            if (sudoku.getMatrix()[row][col]!=0 && conjunto.contiene(sudoku.getMatrix()[row][col]))
                resp = false;
            conjunto.agrega(sudoku.getMatrix()[row][col]);
            col++;
            }
        return resp;
        }
    
    public static boolean validaColumna(Sudoku sudoku, int col){
        boolean resp = true; 
        int row=0;
        ConjuntoA conjunto = new ConjuntoA();
        while(row<9 && resp==true){
            if (sudoku.getMatrix()[row][col]!=0 && conjunto.contiene(sudoku.getMatrix()[row][col]))
                resp = false;
            conjunto.agrega(sudoku.getMatrix()[row][col]);
            row++;
            }
        return resp;
        }

    public static boolean validaCuadricula(Sudoku sudoku, int row, int col) throws Exception{
        boolean resp = true; 
        int i, maxI = row-row%3+3, j, maxJ = col-col%3+3;
        ConjuntoA conjunto = new ConjuntoA();
        for (i=row-row%3; i<maxI; i++)
            for(j=col-col%3; j<maxJ; j++){
                if (sudoku.getMatrix()[i][j]!=0 && conjunto.contiene(sudoku.getMatrix()[i][j]))
                    resp = false;
                conjunto.agrega(sudoku.getMatrix()[i][j]);
                }
        return resp;
        }
    
    public static boolean valida(Sudoku sudoku, int row, int col) throws Exception{
        return validaRenglon(sudoku, row) &&
                validaColumna(sudoku, col) &&
                validaCuadricula(sudoku, row, col);
    }
    
}
