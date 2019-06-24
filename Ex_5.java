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
public class Ex_5 {
    public static void main (String args []){
        int A,B,C,Delta;
        double X1,X2;
        A = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente A:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente B:"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente C:"));
        {
            Delta = (B*B)- 4*A*C;
            X1 = (-B)+ Math.sqrt(Delta)/2*A;
            X2 = (-B)- Math.sqrt(Delta)/2*A;                    
        }
        System.out.println("O valor das raízes sao:"+ X1+ " , "+ X2 +".");
    }
    
    
    
}
