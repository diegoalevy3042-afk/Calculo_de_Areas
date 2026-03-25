package formulas;

/**
 *
 * @author Pc29
 */
public class circulo {
        private double radio;
        
        public circulo(double radio){
        this.radio = radio;
        }
        
        public double calcularArea(){
        return (radio * radio) * 3.1416;
        }

}
