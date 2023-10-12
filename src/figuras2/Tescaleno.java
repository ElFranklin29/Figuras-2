package figuras2;

public class Tescaleno extends Triangulo {
    private double perimetro, area;

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

    public Tescaleno() {
        this.perimetro = 0;
        this.area = 0;
    }
    
    public Tescaleno(double perimetro, double area, double A, double B, double C, Punto2D[] vertices, int aux,
            int px, int py) {
        super(A, B, C, vertices, aux, px, py);
        this.perimetro = perimetro;
        this.area = area;
    }
    
@Override
    public int Area() {
        this.calcularDistancias();
        area = Math.sqrt(Math.abs(perimetro * (perimetro) - this.getA() * (perimetro - this.getB()) * (perimetro - this.getC())) );
        System.out.println("Area del triangulo escaleno es : " + area);
        return (int) area;
    }

    @Override
    public int Perimetro() {
        perimetro = (this.getA() + this.getB() + this.getC());
        System.out.println("Perimetro del triangulo escaleno =" + perimetro + "\n");
        return (int) perimetro;
    }
}