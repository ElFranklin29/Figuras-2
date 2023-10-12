package figuras2;

public class Trectangulo extends Triangulo {

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

    public Trectangulo() {
        this.perimetro = 0;
        this.area = 0;
    }

    public Trectangulo(double perimetro, double area, double A, double B, double C, Punto2D[] vertices, int aux,
            int px, int py) {
        super(A, B, C, vertices, aux, px, py);
        this.perimetro = perimetro;
        this.area = area;
    }

    @Override
    public int Area() {
        this.calcularDistancias();
        double base, altura;
        base = this.getC();   
        altura = this.getA();
        area = (this.getC() * this.getA());
        System.out.println("Area del triangulo rectangulo : " + area);
        return (int) area;
    }

    @Override
    public int Perimetro() {
        perimetro = (this.getA() + this.getB() + this.getC());
        System.out.println("Perimetro del triangulo rectantulo =" + perimetro + "\n");
        return (int) perimetro;
    }
}
