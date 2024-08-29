/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retangulo;

/**
 *
 * @author mathillesheim
 */
public class Retangulo {
    private int altura;
    private int comprimento;
    
    public Retangulo(){}

    public Retangulo(int comprimento, int altura) {
        setAltura(altura);
        setComprimento(comprimento);
        

}

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura <= 0) {
            throw new IllegalArgumentException("Valor está incorreto na altura");
        }
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if(comprimento <= 0){
            throw new IllegalArgumentException("Valor está incorreto no comprimento");
        }
        this.comprimento = comprimento;
    }
    
    public int calcularPerimetro(int altura, int comprimento) {
        return (altura * 2) + (comprimento * 2);
    }
    
    public int calcularArea(int altura, int comprimento) {
        return altura * comprimento;
    }
}
