package figuras2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Cuadrado extends Cuadrilatero {

    private double area, perimetro;

    public Cuadrado(double area, double perimetro, Punto2D[] vertices, int aux, int px, int py, String titulo, double A, double B, double C, double D) {
        super(vertices, aux, px, py, titulo, A, B, C, D);
        this.area = area;
        this.perimetro = perimetro;
    }

    public Cuadrado() {

        this.area = 0;
        this.perimetro = 0;
    }

    @Override
    public int Area() {
        this.calcularDistancias();
        area = (this.getA() * this.getB());
        System.out.println("Cuadrado");
        System.out.println("Area del cuadrado =" + area);
        return (int) area;
    }

    @Override
    public int Perimetro() {
        perimetro = (this.getA() + this.getB() + this.getC() + this.getD());
        System.out.println("Perimetro del cuadrado =" + perimetro + "\n");
        return (int) perimetro;
    }

   

    

}
