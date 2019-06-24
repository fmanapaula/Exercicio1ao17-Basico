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
public class Ex_13 {
    public static void main (String args []){
        double kg,d;
        kg = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimentos em quilos:"));
        {
            d = (kg*1000)/50;
        }
        System.out.println("O Alimento durará: "+d+" dias.");
    }
    
}
