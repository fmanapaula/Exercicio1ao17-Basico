/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulakanae
 */
import javax.swing.JOptionPane;
public class Ex_14 {
    public static void main (String args []){
        double a1,a2,a3,Sa;
        a1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1o. ângulo do triângulo:"));
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1o. ângulo do triângulo:"));
        {
            Sa = a1 + a2;
            a3 = 180 - Sa;
        }
        System.out.println("O terceiro ângulo vale:"+a3+" graus.");
    }
    
}
