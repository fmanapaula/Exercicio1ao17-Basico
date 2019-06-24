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
public class Ex_10 {
    public static void main(String args []){
        int A,B,D;
        A = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1o. valor desejado:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2o. valor desejado:"));
        {
            D = A-B;
        }
        System.out.println("A diferença dos valores é: "+D);
    }
    
}
