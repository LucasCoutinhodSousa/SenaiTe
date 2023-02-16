/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.LEFT;
import static java.awt.FlowLayout.RIGHT;
import java.awt.GridBagLayout;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
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
        
        String anoEscolar[] = {"1 ano", "2 ano", "3 ano"};
        
        JFrame janela = new JFrame("Formulario");
        janela.setBounds(100, 400, 300, 400);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
                
        FlowLayout flow = new FlowLayout();
        Container caixa = janela.getContentPane();
        caixa.setLayout(flow);
        
        JRadioButton masc, fem;
        
        JLabel nomeProfessor = new JLabel();
        nomeProfessor.setText("NOME");
        
        JTextField nome = new JTextField(21);
           
        JLabel cpf = new JLabel();
        cpf.setText("CPF");
        
        JTextField caixaParaCPF = new JTextField(22);
        
        JLabel pass = new JLabel();
        pass.setText("SENHA");
        
        final JPasswordField senha = new JPasswordField(20);  
             
        masc = new JRadioButton("Masculino" , false);
        fem = new JRadioButton("Feminino" , false);
        
        JLabel sexo = new JLabel("Sexo");
        
        JLabel escolhaDoAnoEscolar = new JLabel("Escolha o ano escolar ");
        JComboBox escolaDoAno = new JComboBox(anoEscolar);
        
        
        janela.add(nomeProfessor);
        janela.add(nome);
        
        
        janela.add(cpf);
        janela.add(caixaParaCPF);
        
        janela.add(pass);
        janela.add(senha);
        
        janela.add(sexo);
        janela.add(masc);
        janela.add(fem);
        
        janela.add(escolhaDoAnoEscolar);
        janela.add(escolaDoAno);
        
        janela.add(new JButton("Entrar"));
        
        
        
        
        janela.setVisible(true);
    }    
}
