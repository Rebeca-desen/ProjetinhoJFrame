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
    String ingredientes_input;
    
    for(int i=0; i < ingredientes.length;  i++){ 
    
    ingredientes_input= JOptionPane.showInputDialog(null, "Adicione o nome do " + (i+1) + "° " + "aluno(a):", null, JOptionPane.QUESTION_MESSAGE);
    ingredientes[i]= ingredientes_input;
    
    }
}
}
