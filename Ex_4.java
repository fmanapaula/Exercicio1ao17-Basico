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
public class Ex_4 {
    public static void main (String args[]){
        double TC,TF;
        TC = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em graus Celsius:"));
        {
            TF=(9*TC+160)/5;
        }
        System.out.println("A temperatura em Fahrenheit eh:" + TF);
    }
    
    
    
}
