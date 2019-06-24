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
public class Ex_2 {
    public static void main (String args []){
        double sal,nsal;
        sal = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário do funcionário:"));
        {
            nsal= sal - (sal*0.15);
        }
        System.out.println (" o Salario reajustado eh:"+ nsal+ " reais.");
}
}
