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
    void cadastro(){
  float[][] estoque= new float[6][3];
    String[] ingredientes= new String[6];
    String input_estoque;
    String ingredientes_input = null;
    
    for(int i=0; i < ingredientes.length;  i++){ 
    for(int iEstoque=0; iEstoque < estoque[i].length; iEstoque++){
    ingredientes_input= JOptionPane.showInputDialog(null, "Adicione o nome do ingrediente:");
    ingredientes[i]= ingredientes_input;
    
    input_estoque=JOptionPane.showInputDialog(null, "Adicione a quantidade de " + ingredientes[i] + " em estoque");
    estoque[i][iEstoque]= Float.valueOf(input_estoque);
    
    input_estoque=JOptionPane.showInputDialog(null, "Adicione a quantidade mínima que " + ingredientes[i] + " precisa ter em estoque");
    estoque[i][iEstoque]= Float.valueOf(input_estoque);
    
     input_estoque=JOptionPane.showInputDialog(null, "Adicione o valor unitário de " + ingredientes[i]);
     estoque[i][iEstoque]= Float.valueOf(input_estoque);
      
    }
    
    }
 for(int i=0; i < ingredientes.length;  i++){ 
    for(int iEstoque=0; iEstoque < estoque[i].length; iEstoque++){
    JOptionPane.showMessageDialog(null, "Produto: " + ingredientes[i] + "\n "  +  "informações  \n" + estoque[i][iEstoque]);
    }
 }
    }
}
