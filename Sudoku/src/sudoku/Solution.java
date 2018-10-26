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
public class Solution {
    
    public static int[] firstCell(Sudoku fixed) throws Exception{
        boolean resp=false;
        int[] res = new int[2];
        int j;
        int i=0;
        while(i<9 && resp == false){
            j=0;
            while(j<9 && resp == false){
                if (fixed.getMatrix()[i][j]==0 && resp==false){
                    res[0]=i;
                    res[1]=j;
                    resp = true;
                }
                j++;
            }
            i++;
        }
        return res;
    }

    public static int[] prevCell(Sudoku fixed, int row, int col) throws Exception{
        boolean resp=false;
        int[] res = new int[2];
        int a=-1,b=-1,j;
        int i=0;
        while(i<=8 && !resp){
            j=0;
            while(j<=8 && !resp){
                if (i==row && j==col)
                        resp=true;
                if (fixed.getMatrix()[i][j]==0 && !(i==row && j==col)){
                    a=i;
                    b=j;
                }
                j++;
            }
            i++;
        }
        res[0]=a; res[1]=b;
        return res;
    }
    
    public static int prevRow(Sudoku fixed, int row, int col) throws Exception{
        int[] res=prevCell(fixed, row, col);
        return res[0];
    }
    
    public static int prevCol(Sudoku fixed, int row, int col) throws Exception{
        int[] res=prevCell(fixed, row, col);
        return res[1];
    }
    
    public static int[] nextCell(Sudoku fixed, int row, int col) throws Exception{
        boolean resp=false;
        int[] res = new int[2];
        int a=-1,b=-1,j;
        int i=0;
        while(i<=8 && !resp){
            j=0;
            while(j<=8 && !resp){
                if (fixed.getMatrix()[i][j]==0 && (i>row || (i==row && j>col))){
                    a=i;
                    b=j;
                    resp=true;
                }
                j++;
            }
            i++;
        }
        res[0]=a; res[1]=b;
        return res;
    }
    
    public static int nextRow(Sudoku fixed, int row, int col) throws Exception{
        return nextCell(fixed, row, col)[0];
    }
    
    public static int nextCol(Sudoku fixed, int row, int col) throws Exception{
        return nextCell(fixed, row, col)[1];
    }
    
    public static boolean solve(Sudoku s) throws Exception{
        return solve(s, s.copy(), 0, 0);
    }
        
    private static boolean solve(Sudoku s, Sudoku fixed, int row, int col) throws Exception{
        
        System.out.println(s.toString()+"\n\n\n");
        // if the first Modifiable Cell can't be further increased (==9) 
        if(row==firstCell(fixed)[0] && col==firstCell(fixed)[1]
                && s.getMatrix()[row][col]==9 && !valida(s,row,col))
            return false;
        // if the last Modifiable Cell is valid the problem is solved
        else if (row==8 && col==8 && valida(s, row, col))
            return true;
        // if the current Cell is not Modifiable
        else if (fixed.getMatrix()[row][col]==1)
            return solve(s, fixed, nextRow(s,row,col), nextCol(s,row,col));
        // if the current Cell is Modifiable
        else {
            // increment the value of the cell
            if(s.getMatrix()[row][col]==9){
                s.setElement(row, col, 0);
                s.setElement(prevRow(fixed, row, col), prevCol(fixed, row, col), 0);
                return solve(s, fixed, prevRow(fixed, row, col), prevCol(fixed, row, col));
            }
            else{
                s.setElement(row, col, s.getMatrix()[row][col]+1);
                if (valida(s, row, col))
                    return solve(s, fixed, nextRow(s,row,col), nextCol(s,row,col));
                else
                    return solve(s, fixed, row, col);
            }
        }
    }
}
