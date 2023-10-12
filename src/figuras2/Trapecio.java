
package figuras2;

public class Trapecio extends Cuadrilatero {
     
    private double perimetro, area;

    public Trapecio(double perimetro, double area, Punto2D[] vertices, int aux, int px, int py, String titulo, double A, double B, double C, double D) {
        super(vertices, aux, px, py, titulo, A, B, C, D);
        this.perimetro = perimetro;
        this.area = area;
    }
    
    
   
      
       public Trapecio() {
        this.perimetro = 0;
        this.area = 0;
    }

    
    @Override
    public int Area() {
        this.calcularDistancias();
        double cateto1, altura;
        cateto1= (this.getD()-this.getB())/2;
        altura= Math.sqrt(((Math.pow(this.getC(), 2))-(Math.pow(cateto1, 2))));
        area= ((this.getD()+this.getB())*altura)/2;
        System.out.println("Trapecio");
        System.out.println("Area del trapecio =" + area);
        return (int) area;
    }

  
    @Override
    public int Perimetro() {
        perimetro = (this.getA() + this.getB() + this.getC() + this.getD());
        System.out.println("Perimetro del trapecio =" + perimetro + "\n");
        return (int) perimetro;
    }
    
    public void menu(){
        
    
    }
    
}
