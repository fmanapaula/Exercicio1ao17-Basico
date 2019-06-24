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
public class Ex_6 {
    public static void main (String args []){
        int x,y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de x:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de y:"));
        {
            x=y+x;
            y=x-y;
            x=x-y;
        }
        System.out.println("Os valores serao:"+x+" , "+y+".");
    }
    
}
