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
public class Ex_16 {
    public static void main(String args []){
        double ht,vh,pd,sal,sal_liq,sal_nd,cal_pd;
        int nd;
        ht = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas:"));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada:"));
        pd = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de descontos:"));
        nd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes"));
        {
            sal = ht*vh;
            cal_pd = pd / 100;
            sal_liq = sal-(sal*cal_pd);
            sal_nd = sal_liq + (nd*100);
            
        }
        System.out.println("O salário a receber é:"+sal_nd+" reais.");
            
    }
    
}
