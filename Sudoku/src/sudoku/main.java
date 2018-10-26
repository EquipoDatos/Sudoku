/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import static sudoku.Validation.*;
import static sudoku.Solution.*;

/**
 *
 * @author marcopalermo
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    public static void main(String[] args) throws Exception{
        
        int[][] table = {{5,3,0,0,7,0,0,0,0},
                         {6,0,0,1,9,5,0,0,0},
                         {0,9,8,0,0,0,0,6,0},
                         {8,0,0,0,6,0,0,0,3},
                         {4,0,0,8,0,3,0,0,1},
                         {7,0,0,0,2,0,0,0,6},
                         {0,6,0,0,0,0,2,8,0},
                         {0,0,0,4,1,9,0,0,5},
                         {0,0,0,0,8,0,0,7,9}};
        
        int[][] sol =   {{5,3,4,6,7,8,9,1,2},
                         {6,7,2,1,9,5,3,4,8},
                         {1,9,8,3,4,2,5,6,7},
                         {8,5,9,7,6,1,4,2,3},
                         {4,2,6,8,5,3,7,9,1},
                         {7,1,3,9,2,4,8,5,6},
                         {9,6,1,5,3,7,2,8,4},
                         {2,8,7,4,1,9,6,3,5},
                         {3,4,5,2,8,6,1,7,9}};
        
        Sudoku s = new Sudoku(table);
        Sudoku solution = new Sudoku(sol);
        System.out.println(s.toString()+"\n");
        //solve(s);
        //System.out.println(s.toString()+"\n");
        //System.out.println(s.equals(solution)+"\n");
    }
}
