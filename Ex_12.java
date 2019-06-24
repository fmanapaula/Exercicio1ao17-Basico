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
public class Ex_12 {
    public static void main(String args []){
        int a_nas,a_atual,id,id_fut;
        a_nas = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento:"));
        a_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
        {
            id = a_atual - a_nas;
            id_fut = id + 17;
        }
        System.out.println("Atualmente você possui: "+id+". E daqui a 17 anos você terá: "+ id_fut+ " anos.");
    }
    
}
