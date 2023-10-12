package figuras2;



public class Isosceles extends Triangulo {

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

    public Isosceles() {
        this.perimetro = 0;
        this.area = 0;
    }

    public Isosceles(double perimetro, double area, double A, double B, double C, Punto2D[] vertices, int aux,
            int px, int py) {
        super(A, B, C, vertices, aux, px, py);
        this.perimetro = perimetro;
        this.area = area;
    }

    @Override
    public int Area() {
        this.calcularDistancias();
        double cateto1, altura;
        cateto1 = this.getC() / 2;
        altura = Math.sqrt((Math.pow(this.getA(), 2)) - (Math.pow(cateto1, 2)));
        area = ((this.getC() * altura) / (2));
        System.out.println("Isosceles");
        System.out.println("Area del isosceles =" + area);
        return (int) area;
    }

    @Override
    public int Perimetro() {
        perimetro = (this.getA() + this.getB() + this.getC());
        System.out.println("Perimetro del isosceles =" + perimetro + "\n");
        return (int) perimetro;
    }

}
