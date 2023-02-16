/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author aluno
 */
public class Formulario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame janela = new JFrame("Formulario");
        janela.setBounds(100, 400, 700, 300);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        JLabel nomeProfessor = new JLabel();
        nomeProfessor.setText("Nome");
        
        JTextArea caixaParaNome = new JTextArea(1,20);
        
        JTextArea caixaParaCPF = new JTextArea(1, 20);
        
        JLabel cpf = new JLabel();
        cpf.setText("cpf");
        
        final JPasswordField senha = new JPasswordField();   
        senha.setSize(20, 20);
        
        FlowLayout flow = new FlowLayout();
        Container caixa = janela.getContentPane();
        caixa.setLayout(flow);
             
        
        janela.add(nomeProfessor);
        janela.add(caixaParaNome);
        
        janela.add(cpf);
        janela.add(caixaParaCPF);
        
        janela.add(senha);
        
        
        janela.setVisible(true);
    }
    
}
