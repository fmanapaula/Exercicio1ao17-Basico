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
public class Ex_15 {
    public static void main(String args[]){
        double c1,c2,h;
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do 1o. cateto"));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do 2o. cateto"));
        {
            h = Math.sqrt((c1*c1) + (c2*c2));
        }
        System.out.println("A hipotenusa vale: "+ h + ".");
    }
    
}
