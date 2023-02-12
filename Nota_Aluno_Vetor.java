/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota_aluno_vetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Nota_Aluno_Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numNotas = "";
        int vetorNotas;
        int valornotas = 0;
        float media = 0;
        
        Integer notas[] = new Integer[4];
        for(int i = 1; i <= notas.length; i++){
        numNotas = JOptionPane.showInputDialog("Notas do aluno", i);
        vetorNotas = (int) Float.parseFloat(numNotas);
        notas[i] = vetorNotas;
        //valornotas =+ notas[i];
        }
        
        media = notas[1] + notas[2] + notas[3] + notas[4] /4;
        JOptionPane.showMessageDialog(null,media);
    }
    
}
