/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Color;

/**
 *
 * @author marcopalermo
 */
public class GUI2 extends javax.swing.JFrame {

    /**
     * Creates new form GUI2
     */
    public GUI2() {
        initComponents();
        casillaResultado.setEditable(false);
    }
    
    
    public int[][] matriz = new int[9][9];
    Sudoku sudoku = new Sudoku();
    boolean invalidInput = false;
    
    
    public void valida(int input) throws Exception{
        boolean resp = false;
        int[] set = {1,2,3,4,5,6,7,8,9};
        for(int element : set)
            if (element == input)
                resp=true;
        if (resp!=true)
            throw new Exception();
    }
    
    public void getValues(){
        
        try{matriz[0][0]=Integer.valueOf(casilla1l1.getText());} catch(Exception e){if(!casilla1l1.getText().equals("")) invalidInput=true; else casilla1l1.setForeground(Color.BLUE); }
        try{matriz[0][1]=Integer.valueOf(casilla1l2.getText());} catch(Exception e){if(!casilla1l2.getText().equals("")) invalidInput=true; else casilla1l2.setForeground(Color.BLUE);}
        try{matriz[0][2]=Integer.valueOf(casilla1l3.getText());} catch(Exception e){if(!casilla1l3.getText().equals("")) invalidInput=true; else casilla1l3.setForeground(Color.BLUE);}
        try{matriz[0][3]=Integer.valueOf(casilla1l4.getText());} catch(Exception e){if(!casilla1l4.getText().equals("")) invalidInput=true; else casilla1l4.setForeground(Color.BLUE);}
        try{matriz[0][4]=Integer.valueOf(casilla1l5.getText());} catch(Exception e){if(!casilla1l5.getText().equals("")) invalidInput=true; else casilla1l5.setForeground(Color.BLUE);}
        try{matriz[0][5]=Integer.valueOf(casilla1l6.getText());} catch(Exception e){if(!casilla1l6.getText().equals("")) invalidInput=true; else casilla1l6.setForeground(Color.BLUE);}
        try{matriz[0][6]=Integer.valueOf(casilla1l7.getText());} catch(Exception e){if(!casilla1l7.getText().equals("")) invalidInput=true; else casilla1l7.setForeground(Color.BLUE);}
        try{matriz[0][7]=Integer.valueOf(casilla1l8.getText());} catch(Exception e){if(!casilla1l8.getText().equals("")) invalidInput=true; else casilla1l8.setForeground(Color.BLUE);}
        try{matriz[0][8]=Integer.valueOf(casilla1l9.getText());} catch(Exception e){if(!casilla1l9.getText().equals("")) invalidInput=true; else casilla1l9.setForeground(Color.BLUE);}
        try{matriz[1][0]=Integer.valueOf(casilla2l1.getText());} catch(Exception e){if(!casilla2l1.getText().equals("")) invalidInput=true; else casilla2l1.setForeground(Color.BLUE);}
        try{matriz[1][1]=Integer.valueOf(casilla2l2.getText());} catch(Exception e){if(!casilla2l2.getText().equals("")) invalidInput=true; else casilla2l2.setForeground(Color.BLUE);}
        try{matriz[1][2]=Integer.valueOf(casilla2l3.getText());} catch(Exception e){if(!casilla2l3.getText().equals("")) invalidInput=true; else casilla2l3.setForeground(Color.BLUE);}
        try{matriz[1][3]=Integer.valueOf(casilla2l4.getText());} catch(Exception e){if(!casilla2l4.getText().equals("")) invalidInput=true; else casilla2l4.setForeground(Color.BLUE);}
        try{matriz[1][4]=Integer.valueOf(casilla2l5.getText());} catch(Exception e){if(!casilla2l5.getText().equals("")) invalidInput=true; else casilla2l5.setForeground(Color.BLUE);}
        try{matriz[1][5]=Integer.valueOf(casilla2l6.getText());} catch(Exception e){if(!casilla2l6.getText().equals("")) invalidInput=true; else casilla2l6.setForeground(Color.BLUE);}
        try{matriz[1][6]=Integer.valueOf(casilla2l7.getText());} catch(Exception e){if(!casilla2l7.getText().equals("")) invalidInput=true; else casilla2l7.setForeground(Color.BLUE);}
        try{matriz[1][7]=Integer.valueOf(casilla2l8.getText());} catch(Exception e){if(!casilla2l8.getText().equals("")) invalidInput=true; else casilla2l8.setForeground(Color.BLUE);}
        try{matriz[1][8]=Integer.valueOf(casilla2l9.getText());} catch(Exception e){if(!casilla2l9.getText().equals("")) invalidInput=true; else casilla2l9.setForeground(Color.BLUE);}
        try{matriz[2][0]=Integer.valueOf(casilla3l1.getText());} catch(Exception e){if(!casilla3l1.getText().equals("")) invalidInput=true; else casilla3l1.setForeground(Color.BLUE);}
        try{matriz[2][1]=Integer.valueOf(casilla3l2.getText());} catch(Exception e){if(!casilla3l2.getText().equals("")) invalidInput=true; else casilla3l2.setForeground(Color.BLUE);}
        try{matriz[2][2]=Integer.valueOf(casilla3l3.getText());} catch(Exception e){if(!casilla3l3.getText().equals("")) invalidInput=true; else casilla3l3.setForeground(Color.BLUE);}
        try{matriz[2][3]=Integer.valueOf(casilla3l4.getText());} catch(Exception e){if(!casilla3l4.getText().equals("")) invalidInput=true; else casilla3l4.setForeground(Color.BLUE);}
        try{matriz[2][4]=Integer.valueOf(casilla3l5.getText());} catch(Exception e){if(!casilla3l5.getText().equals("")) invalidInput=true; else casilla3l5.setForeground(Color.BLUE);}
        try{matriz[2][5]=Integer.valueOf(casilla3l6.getText());} catch(Exception e){if(!casilla3l6.getText().equals("")) invalidInput=true; else casilla3l6.setForeground(Color.BLUE);}
        try{matriz[2][6]=Integer.valueOf(casilla3l7.getText());} catch(Exception e){if(!casilla3l7.getText().equals("")) invalidInput=true; else casilla3l7.setForeground(Color.BLUE);}
        try{matriz[2][7]=Integer.valueOf(casilla3l8.getText());} catch(Exception e){if(!casilla3l8.getText().equals("")) invalidInput=true; else casilla3l8.setForeground(Color.BLUE);}
        try{matriz[2][8]=Integer.valueOf(casilla3l9.getText());} catch(Exception e){if(!casilla3l9.getText().equals("")) invalidInput=true; else casilla3l9.setForeground(Color.BLUE);}
        try{matriz[3][0]=Integer.valueOf(casilla4l1.getText());} catch(Exception e){if(!casilla4l1.getText().equals("")) invalidInput=true; else casilla4l1.setForeground(Color.BLUE);}
        try{matriz[3][1]=Integer.valueOf(casilla4l2.getText());} catch(Exception e){if(!casilla4l2.getText().equals("")) invalidInput=true; else casilla4l2.setForeground(Color.BLUE);}
        try{matriz[3][2]=Integer.valueOf(casilla4l3.getText());} catch(Exception e){if(!casilla4l3.getText().equals("")) invalidInput=true; else casilla4l3.setForeground(Color.BLUE);}
        try{matriz[3][3]=Integer.valueOf(casilla4l4.getText());} catch(Exception e){if(!casilla4l4.getText().equals("")) invalidInput=true; else casilla4l4.setForeground(Color.BLUE);}
        try{matriz[3][4]=Integer.valueOf(casilla4l5.getText());} catch(Exception e){if(!casilla4l5.getText().equals("")) invalidInput=true; else casilla4l5.setForeground(Color.BLUE);}
        try{matriz[3][5]=Integer.valueOf(casilla4l6.getText());} catch(Exception e){if(!casilla4l6.getText().equals("")) invalidInput=true; else casilla4l6.setForeground(Color.BLUE);}
        try{matriz[3][6]=Integer.valueOf(casilla4l7.getText());} catch(Exception e){if(!casilla4l7.getText().equals("")) invalidInput=true; else casilla4l7.setForeground(Color.BLUE);}
        try{matriz[3][7]=Integer.valueOf(casilla4l8.getText());} catch(Exception e){if(!casilla4l8.getText().equals("")) invalidInput=true; else casilla4l8.setForeground(Color.BLUE);}
        try{matriz[3][8]=Integer.valueOf(casilla4l9.getText());} catch(Exception e){if(!casilla4l9.getText().equals("")) invalidInput=true; else casilla4l9.setForeground(Color.BLUE);}
        try{matriz[4][0]=Integer.valueOf(casilla5l1.getText());} catch(Exception e){if(!casilla5l1.getText().equals("")) invalidInput=true; else casilla5l1.setForeground(Color.BLUE);}
        try{matriz[4][1]=Integer.valueOf(casilla5l2.getText());} catch(Exception e){if(!casilla5l2.getText().equals("")) invalidInput=true; else casilla5l2.setForeground(Color.BLUE);}
        try{matriz[4][2]=Integer.valueOf(casilla5l3.getText());} catch(Exception e){if(!casilla5l3.getText().equals("")) invalidInput=true; else casilla5l3.setForeground(Color.BLUE);}
        try{matriz[4][3]=Integer.valueOf(casilla5l4.getText());} catch(Exception e){if(!casilla5l4.getText().equals("")) invalidInput=true; else casilla5l4.setForeground(Color.BLUE);}
        try{matriz[4][4]=Integer.valueOf(casilla5l5.getText());} catch(Exception e){if(!casilla5l5.getText().equals("")) invalidInput=true; else casilla5l5.setForeground(Color.BLUE);}
        try{matriz[4][5]=Integer.valueOf(casilla5l6.getText());} catch(Exception e){if(!casilla5l6.getText().equals("")) invalidInput=true; else casilla5l6.setForeground(Color.BLUE);}
        try{matriz[4][6]=Integer.valueOf(casilla5l7.getText());} catch(Exception e){if(!casilla5l7.getText().equals("")) invalidInput=true; else casilla5l7.setForeground(Color.BLUE);}
        try{matriz[4][7]=Integer.valueOf(casilla5l8.getText());} catch(Exception e){if(!casilla5l8.getText().equals("")) invalidInput=true; else casilla5l8.setForeground(Color.BLUE);}
        try{matriz[4][8]=Integer.valueOf(casilla5l9.getText());} catch(Exception e){if(!casilla5l9.getText().equals("")) invalidInput=true; else casilla5l9.setForeground(Color.BLUE);}
        try{matriz[5][0]=Integer.valueOf(casilla6l1.getText());} catch(Exception e){if(!casilla6l1.getText().equals("")) invalidInput=true; else casilla6l1.setForeground(Color.BLUE);}
        try{matriz[5][1]=Integer.valueOf(casilla6l2.getText());} catch(Exception e){if(!casilla6l2.getText().equals("")) invalidInput=true; else casilla6l2.setForeground(Color.BLUE);}
        try{matriz[5][2]=Integer.valueOf(casilla6l3.getText());} catch(Exception e){if(!casilla6l3.getText().equals("")) invalidInput=true; else casilla6l3.setForeground(Color.BLUE);}
        try{matriz[5][3]=Integer.valueOf(casilla6l4.getText());} catch(Exception e){if(!casilla6l4.getText().equals("")) invalidInput=true; else casilla6l4.setForeground(Color.BLUE);}
        try{matriz[5][4]=Integer.valueOf(casilla6l5.getText());} catch(Exception e){if(!casilla6l5.getText().equals("")) invalidInput=true; else casilla6l5.setForeground(Color.BLUE);}
        try{matriz[5][5]=Integer.valueOf(casilla6l6.getText());} catch(Exception e){if(!casilla6l6.getText().equals("")) invalidInput=true; else casilla6l6.setForeground(Color.BLUE);}
        try{matriz[5][6]=Integer.valueOf(casilla6l7.getText());} catch(Exception e){if(!casilla6l7.getText().equals("")) invalidInput=true; else casilla6l7.setForeground(Color.BLUE);}
        try{matriz[5][7]=Integer.valueOf(casilla6l8.getText());} catch(Exception e){if(!casilla6l8.getText().equals("")) invalidInput=true; else casilla6l8.setForeground(Color.BLUE);}
        try{matriz[5][8]=Integer.valueOf(casilla6l9.getText());} catch(Exception e){if(!casilla6l9.getText().equals("")) invalidInput=true; else casilla6l9.setForeground(Color.BLUE);}
        try{matriz[6][0]=Integer.valueOf(casilla7l1.getText());} catch(Exception e){if(!casilla7l1.getText().equals("")) invalidInput=true; else casilla7l1.setForeground(Color.BLUE);}
        try{matriz[6][1]=Integer.valueOf(casilla7l2.getText());} catch(Exception e){if(!casilla7l2.getText().equals("")) invalidInput=true; else casilla7l2.setForeground(Color.BLUE);}
        try{matriz[6][2]=Integer.valueOf(casilla7l3.getText());} catch(Exception e){if(!casilla7l3.getText().equals("")) invalidInput=true; else casilla7l3.setForeground(Color.BLUE);}
        try{matriz[6][3]=Integer.valueOf(casilla7l4.getText());} catch(Exception e){if(!casilla7l4.getText().equals("")) invalidInput=true; else casilla7l4.setForeground(Color.BLUE);}
        try{matriz[6][4]=Integer.valueOf(casilla7l5.getText());} catch(Exception e){if(!casilla7l5.getText().equals("")) invalidInput=true; else casilla7l5.setForeground(Color.BLUE);}
        try{matriz[6][5]=Integer.valueOf(casilla7l6.getText());} catch(Exception e){if(!casilla7l6.getText().equals("")) invalidInput=true; else casilla7l6.setForeground(Color.BLUE);}
        try{matriz[6][6]=Integer.valueOf(casilla7l7.getText());} catch(Exception e){if(!casilla7l7.getText().equals("")) invalidInput=true; else casilla7l7.setForeground(Color.BLUE);}
        try{matriz[6][7]=Integer.valueOf(casilla7l8.getText());} catch(Exception e){if(!casilla7l8.getText().equals("")) invalidInput=true; else casilla7l8.setForeground(Color.BLUE);}
        try{matriz[6][8]=Integer.valueOf(casilla7l9.getText());} catch(Exception e){if(!casilla7l9.getText().equals("")) invalidInput=true; else casilla7l9.setForeground(Color.BLUE);}
        try{matriz[7][0]=Integer.valueOf(casilla8l1.getText());} catch(Exception e){if(!casilla8l1.getText().equals("")) invalidInput=true; else casilla8l1.setForeground(Color.BLUE);}
        try{matriz[7][1]=Integer.valueOf(casilla8l2.getText());} catch(Exception e){if(!casilla8l2.getText().equals("")) invalidInput=true; else casilla8l2.setForeground(Color.BLUE);}
        try{matriz[7][2]=Integer.valueOf(casilla8l3.getText());} catch(Exception e){if(!casilla8l3.getText().equals("")) invalidInput=true; else casilla8l3.setForeground(Color.BLUE);}
        try{matriz[7][3]=Integer.valueOf(casilla8l4.getText());} catch(Exception e){if(!casilla8l4.getText().equals("")) invalidInput=true; else casilla8l4.setForeground(Color.BLUE);}
        try{matriz[7][4]=Integer.valueOf(casilla8l5.getText());} catch(Exception e){if(!casilla8l5.getText().equals("")) invalidInput=true; else casilla8l5.setForeground(Color.BLUE);}
        try{matriz[7][5]=Integer.valueOf(casilla8l6.getText());} catch(Exception e){if(!casilla8l6.getText().equals("")) invalidInput=true; else casilla8l6.setForeground(Color.BLUE);}
        try{matriz[7][6]=Integer.valueOf(casilla8l7.getText());} catch(Exception e){if(!casilla8l7.getText().equals("")) invalidInput=true; else casilla8l7.setForeground(Color.BLUE);}
        try{matriz[7][7]=Integer.valueOf(casilla8l8.getText());} catch(Exception e){if(!casilla8l8.getText().equals("")) invalidInput=true; else casilla8l8.setForeground(Color.BLUE);}
        try{matriz[7][8]=Integer.valueOf(casilla8l9.getText());} catch(Exception e){if(!casilla8l9.getText().equals("")) invalidInput=true; else casilla8l9.setForeground(Color.BLUE);}
        try{matriz[8][0]=Integer.valueOf(casilla9l1.getText());} catch(Exception e){if(!casilla9l1.getText().equals("")) invalidInput=true; else casilla9l1.setForeground(Color.BLUE);}
        try{matriz[8][1]=Integer.valueOf(casilla9l2.getText());} catch(Exception e){if(!casilla9l2.getText().equals("")) invalidInput=true; else casilla9l2.setForeground(Color.BLUE);}
        try{matriz[8][2]=Integer.valueOf(casilla9l3.getText());} catch(Exception e){if(!casilla9l3.getText().equals("")) invalidInput=true; else casilla9l3.setForeground(Color.BLUE);}
        try{matriz[8][3]=Integer.valueOf(casilla9l4.getText());} catch(Exception e){if(!casilla9l4.getText().equals("")) invalidInput=true; else casilla9l4.setForeground(Color.BLUE);}
        try{matriz[8][4]=Integer.valueOf(casilla9l5.getText());} catch(Exception e){if(!casilla9l5.getText().equals("")) invalidInput=true; else casilla9l5.setForeground(Color.BLUE);}
        try{matriz[8][5]=Integer.valueOf(casilla9l6.getText());} catch(Exception e){if(!casilla9l6.getText().equals("")) invalidInput=true; else casilla9l6.setForeground(Color.BLUE);}
        try{matriz[8][6]=Integer.valueOf(casilla9l7.getText());} catch(Exception e){if(!casilla9l7.getText().equals("")) invalidInput=true; else casilla9l7.setForeground(Color.BLUE);}
        try{matriz[8][7]=Integer.valueOf(casilla9l8.getText());} catch(Exception e){if(!casilla9l8.getText().equals("")) invalidInput=true; else casilla9l8.setForeground(Color.BLUE);}
        try{matriz[8][8]=Integer.valueOf(casilla9l9.getText());} catch(Exception e){if(!casilla9l9.getText().equals("")) invalidInput=true; else casilla9l9.setForeground(Color.BLUE);}
      
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casilla4l2 = new java.awt.TextField();
        casilla4l3 = new java.awt.TextField();
        casilla4l4 = new java.awt.TextField();
        casilla4l5 = new java.awt.TextField();
        casilla4l6 = new java.awt.TextField();
        casilla4l7 = new java.awt.TextField();
        casilla4l8 = new java.awt.TextField();
        casilla4l9 = new java.awt.TextField();
        casilla8l6 = new java.awt.TextField();
        casilla5l1 = new java.awt.TextField();
        casilla8l7 = new java.awt.TextField();
        casilla5l2 = new java.awt.TextField();
        casilla8l8 = new java.awt.TextField();
        casilla8l9 = new java.awt.TextField();
        casilla9l1 = new java.awt.TextField();
        casilla9l2 = new java.awt.TextField();
        casilla9l3 = new java.awt.TextField();
        casilla9l4 = new java.awt.TextField();
        casilla9l5 = new java.awt.TextField();
        casilla9l6 = new java.awt.TextField();
        casilla1l1 = new java.awt.TextField();
        casilla1l2 = new java.awt.TextField();
        casilla9l7 = new java.awt.TextField();
        casilla1l3 = new java.awt.TextField();
        casilla9l8 = new java.awt.TextField();
        casilla1l4 = new java.awt.TextField();
        casilla9l9 = new java.awt.TextField();
        casilla1l5 = new java.awt.TextField();
        casilla1l6 = new java.awt.TextField();
        casilla5l3 = new java.awt.TextField();
        casilla1l7 = new java.awt.TextField();
        casilla5l4 = new java.awt.TextField();
        casilla1l8 = new java.awt.TextField();
        casilla5l5 = new java.awt.TextField();
        casilla5l6 = new java.awt.TextField();
        casilla5l7 = new java.awt.TextField();
        casilla5l8 = new java.awt.TextField();
        casilla5l9 = new java.awt.TextField();
        casilla6l1 = new java.awt.TextField();
        casilla6l2 = new java.awt.TextField();
        casilla6l3 = new java.awt.TextField();
        casilla1l9 = new java.awt.TextField();
        casilla2l1 = new java.awt.TextField();
        casilla2l2 = new java.awt.TextField();
        casilla2l3 = new java.awt.TextField();
        casilla2l4 = new java.awt.TextField();
        casilla2l5 = new java.awt.TextField();
        botonResolver = new javax.swing.JButton();
        casilla2l6 = new java.awt.TextField();
        botonLimpiar = new javax.swing.JButton();
        casilla2l7 = new java.awt.TextField();
        casilla6l4 = new java.awt.TextField();
        casillaResultado = new javax.swing.JTextField();
        casilla2l8 = new java.awt.TextField();
        casilla6l5 = new java.awt.TextField();
        tituloSudoku = new javax.swing.JLabel();
        casilla2l9 = new java.awt.TextField();
        casilla6l6 = new java.awt.TextField();
        casilla6l7 = new java.awt.TextField();
        casilla6l8 = new java.awt.TextField();
        casilla6l9 = new java.awt.TextField();
        casilla7l1 = new java.awt.TextField();
        casilla7l2 = new java.awt.TextField();
        casilla7l3 = new java.awt.TextField();
        casilla7l4 = new java.awt.TextField();
        casilla3l1 = new java.awt.TextField();
        casilla3l2 = new java.awt.TextField();
        casilla3l3 = new java.awt.TextField();
        casilla3l4 = new java.awt.TextField();
        casilla3l5 = new java.awt.TextField();
        casilla3l6 = new java.awt.TextField();
        casilla3l7 = new java.awt.TextField();
        casilla3l8 = new java.awt.TextField();
        casilla7l5 = new java.awt.TextField();
        casilla3l9 = new java.awt.TextField();
        casilla7l6 = new java.awt.TextField();
        casilla4l1 = new java.awt.TextField();
        casilla7l7 = new java.awt.TextField();
        casilla7l8 = new java.awt.TextField();
        casilla7l9 = new java.awt.TextField();
        casilla8l1 = new java.awt.TextField();
        casilla8l2 = new java.awt.TextField();
        casilla8l3 = new java.awt.TextField();
        casilla8l4 = new java.awt.TextField();
        casilla8l5 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        casilla4l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla4l2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla4l2.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla4l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla4l3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla4l3.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla4l4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla4l4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla4l4.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla4l5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla4l5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla4l5.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla4l6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla4l6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla4l6.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla4l7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla4l7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla4l7.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla4l8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla4l8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla4l8.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla4l9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla4l9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla4l9.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla8l6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla8l6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla8l6.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla5l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla5l1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla5l1.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla8l7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla8l7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla8l7.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla5l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla5l2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla5l2.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla8l8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla8l8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla8l8.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla8l9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla8l9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla8l9.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla9l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla9l1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla9l1.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla9l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla9l2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla9l2.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla9l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla9l3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla9l3.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla9l4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla9l4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla9l4.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla9l5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla9l5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla9l5.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla9l6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla9l6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla9l6.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla1l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla1l1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla1l1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                casilla1l1MouseClicked(evt);
            }
        });
        casilla1l1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                casilla1l1FocusGained(evt);
            }
        });
        casilla1l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1l1ActionPerformed(evt);
            }
        });

        casilla1l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla1l2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla1l2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                casilla1l2MouseClicked(evt);
            }
        });
        casilla1l2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                casilla1l2FocusGained(evt);
            }
        });
        casilla1l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1l2ActionPerformed(evt);
            }
        });

        casilla9l7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla9l7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla9l7.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla1l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla1l3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla1l3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1l3ActionPerformed(evt);
            }
        });

        casilla9l8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla9l8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla9l8.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla1l4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla1l4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla1l4.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla9l9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla9l9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla9l9.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla1l5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla1l5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla1l5.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla1l6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla1l6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla1l6.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla5l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla5l3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla5l3.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla1l7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla1l7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla1l7.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla5l4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla5l4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla5l4.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla1l8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla1l8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla1l8.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla5l5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla5l5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla5l5.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla5l6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla5l6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla5l6.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla5l7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla5l7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla5l7.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla5l8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla5l8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla5l8.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla5l9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla5l9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla5l9.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla6l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla6l1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla6l1.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla6l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla6l2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla6l2.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla6l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla6l3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla6l3.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla1l9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla1l9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla1l9.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla2l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla2l1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla2l1.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla2l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla2l2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla2l2.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla2l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla2l3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla2l3.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla2l4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla2l4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla2l4.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla2l5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla2l5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla2l5.setPreferredSize(new java.awt.Dimension(30, 30));

        botonResolver.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        botonResolver.setText("Resolver");
        botonResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResolverActionPerformed(evt);
            }
        });

        casilla2l6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla2l6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla2l6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2l6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2l6ActionPerformed(evt);
            }
        });

        botonLimpiar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        casilla2l7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla2l7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla2l7.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla6l4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla6l4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla6l4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6l4ActionPerformed(evt);
            }
        });

        casillaResultado.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N

        casilla2l8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla2l8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla2l8.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla6l5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla6l5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla6l5.setPreferredSize(new java.awt.Dimension(30, 30));

        tituloSudoku.setFont(new java.awt.Font("Tempus Sans ITC", 0, 30)); // NOI18N
        tituloSudoku.setText("Sudoku");

        casilla2l9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla2l9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla2l9.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla6l6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla6l6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla6l6.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla6l7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla6l7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla6l7.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla6l8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla6l8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla6l8.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla6l9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla6l9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla6l9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6l9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                casilla6l9MouseClicked(evt);
            }
        });

        casilla7l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla7l1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla7l1.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla7l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla7l2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla7l2.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla7l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla7l3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla7l3.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla7l4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla7l4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla7l4.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla3l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla3l1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla3l1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3l1ActionPerformed(evt);
            }
        });

        casilla3l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla3l2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla3l2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                casilla3l2MouseClicked(evt);
            }
        });

        casilla3l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla3l3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla3l3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                casilla3l3MouseClicked(evt);
            }
        });
        casilla3l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3l3ActionPerformed(evt);
            }
        });

        casilla3l4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla3l4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla3l4.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla3l5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla3l5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla3l5.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla3l6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla3l6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla3l6.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla3l7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla3l7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla3l7.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla3l8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla3l8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla3l8.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla7l5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla7l5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla7l5.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla3l9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla3l9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla3l9.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla7l6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla7l6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla7l6.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla4l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla4l1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla4l1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4l1ActionPerformed(evt);
            }
        });

        casilla7l7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla7l7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla7l7.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla7l8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla7l8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla7l8.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla7l9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla7l9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla7l9.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla8l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla8l1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla8l1.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla8l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla8l2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla8l2.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla8l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla8l3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla8l3.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla8l4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla8l4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla8l4.setPreferredSize(new java.awt.Dimension(30, 30));

        casilla8l5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        casilla8l5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        casilla8l5.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla1l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla1l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla1l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla4l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla4l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla4l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla7l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla7l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla7l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla4l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla4l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla4l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla7l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla7l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla7l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla1l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla1l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla1l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla1l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla1l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla1l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla4l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla4l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla4l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla7l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla7l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla7l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla2l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla2l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla2l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla5l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla5l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla5l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla8l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla8l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla8l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla5l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla5l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla5l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla8l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla8l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla8l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla2l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla2l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla2l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla2l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla2l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla2l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla5l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla5l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla5l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla8l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla8l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla8l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla3l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla3l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla3l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla3l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla3l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla3l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla3l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla3l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla3l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla6l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla6l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla6l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla6l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla6l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla6l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla6l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla6l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla6l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla9l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla9l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla9l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla9l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla9l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla9l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casilla9l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla9l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(casilla9l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(casillaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(tituloSudoku)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casilla1l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla1l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla1l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casilla1l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla1l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla1l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casilla1l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla1l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla1l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casilla4l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla4l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla4l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla6l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla6l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla6l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casilla4l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla4l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla4l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla6l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla6l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla6l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casilla4l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla4l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla4l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla6l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla6l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla6l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casilla7l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla7l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla7l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casilla7l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla7l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla7l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casilla7l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla7l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla7l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(tituloSudoku, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonResolver)
                            .addComponent(botonLimpiar))
                        .addGap(18, 18, 18)
                        .addComponent(casillaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(264, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casilla1l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla1l1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1l1MouseClicked

    private void casilla1l1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_casilla1l1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1l1FocusGained

    private void casilla1l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1l1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1l1ActionPerformed

    private void casilla1l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla1l2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1l2MouseClicked

    private void casilla1l2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_casilla1l2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1l2FocusGained

    private void casilla1l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1l2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1l2ActionPerformed

    private void casilla1l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1l3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1l3ActionPerformed

    private void botonResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResolverActionPerformed
        
        getValues();
        try{
            if (invalidInput)
                throw new Exception();
            for(int i=0; i<9; i++)
                for(int j=0; j<9; j++)
                    if (matriz[i][j]!=0)
                        valida(matriz[i][j]);
            sudoku.setMatriz(matriz);
            sudoku.resuelve();
            casilla1l1.setText(String.valueOf(matriz[0][0]));
            casilla1l2.setText(String.valueOf(matriz[0][1]));
            casilla1l3.setText(String.valueOf(matriz[0][2]));
            casilla1l4.setText(String.valueOf(matriz[0][3]));
            casilla1l5.setText(String.valueOf(matriz[0][4]));
            casilla1l6.setText(String.valueOf(matriz[0][5]));
            casilla1l7.setText(String.valueOf(matriz[0][6]));
            casilla1l8.setText(String.valueOf(matriz[0][7]));
            casilla1l9.setText(String.valueOf(matriz[0][8]));
            
            casilla2l1.setText(String.valueOf(matriz[1][0]));
            casilla2l2.setText(String.valueOf(matriz[1][1]));
            casilla2l3.setText(String.valueOf(matriz[1][2]));
            casilla2l4.setText(String.valueOf(matriz[1][3]));
            casilla2l5.setText(String.valueOf(matriz[1][4]));
            casilla2l6.setText(String.valueOf(matriz[1][5]));
            casilla2l7.setText(String.valueOf(matriz[1][6]));
            casilla2l8.setText(String.valueOf(matriz[1][7]));
            casilla2l9.setText(String.valueOf(matriz[1][8]));
            
            casilla3l1.setText(String.valueOf(matriz[2][0]));
            casilla3l2.setText(String.valueOf(matriz[2][1]));
            casilla3l3.setText(String.valueOf(matriz[2][2]));
            casilla3l4.setText(String.valueOf(matriz[2][3]));
            casilla3l5.setText(String.valueOf(matriz[2][4]));
            casilla3l6.setText(String.valueOf(matriz[2][5]));
            casilla3l7.setText(String.valueOf(matriz[2][6]));
            casilla3l8.setText(String.valueOf(matriz[2][7]));
            casilla3l9.setText(String.valueOf(matriz[2][8]));
           
            casilla4l1.setText(String.valueOf(matriz[3][0]));
            casilla4l2.setText(String.valueOf(matriz[3][1]));
            casilla4l3.setText(String.valueOf(matriz[3][2]));
            casilla4l4.setText(String.valueOf(matriz[3][3]));
            casilla4l5.setText(String.valueOf(matriz[3][4]));
            casilla4l6.setText(String.valueOf(matriz[3][5]));
            casilla4l7.setText(String.valueOf(matriz[3][6]));
            casilla4l8.setText(String.valueOf(matriz[3][7]));
            casilla4l9.setText(String.valueOf(matriz[3][8]));
            
            casilla5l1.setText(String.valueOf(matriz[4][0]));
            casilla5l2.setText(String.valueOf(matriz[4][1]));
            casilla5l3.setText(String.valueOf(matriz[4][2]));
            casilla5l4.setText(String.valueOf(matriz[4][3]));
            casilla5l5.setText(String.valueOf(matriz[4][4]));
            casilla5l6.setText(String.valueOf(matriz[4][5]));
            casilla5l7.setText(String.valueOf(matriz[4][6]));
            casilla5l8.setText(String.valueOf(matriz[4][7]));
            casilla5l9.setText(String.valueOf(matriz[4][8]));
            
            casilla6l1.setText(String.valueOf(matriz[5][0]));
            casilla6l2.setText(String.valueOf(matriz[5][1]));
            casilla6l3.setText(String.valueOf(matriz[5][2]));
            casilla6l4.setText(String.valueOf(matriz[5][3]));
            casilla6l5.setText(String.valueOf(matriz[5][4]));
            casilla6l6.setText(String.valueOf(matriz[5][5]));
            casilla6l7.setText(String.valueOf(matriz[5][6]));
            casilla6l8.setText(String.valueOf(matriz[5][7]));
            casilla6l9.setText(String.valueOf(matriz[5][8]));
            
            casilla7l1.setText(String.valueOf(matriz[6][0]));
            casilla7l2.setText(String.valueOf(matriz[6][1]));
            casilla7l3.setText(String.valueOf(matriz[6][2]));
            casilla7l4.setText(String.valueOf(matriz[6][3]));
            casilla7l5.setText(String.valueOf(matriz[6][4]));
            casilla7l6.setText(String.valueOf(matriz[6][5]));
            casilla7l7.setText(String.valueOf(matriz[6][6]));
            casilla7l8.setText(String.valueOf(matriz[6][7]));
            casilla7l9.setText(String.valueOf(matriz[6][8]));
            
            casilla8l1.setText(String.valueOf(matriz[7][0]));
            casilla8l2.setText(String.valueOf(matriz[7][1]));
            casilla8l3.setText(String.valueOf(matriz[7][2]));
            casilla8l4.setText(String.valueOf(matriz[7][3]));
            casilla8l5.setText(String.valueOf(matriz[7][4]));
            casilla8l6.setText(String.valueOf(matriz[7][5]));
            casilla8l7.setText(String.valueOf(matriz[7][6]));
            casilla8l8.setText(String.valueOf(matriz[7][7]));
            casilla8l9.setText(String.valueOf(matriz[7][8]));
            
            casilla9l1.setText(String.valueOf(matriz[8][0]));
            casilla9l2.setText(String.valueOf(matriz[8][1]));
            casilla9l3.setText(String.valueOf(matriz[8][2]));
            casilla9l4.setText(String.valueOf(matriz[8][3]));
            casilla9l5.setText(String.valueOf(matriz[8][4]));
            casilla9l6.setText(String.valueOf(matriz[8][5]));
            casilla9l7.setText(String.valueOf(matriz[8][6]));
            casilla9l8.setText(String.valueOf(matriz[8][7]));
            casilla9l9.setText(String.valueOf(matriz[8][8]));
        }
        catch(Exception e){
            casillaResultado.setText("ERROR: The matrix is not Valid!!!");
        }
        
        
    }//GEN-LAST:event_botonResolverActionPerformed

    private void casilla2l6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2l6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2l6ActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        invalidInput=false;
        casillaResultado.setText("");
        matriz = new int[9][9];
        casilla1l1.setForeground(Color.BLACK);
        casilla1l2.setForeground(Color.BLACK);
        casilla1l3.setForeground(Color.BLACK);
        casilla1l4.setForeground(Color.BLACK);
        casilla1l5.setForeground(Color.BLACK);
        casilla1l6.setForeground(Color.BLACK);
        casilla1l7.setForeground(Color.BLACK);
        casilla1l8.setForeground(Color.BLACK);
        casilla1l9.setForeground(Color.BLACK);
        casilla2l1.setForeground(Color.BLACK);
        casilla2l2.setForeground(Color.BLACK);
        casilla2l3.setForeground(Color.BLACK);
        casilla2l4.setForeground(Color.BLACK);
        casilla2l5.setForeground(Color.BLACK);
        casilla2l6.setForeground(Color.BLACK);
        casilla2l7.setForeground(Color.BLACK);
        casilla2l8.setForeground(Color.BLACK);
        casilla2l9.setForeground(Color.BLACK);
        casilla3l1.setForeground(Color.BLACK);
        casilla3l2.setForeground(Color.BLACK);
        casilla3l3.setForeground(Color.BLACK);
        casilla3l4.setForeground(Color.BLACK);
        casilla3l5.setForeground(Color.BLACK);
        casilla3l6.setForeground(Color.BLACK);
        casilla3l7.setForeground(Color.BLACK);
        casilla3l8.setForeground(Color.BLACK);
        casilla3l9.setForeground(Color.BLACK);
        casilla4l1.setForeground(Color.BLACK);
        casilla4l2.setForeground(Color.BLACK);
        casilla4l3.setForeground(Color.BLACK);
        casilla4l4.setForeground(Color.BLACK);
        casilla4l5.setForeground(Color.BLACK);
        casilla4l6.setForeground(Color.BLACK);
        casilla4l7.setForeground(Color.BLACK);
        casilla4l8.setForeground(Color.BLACK);
        casilla4l9.setForeground(Color.BLACK);
        casilla5l1.setForeground(Color.BLACK);
        casilla5l2.setForeground(Color.BLACK);
        casilla5l3.setForeground(Color.BLACK);
        casilla5l4.setForeground(Color.BLACK);
        casilla5l5.setForeground(Color.BLACK);
        casilla5l6.setForeground(Color.BLACK);
        casilla5l7.setForeground(Color.BLACK);
        casilla5l8.setForeground(Color.BLACK);
        casilla5l9.setForeground(Color.BLACK);
        casilla6l1.setForeground(Color.BLACK);
        casilla6l2.setForeground(Color.BLACK);
        casilla6l3.setForeground(Color.BLACK);
        casilla6l4.setForeground(Color.BLACK);
        casilla6l5.setForeground(Color.BLACK);
        casilla6l6.setForeground(Color.BLACK);
        casilla6l7.setForeground(Color.BLACK);
        casilla6l8.setForeground(Color.BLACK);
        casilla6l9.setForeground(Color.BLACK);
        casilla7l1.setForeground(Color.BLACK);
        casilla7l2.setForeground(Color.BLACK);
        casilla7l3.setForeground(Color.BLACK);
        casilla7l4.setForeground(Color.BLACK);
        casilla7l5.setForeground(Color.BLACK);
        casilla7l6.setForeground(Color.BLACK);
        casilla7l7.setForeground(Color.BLACK);
        casilla7l8.setForeground(Color.BLACK);
        casilla7l9.setForeground(Color.BLACK);
        casilla8l1.setForeground(Color.BLACK);
        casilla8l2.setForeground(Color.BLACK);
        casilla8l3.setForeground(Color.BLACK);
        casilla8l4.setForeground(Color.BLACK);
        casilla8l5.setForeground(Color.BLACK);
        casilla8l6.setForeground(Color.BLACK);
        casilla8l7.setForeground(Color.BLACK);
        casilla8l8.setForeground(Color.BLACK);
        casilla8l9.setForeground(Color.BLACK);
        casilla9l1.setForeground(Color.BLACK);
        casilla9l2.setForeground(Color.BLACK);
        casilla9l3.setForeground(Color.BLACK);
        casilla9l4.setForeground(Color.BLACK);
        casilla9l5.setForeground(Color.BLACK);
        casilla9l6.setForeground(Color.BLACK);
        casilla9l7.setForeground(Color.BLACK);
        casilla9l8.setForeground(Color.BLACK);
        casilla9l9.setForeground(Color.BLACK);
        casilla1l1.setText("");
        casilla1l2.setText("");
        casilla1l3.setText("");
        casilla1l4.setText("");
        casilla1l5.setText("");
        casilla1l6.setText("");
        casilla1l7.setText("");
        casilla1l8.setText("");
        casilla1l9.setText("");
        casilla2l1.setText("");
        casilla2l2.setText("");
        casilla2l3.setText("");
        casilla2l4.setText("");
        casilla2l5.setText("");
        casilla2l6.setText("");
        casilla2l7.setText("");
        casilla2l8.setText("");
        casilla2l9.setText("");
        casilla3l1.setText("");
        casilla3l2.setText("");
        casilla3l3.setText("");
        casilla3l4.setText("");
        casilla3l5.setText("");
        casilla3l6.setText("");
        casilla3l7.setText("");
        casilla3l8.setText("");
        casilla3l9.setText("");
        casilla4l1.setText("");
        casilla4l2.setText("");
        casilla4l3.setText("");
        casilla4l4.setText("");
        casilla4l5.setText("");
        casilla4l6.setText("");
        casilla4l7.setText("");
        casilla4l8.setText("");
        casilla4l9.setText("");
        casilla5l1.setText("");
        casilla5l2.setText("");
        casilla5l3.setText("");
        casilla5l4.setText("");
        casilla5l5.setText("");
        casilla5l6.setText("");
        casilla5l7.setText("");
        casilla5l8.setText("");
        casilla5l9.setText("");
        casilla6l1.setText("");
        casilla6l2.setText("");
        casilla6l3.setText("");
        casilla6l4.setText("");
        casilla6l5.setText("");
        casilla6l6.setText("");
        casilla6l7.setText("");
        casilla6l8.setText("");
        casilla6l9.setText("");
        casilla7l1.setText("");
        casilla7l2.setText("");
        casilla7l3.setText("");
        casilla7l4.setText("");
        casilla7l5.setText("");
        casilla7l6.setText("");
        casilla7l7.setText("");
        casilla7l8.setText("");
        casilla7l9.setText("");
        casilla8l1.setText("");
        casilla8l2.setText("");
        casilla8l3.setText("");
        casilla8l4.setText("");
        casilla8l5.setText("");
        casilla8l6.setText("");
        casilla8l7.setText("");
        casilla8l8.setText("");
        casilla8l9.setText("");
        casilla9l1.setText("");
        casilla9l2.setText("");
        casilla9l3.setText("");
        casilla9l4.setText("");
        casilla9l5.setText("");
        casilla9l6.setText("");
        casilla9l7.setText("");
        casilla9l8.setText("");
        casilla9l9.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void casilla6l4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6l4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6l4ActionPerformed

    private void casilla6l9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla6l9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6l9MouseClicked

    private void casilla3l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3l1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3l1ActionPerformed

    private void casilla3l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla3l2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3l2MouseClicked

    private void casilla3l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla3l3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3l3MouseClicked

    private void casilla3l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3l3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3l3ActionPerformed

    private void casilla4l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4l1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4l1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonResolver;
    private java.awt.TextField casilla1l1;
    private java.awt.TextField casilla1l2;
    private java.awt.TextField casilla1l3;
    private java.awt.TextField casilla1l4;
    private java.awt.TextField casilla1l5;
    private java.awt.TextField casilla1l6;
    private java.awt.TextField casilla1l7;
    private java.awt.TextField casilla1l8;
    private java.awt.TextField casilla1l9;
    private java.awt.TextField casilla2l1;
    private java.awt.TextField casilla2l2;
    private java.awt.TextField casilla2l3;
    private java.awt.TextField casilla2l4;
    private java.awt.TextField casilla2l5;
    private java.awt.TextField casilla2l6;
    private java.awt.TextField casilla2l7;
    private java.awt.TextField casilla2l8;
    private java.awt.TextField casilla2l9;
    private java.awt.TextField casilla3l1;
    private java.awt.TextField casilla3l2;
    private java.awt.TextField casilla3l3;
    private java.awt.TextField casilla3l4;
    private java.awt.TextField casilla3l5;
    private java.awt.TextField casilla3l6;
    private java.awt.TextField casilla3l7;
    private java.awt.TextField casilla3l8;
    private java.awt.TextField casilla3l9;
    private java.awt.TextField casilla4l1;
    private java.awt.TextField casilla4l2;
    private java.awt.TextField casilla4l3;
    private java.awt.TextField casilla4l4;
    private java.awt.TextField casilla4l5;
    private java.awt.TextField casilla4l6;
    private java.awt.TextField casilla4l7;
    private java.awt.TextField casilla4l8;
    private java.awt.TextField casilla4l9;
    private java.awt.TextField casilla5l1;
    private java.awt.TextField casilla5l2;
    private java.awt.TextField casilla5l3;
    private java.awt.TextField casilla5l4;
    private java.awt.TextField casilla5l5;
    private java.awt.TextField casilla5l6;
    private java.awt.TextField casilla5l7;
    private java.awt.TextField casilla5l8;
    private java.awt.TextField casilla5l9;
    private java.awt.TextField casilla6l1;
    private java.awt.TextField casilla6l2;
    private java.awt.TextField casilla6l3;
    private java.awt.TextField casilla6l4;
    private java.awt.TextField casilla6l5;
    private java.awt.TextField casilla6l6;
    private java.awt.TextField casilla6l7;
    private java.awt.TextField casilla6l8;
    private java.awt.TextField casilla6l9;
    private java.awt.TextField casilla7l1;
    private java.awt.TextField casilla7l2;
    private java.awt.TextField casilla7l3;
    private java.awt.TextField casilla7l4;
    private java.awt.TextField casilla7l5;
    private java.awt.TextField casilla7l6;
    private java.awt.TextField casilla7l7;
    private java.awt.TextField casilla7l8;
    private java.awt.TextField casilla7l9;
    private java.awt.TextField casilla8l1;
    private java.awt.TextField casilla8l2;
    private java.awt.TextField casilla8l3;
    private java.awt.TextField casilla8l4;
    private java.awt.TextField casilla8l5;
    private java.awt.TextField casilla8l6;
    private java.awt.TextField casilla8l7;
    private java.awt.TextField casilla8l8;
    private java.awt.TextField casilla8l9;
    private java.awt.TextField casilla9l1;
    private java.awt.TextField casilla9l2;
    private java.awt.TextField casilla9l3;
    private java.awt.TextField casilla9l4;
    private java.awt.TextField casilla9l5;
    private java.awt.TextField casilla9l6;
    private java.awt.TextField casilla9l7;
    private java.awt.TextField casilla9l8;
    private java.awt.TextField casilla9l9;
    private javax.swing.JTextField casillaResultado;
    private javax.swing.JLabel tituloSudoku;
    // End of variables declaration//GEN-END:variables
}
