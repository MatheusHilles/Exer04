
package Retangulo;

import javax.swing.JOptionPane;


public class AppQuestao3Ui {
    
    public static void main(String[] args) {
        
        
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura do Retângulo")); 
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura do seu comprimento"));
         
        
        try {
            Retangulo ret2 = new Retangulo(altura, comprimento);
        //ret.setAltura(altura);
        //ret.setComprimento(comprimento);
        JOptionPane.showMessageDialog(null, "Aréa do Triangulo é: " + ret2.calcularArea(altura, comprimento ));
        JOptionPane.showMessageDialog(null, "O perimetro do Triangulo é: " + ret2.calcularPerimetro(altura, comprimento));
            
        } catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
      
        
        
    }
    
}
