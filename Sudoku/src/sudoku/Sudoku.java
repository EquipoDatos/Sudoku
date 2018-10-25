/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author alberto
 */
public class Sudoku {
    private static final int MAX=9;
    private ConjuntoA<Integer> c1, c2, c3, c4, c5, c6, c7, c8, c9;
    private int [][] matriz;             
        
    public Sudoku(int [][] matriz){
        c1 = new ConjuntoA();
        c2 = new ConjuntoA();
        c3 = new ConjuntoA();
        c4 = new ConjuntoA();
        c5 = new ConjuntoA();
        c6 = new ConjuntoA();
        c7 = new ConjuntoA();
        c8 = new ConjuntoA();
        c9 = new ConjuntoA();  
        this.matriz = matriz;
        for(int j=0; j<3; j++)
            for(int i=0; i<3; i++)
                if(matriz[i][j] != 0)
                    c1.agrega(matriz[i][j]);
        for(int j=3; j<6; j++)
            for(int i=0; i<3; i++)
                if(matriz[i][j] != 0)
                    c2.agrega(matriz[i][j]);
        for(int j=6; j<9; j++)
            for(int i=0; i<3; i++)
                if(matriz[i][j] != 0)
                    c3.agrega(matriz[i][j]);
        for(int j=0; j<3; j++)
            for(int i=3; i<6; i++)
                if(matriz[i][j] != 0)
                    c4.agrega(matriz[i][j]);
        for(int j=3; j<6; j++)
            for(int i=3; i<6; i++)
                if(matriz[i][j] != 0)
                    c5.agrega(matriz[i][j]);
        for(int j=6; j<9; j++)
            for(int i=3; i<6; i++)
                if(matriz[i][j] != 0)
                    c6.agrega(matriz[i][j]);
        for(int j=0; j<3; j++)
            for(int i=6; i<9; i++)
                if(matriz[i][j] != 0)
                    c7.agrega(matriz[i][j]);
        for(int j=3; j<6; j++)
            for(int i=6; i<9; i++)
                if(matriz[i][j] != 0)
                    c8.agrega(matriz[i][j]);
        for(int j=6; j<9; j++)
            for(int i=6; i<9; i++)
                if(matriz[i][j] != 0)
                    c9.agrega(matriz[i][j]);
    }
    
    public boolean renContiene(int ren, int elemento){
        boolean resp = true;
        int i = 0;
        while(i<MAX && matriz[ren][i] != elemento)
            i++;
        if(i == 9)
            resp = false;
        return resp;
    }
    
    public boolean colContiene( int col, int elemento){
        boolean resp = true;
        int i = 0;
        while(i<MAX && matriz[col][i] != elemento)
            i++;
        if(i == 9)
            resp = false;
        return resp;
    }
    
    public  boolean valida(int elem, int ren, int col, ConjuntoA<Integer> conj){
        boolean resp = false;
        if(ren == MAX && col == MAX)
            resp = true;
        else
            if(ren < MAX && col < MAX)
                if(!conj.contiene(elem) && !renContiene(ren, elem) && ! colContiene(col, elem))
                    resp = true;
        return resp;  
    }
    
    public void resuelve(){
        
    }
    
    public static void main(String[] args) {
        int [][] matriz = { {0,0,0,0,0,0,0,0,0},
                            {0,3,0,0,6,0,0,0,0},
                            {0,0,1,0,0,0,0,0,8},
                            {0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,7,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0} }; 
        Sudoku s = new Sudoku (matriz);
        System.out.println(s.c1.toString());
        System.out.println(s.c2.toString());
        System.out.println(s.c3.toString());
        System.out.println(s.c5.toString());
        System.out.println(s.renContiene(0, 3)); //false
        System.out.println(s.renContiene(1, 3)); //true
        System.out.println(s.colContiene(2, 1)); //true
        System.out.println(s.colContiene(3, 1)); //false
        
    }
}
