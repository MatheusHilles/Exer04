
package Retangulo;

import javax.swing.JOptionPane;


public class AppQuestao2Ui {
    
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo();
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura do Retângulo")); 
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura do seu comprimento"));
         
        
        try {
        ret.setAltura(altura);
        ret.setComprimento(comprimento);
        JOptionPane.showMessageDialog(null, "Aréa do Triangulo é: " + ret.calcularArea(altura, comprimento));
        JOptionPane.showMessageDialog(null, "O perimetro do Triangulo é: " + ret.calcularPerimetro(altura, comprimento));
            
        } catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
      
        
        
    }
    
}
