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
public class Ex_8 {
    public static void main (String args[]){
        double dp, aj_dp;
        dp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito em poupança:"));
        {
            aj_dp = dp+(dp*0.013);
        }
        System.out.println("O valor após um mês de aplicação eh:"+aj_dp+" reais.");
    }
    
}
