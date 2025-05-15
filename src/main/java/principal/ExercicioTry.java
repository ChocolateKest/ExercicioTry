/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author 10724238393
 */
public class ExercicioTry {

    public static void main(String[] args) {
        try{

        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
        int n = 0;
        n = n1 / n2; // se for uma divisão por zero vai dar erro.
    }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, "Não é possivel realizar uma divisão por zero");
        
    }
        }
}
