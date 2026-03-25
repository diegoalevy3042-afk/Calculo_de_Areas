
package formulas;


public class trapecio {
    


    private double baseMayor;
    private double baseMenor;
    private double altura;

    // Constructor
    public trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    // calcular el área
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    //  mostrar resultado
    public void mostrarArea() {
        System.out.println("El área del trapecio es: " + calcularArea());
    }
    
}

    

