/*
 * Esta clase sse va a encargar de crear el objeto Circulo, inicianizandolo con el radio
 * y pintará por pantalla los resultados del área y del perímetro
 */
package com.cice.principal;

import com.cice.figuras.Circulo;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio=0;
        
        System.out.println("CALCULADORA AREA Y PERIMETRO DE UN CIRCULO");
        System.out.println("============================================");
        boolean radioOk=false;
        do {
            System.out.print("Introduce el radio del circulo: ");
            if (sc.hasNextDouble()) {
                radio = sc.nextDouble();
                radioOk=true;
            } else {
                sc.next();
                System.out.println("Debe introducir un número");
            
            }
        } while (!radioOk);
        Circulo circulo = new Circulo(radio);
        System.out.println("El perímetro de un circulo de radio: " + circulo.getRadio() + " es :" + circulo.calcularPerimetro());
        System.out.println("El área de un circulo de radio: " + circulo.getRadio() + " es :" + circulo.cacularArea());
    }

}
