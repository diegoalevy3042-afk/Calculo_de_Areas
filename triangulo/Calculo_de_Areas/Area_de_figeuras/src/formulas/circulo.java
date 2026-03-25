package formulas;

/**
 *
 * @author Pc29
 */

public class circulo {
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }
    
//Utilizamos el metodo Math especializado en calculos matematicos
//Biene por default en java.
    
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
} 


