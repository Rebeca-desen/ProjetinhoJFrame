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

    public static String[] ingredientes = new String[6];
    public static float[][] estoque = new float[6][3];
    public static float[] valor_final = new float[6];
    public static float[] valor_total = new float[6];
    public static String[] descricao = new String[6];

    public void cadastro() {

        String input_estoque = null;
        String ingredientes_input = null;

        for (int i = 0; i < estoque.length; i++) {
            ingredientes_input = JOptionPane.showInputDialog(null, "Adicione o nome do ingrediente:" + (i + 1));
            ingredientes[i] = ingredientes_input;
        }

        for (int i = 0; i < estoque.length; i++) {
          

                input_estoque = JOptionPane.showInputDialog(null, "Adicione a quantidade de " + ingredientes[i] + " em estoque");
                estoque[i][0] = Float.valueOf(input_estoque);

                input_estoque = JOptionPane.showInputDialog(null, "Adicione a quantidade mínima que " + ingredientes[i] + " precisa ter em estoque");
                estoque[i][1] = Float.valueOf(input_estoque);
                if (estoque[i][1] > estoque[i][0]) {
                    JOptionPane.showMessageDialog(null, "Quantidade de estoque não pode ser menor que a mínima exigida! Tente um valor válido");
                    continue;
                }
                input_estoque = JOptionPane.showInputDialog(null, "Adicione o valor unitário de " + ingredientes[i]);
                estoque[i][2] = Float.valueOf(input_estoque);
                if (estoque[i][2] <= 0) {
                    JOptionPane.showMessageDialog(null, "Inválido. Valor Unitário não pode ser 0.");
                    continue;
                }
              
            
        }

    }

    /**
     *
     * @param estoque
     * @param ingredientes
     */
    void retirar() {

        int opcao;
        String VInformado;
        float[] valor_retirado = new float[6];

        if (ingredientes[5] == null) {

            JOptionPane.showMessageDialog(null, "Insira os valores no cadastro");
        } else {
            do {
                VInformado = JOptionPane.showInputDialog(null, "Selecione o ingrediente que deseja retirar\n"
                        + "1- " + ingredientes[0] + " \n"
                        + "2- " + ingredientes[1] + " \n"
                        + "3- " + ingredientes[2] + " \n"
                        + "4- " + ingredientes[3] + " \n"
                        + "5- " + ingredientes[4] + " \n"
                        + "6- " + ingredientes[5] + " \n"
                        + "7- Finalizar", null, JOptionPane.QUESTION_MESSAGE);
                opcao = Integer.valueOf(VInformado);
                if (opcao > 7) {
                    JOptionPane.showMessageDialog(null, "Ingrediente não existe");
                } else {
                    JOptionPane.showMessageDialog(null, "Informações" + "\n" + "Estoque: " + estoque[opcao - 1][0] + "\n" + " Valor mínimo exigido: " + estoque[opcao - 1][1]);

                    VInformado = JOptionPane.showInputDialog(null, "Quanto deseja retirar do ingrediente " + ingredientes[opcao - 1] + "?");
                    valor_retirado[opcao - 1] = Float.valueOf(VInformado);

                    valor_final[opcao - 1] = estoque[opcao - 1][0] - valor_retirado[opcao - 1];

                    JOptionPane.showMessageDialog(null, estoque[opcao - 1][0] + " - " + valor_retirado[opcao - 1] + "= " + valor_final[opcao - 1]);

                    if (valor_retirado[opcao - 1] >= estoque[opcao - 1][0]) {
                        JOptionPane.showMessageDialog(null, "estoque insuficiente");
                        continue;
                    } else {
                        estoque[opcao - 1][0] = valor_final[opcao - 1];
                    }

                    JOptionPane.showMessageDialog(null, "Operação finalizada!");
                }

            } while (opcao != 7);
            {
            }
        }

    }

    void menor_minimo() {

        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i][0] < estoque[i][1]) {
                descricao[i] = "MM";
            } else {
                descricao[i] = "Normal";
            }
        }
    }

}

  

   
  

    

        





       
    

  

