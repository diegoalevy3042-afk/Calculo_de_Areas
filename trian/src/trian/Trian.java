
package trian;

import java.util.Scanner;


public class Trian {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        double base, altura, area;

        
        
        // Pedir datos
        System.out.print("Ingresa la base del triángulo: ");
        base = sc.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        altura = sc.nextDouble();

        // Calcular área
        area = (base * altura) / 2;

        // Mostrar resultado
        System.out.println("El área del triángulo es: " + area);

        sc.close();
    }
    
}
