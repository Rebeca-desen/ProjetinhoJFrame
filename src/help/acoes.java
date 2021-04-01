/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author André
 */
public class acoes {
boolean se= false;

     float[][] estoque;
   String[] ingredientes;
    public void cadastro () {
        estoque = new float[6][3];
        ingredientes = new String[6];

        String input_estoque = null;
        String ingredientes_input = null;
        
        for (int i = 0; i < estoque.length; i++) {
            ingredientes_input = JOptionPane.showInputDialog(null, "Adicione o nome do ingrediente:" + (i + 1));
            ingredientes[i] = ingredientes_input;
        }

        for (int i = 0; i < estoque.length; i++) {
            for (int iEstoque = 0; iEstoque < estoque[i].length; iEstoque++) {

                input_estoque = JOptionPane.showInputDialog(null, "Adicione a quantidade de " + ingredientes[i] + " em estoque");
                estoque[i][0] = Float.valueOf(input_estoque);

                input_estoque = JOptionPane.showInputDialog(null, "Adicione a quantidade mínima que " + ingredientes[i] + " precisa ter em estoque");
                estoque[i][1] = Float.valueOf(input_estoque);
                if (estoque[i][1] > estoque[i][0]) {
                    JOptionPane.showMessageDialog(null, "vixi kk ein gata");
                    continue;
                }
                input_estoque = JOptionPane.showInputDialog(null, "Adicione o valor unitário de " + ingredientes[i]);
                estoque[i][2] = Float.valueOf(input_estoque);
                if (estoque[i][2] <= 0) {
                    JOptionPane.showMessageDialog(null, "vixi kka");
                    continue;
                }
                i++;
                se = true;

  
    }
    }
   
    }

    /**
     *
     * @param estoque
     * @param ingredientes
     */
    void retirar() {
      //mudar pra colocar arrays
       //fazer case mesmoe
        estoque = new float[6][3];
        ingredientes = new String[6];
        
        JOptionPane.showMessageDialog(null, "entrei");

        int opcao;
        String VInformado;

        if (ingredientes == null) {

            JOptionPane.showMessageDialog(null, "tem nada aqui naum");
        }
        for (int i = 0; i < estoque.length; i++) {
            VInformado = JOptionPane.showInputDialog(null, "Selecione o ingrediente que deseja retirar\n"
                    + "1- " + ingredientes[i - 1] + " \n"
                    + "2-\n"
                    + "3- \n"
                    + "4-\n"
                    + "5- \n", null, JOptionPane.QUESTION_MESSAGE);
            opcao = Integer.valueOf(VInformado);
        }
    }

   

  

   
  

    

        
}




       
    

  

