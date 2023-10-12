package figuras2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public abstract class Triangulo extends JPanel implements Figura {

    protected double A, B, C;

    Punto2D vertices[];

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
    int aux, px, py;

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

    public Triangulo(double A, double B, double C, Punto2D[] vertices, int aux, int px, int py) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.vertices = vertices;
        this.aux = aux;
        this.px = px;
        this.py = py;
    }
    
  

    public Triangulo() {
    
    }
    
       public void calcularPuntos(){
          vertices = new Punto2D[3];
        for (int conta = 0; conta < 3; conta++) {
            aux = conta + 1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del vertice " + aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada Y del vertice " + aux));
            vertices[conta] = new Punto2D(px, py);
            this.setVertices(vertices);
    
    }
       }
    
      

    public void calcularDistancias() {
        A = (float) Math.sqrt((Math.pow((vertices[1].getX() - vertices[0].getX()), 2))
                + (Math.pow((vertices[1].getY() - vertices[0].getY()), 2)));
        this.setA(A);
        B = (float) Math.sqrt((Math.pow((vertices[2].getX() - vertices[1].getX()), 2))
                + (Math.pow((vertices[2].getY() - vertices[1].getY()), 2)));
        this.setB(B);
        C = (float) Math.sqrt((Math.pow((vertices[0].getX() - vertices[2].getX()), 2))
                + (Math.pow((vertices[0].getY() - vertices[2].getY()), 2)));
        this.setC(C);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        int verticeX[]={vertices[0].getX()*60,vertices[1].getX()*60, vertices[2].getX()*60};
        int verticeY[]={vertices[0].getY()*60,vertices[1].getY()*60, vertices[2].getY()*60};
        g.setColor(Color.red);
        g.drawPolygon(verticeX, verticeY, 3);
        

    }
      @Override
    public abstract int Area();

    @Override
    public abstract int Perimetro();
 
        
    }
  

    

