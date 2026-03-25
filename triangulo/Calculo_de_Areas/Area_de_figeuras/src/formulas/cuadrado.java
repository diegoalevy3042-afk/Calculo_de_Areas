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
public class Cuadrado {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        return lado * lado;
    }

    // Getters y Setters (opcional, para cambiar el lado después)
    public void setLado(double lado) {
        this.lado = lado;
    }
}
}

