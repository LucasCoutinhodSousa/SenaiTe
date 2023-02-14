/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa_de_mensagem;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author aluno
 */
public class Caixa_De_Mensagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame janela = new JFrame("Janela inicio");
        janela.setBounds(50,50,50,50);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        FlowLayout flow = new FlowLayout();
        
        Container caixa = janela.getContentPane();
        caixa.setLayout(flow);
        
       caixa.add(new JButton());
       JOptionPane.showMessageDialog(janela,"MEnsage", "Titu", JOptionPane.WARNING_MESSAGE);
       //janela.setVisible(true);
    }
    
}
