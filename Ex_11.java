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
public class Ex_11 {
    public static void main (String args[]){
        double R,C;
        R = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio da circunferência"));
        {
            C = 2 * Math.PI * R;
        }
        System.out.print("O comprimento da circunferência é: "+ C);
    }
    
}
