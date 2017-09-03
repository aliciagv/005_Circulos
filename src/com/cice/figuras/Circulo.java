/*
 *  Esta clase definirá las operaciones sobre un circulo
 * Recibirá un argumento de entrada (radio) y deberá calcular el area y perímetro
 * Atributos locales -> radio, area, perímetro
 * metodos de la clase -> calcularArea, calcularPerimetro
 * area= PI* FADIO ^2
 * perimetro =2 * PI* radio
 */
package com.cice.figuras;

/**
 *
 * @author Alicia
 */
public class Circulo {
    
    private double radio;
    private double perimetro;
    private double area;
    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double  cacularArea(){
       area=0;
       area= Math.PI * (Math.pow(radio, 2));
       return area;
    }
    
    public double calcularPerimetro(){
        perimetro=0;
        perimetro= 2 * Math.PI*radio;
        return perimetro;
    }
    
    
}
