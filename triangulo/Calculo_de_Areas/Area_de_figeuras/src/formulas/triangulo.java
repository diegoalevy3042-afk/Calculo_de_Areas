
package formulas;

/**
 *
 * @author Pc32
 */
public class triangulo {
    
  
    protected double base;
    protected double altura;

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public class CalculoTriangulo extends triangulo {

    public CalculoTriangulo(double base, double altura) {
        super(base, altura);
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}
}

