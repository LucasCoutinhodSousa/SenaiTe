/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author aluno
 */
public class Janela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        JFrame janela = new JFrame("Titulo da janela");
        janela.setBounds(50, 400, 400, 120); //posição e tamanho
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        FlowLayout flow = new FlowLayout();
        
        Container caixa = janela.getContentPane();
        caixa.setLayout(flow);
        
        for(i=1; i <= 1000; i++)
        caixa.add(new JButton("Aperte " + i));
        janela.setVisible(true);
       
    }
}
