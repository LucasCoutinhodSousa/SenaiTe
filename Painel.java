/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painel;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author aluno
 */
public class Painel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame miJFrame = new JFrame("Ejemplo - Java Swing");
        miJFrame.setSize(500, 300);
        
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);
        
        miJPanel.setLayout(new GridBagLayout());
        
        JLabel miJLabel = new JLabel();
        miJLabel.setText(" Dime tu opinion acerca");
        
        JTextArea miJTextArea = new JTextArea(5, 20);
        
        miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);
        miJFrame.add(miJPanel);
        
        miJFrame.setVisible(true);
        
    }
    
}
