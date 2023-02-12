/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixadedialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class CaixaDeDialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Olá Mundo");
        
        String n1 = "";
        int nota1 = 0;
        
        String n2 = "";
        int nota2 = 0;
        
        float media = 0;
        
        String alunoFrequente = "";
        int frequencia = 0;
        
        n1 = JOptionPane.showInputDialog("Nota do aluno 1", null);
        nota1 = (int) Float.parseFloat(n1);
        
        n2 = JOptionPane.showInputDialog("Nota do aluno 2", null);
        nota2 = (int) Float.parseFloat(n2);
        
        alunoFrequente = JOptionPane.showInputDialog("Frequencia do Aluno" , null);
        frequencia = (int) Float.parseFloat(alunoFrequente);
        
        media = nota1 + nota2 / 2;
        
        if(media >= 7.5 && frequencia >= 60){
        JOptionPane.showMessageDialog(null, "Aprovado");
        }else{
        JOptionPane.showMessageDialog(null, "Reprovado");
        }
        
    }
    
}
