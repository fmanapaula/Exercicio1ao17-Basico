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
public class Ex_7 {
    public static void main (String args[]){
        double c,l,h,v;
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do paralelepipedo"));
        l = Double.parseDouble(JOptionPane.showInputDialog("Insira o largura do paralelepipedo"));
        h = Double.parseDouble(JOptionPane.showInputDialog("Insira o altura do paralelepipedo"));
        {
            v = h*c*l;
        }
        System.out.println("O volume do paralelepipedo eh:"+v+" m3.");
    }
    
}
