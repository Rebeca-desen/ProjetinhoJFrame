/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

import javax.swing.JOptionPane;

/**
 *
 * @author André
 */
public class acoes {
      public static void main(String[] args){
   
  float[][] estoque= new float[6][3];
    String[] ingredientes= new String[6];
    String input_estoque;
    String ingredientes_input;
     
    
    
    
    for(int i=0; i < estoque.length;  i++){ 
     ingredientes_input= JOptionPane.showInputDialog(null, "Adicione o nome do ingrediente:" + (i+1));
     ingredientes[i]= ingredientes_input;
     }
   
    
    for(int i=0; i < estoque.length;  i++){ 
    for(int iEstoque=0; iEstoque < estoque[i].length; iEstoque++){
 
   
     do{   
    input_estoque=JOptionPane.showInputDialog(null, "Adicione a quantidade de " + ingredientes[i] + " em estoque");
    estoque[i][0]= Float.valueOf(input_estoque);
    
    input_estoque=JOptionPane.showInputDialog(null, "Adicione a quantidade mínima que " + ingredientes[i] + " precisa ter em estoque");
    estoque[i][1]= Float.valueOf(input_estoque);
    if(estoque[i][1] > estoque[i][0]){
        JOptionPane.showMessageDialog(null, "vixi kk ein gata");
        continue;
     }
     input_estoque=JOptionPane.showInputDialog(null, "Adicione o valor unitário de " + ingredientes[i]);
     estoque[i][2]= Float.valueOf(input_estoque);
    i++;
     }while(estoque[i][2] <=0);{
         JOptionPane.showMessageDialog(null, "errrou");
    }
    }
    
    
    
    }
    
    }
 
 }
    
      

