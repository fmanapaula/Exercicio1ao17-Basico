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
public class Ex_9 {
    public static void main (String args[]){
        int A,B,S;
        A = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1o. numero desejado:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2o. numero desejado:"));
        {
            S = (A*A)+(B*B);
        }
        System.out.println("A soma dos quadrados dos numeros eh: "+ S+".");
    }
    
}
