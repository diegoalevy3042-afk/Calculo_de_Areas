/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulas;

/**
 *
 * @author Pc-28
 */
public class cuadrado {

    private double base;
    private double altura;

    // Constructor que recibe ambos datos
    public cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}


