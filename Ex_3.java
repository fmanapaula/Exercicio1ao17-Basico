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
public class Ex_3 {
    public static void main (String args []){
        double b,h,a;
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triangulo:"));
        h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triangulo:"));
        {
            a = (b*h)/2;
        }
        System.out.println("A area do triangulo eh:"+a+" m2.");        
    }
    
}
