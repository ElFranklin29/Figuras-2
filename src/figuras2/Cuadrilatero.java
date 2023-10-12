package figuras2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public abstract class Cuadrilatero extends JPanel implements Figura {

    Punto2D vertices[];
    protected int aux, px, py;
    String titulo;
    protected double A, B, C, D;

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getD() {
        return D;
    }

    public void setD(double D) {
        this.D = D;
    }

    public Punto2D[] getVertices() {
        return vertices;
    }

    public void setVertices(Punto2D[] vertices) {
        this.vertices = vertices;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public Cuadrilatero(Punto2D[] vertices, int aux, int px, int py, String titulo, double A, double B, double C, double D) {
        this.vertices = vertices;
        this.aux = aux;
        this.px = px;
        this.py = py;
        this.titulo = titulo;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    
    public Cuadrilatero() {
        this.vertices = new Punto2D[4];
        this.aux = 0;
        this.px = 0;
        this.py = 0;
        this.titulo = " ";
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
    }

  
    
    public void calcularPuntos(){
          vertices = new Punto2D[4];
        for (int conta = 0; conta < 4; conta++) {
            aux = conta + 1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del vertice " + aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada Y del vertice " + aux));
            vertices[conta] = new Punto2D(px, py);
            this.setVertices(vertices);
    
    }
    }
    public void calcularDistancias(){
        
        A = (float) Math.sqrt((Math.pow((vertices[1].getX() - vertices[0].getX()), 2))
                + (Math.pow((vertices[1].getY() - vertices[0].getY()), 2)));
        this.setA(A);
        B = (float) Math.sqrt((Math.pow((vertices[2].getX() - vertices[1].getX()), 2))
                + (Math.pow((vertices[2].getY() - vertices[1].getY()), 2)));
        this.setB(B);
        C = (float) Math.sqrt((Math.pow((vertices[3].getX() - vertices[2].getX()), 2))
                + (Math.pow((vertices[3].getY() - vertices[2].getY()), 2)));
        this.setC(C);
        D = (float) Math.sqrt((Math.pow((vertices[0].getX() - vertices[3].getX()), 2))
                + (Math.pow((vertices[0].getY() - vertices[3].getY()), 2)));
        this.setD(D);
    }

    

    @Override
    public abstract int Area();

    @Override
    public abstract int Perimetro();
    

    
    
 @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.ORANGE);
        g.drawLine(vertices[1].getX() * 60, vertices[1].getY() * 60,
                vertices[0].getX() * 60, vertices[0].getY() * 60);
        g.drawLine(vertices[2].getX() * 60, vertices[2].getY() * 60,
                vertices[1].getX() * 60, vertices[1].getY() * 60);
        g.drawLine(vertices[3].getX() * 60, vertices[3].getY() * 60,
                vertices[2].getX() * 60, vertices[2].getY() * 60);
        g.drawLine(vertices[0].getX() * 60, vertices[0].getY() * 60,
                vertices[3].getX() * 60, vertices[3].getY() * 60);

    }
    
    
    
 
}
