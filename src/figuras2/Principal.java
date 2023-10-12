package figuras2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

    Figura listado[];
    int opt;

    public Principal() {

    }

    public void MenuPrincipal() {

        String Opciones[] = {"Cuadrilatero", "Triangulo", "Salir"};
        opt = JOptionPane.showOptionDialog(null, "Elija la figura a calcular",
                "Figura", 0, 1, null, Opciones, 0);
        switch (opt) {
            case 0:
                menuCuadrilatero();
                break;
            case 1:
                menuTriangulo();
                break;
            case 2:
                System.exit(0);
                break;

        }

    }

    public void menuCuadrilatero() {

        String Opciones_cuadrilatero[] = {"Cuadrado", "Trapecio"};
        int opt_cuadrilatero = JOptionPane.showOptionDialog(null, "Elija el cuadrilatero a calcular",
                "Cuadrilatero", 0, 1, null, Opciones_cuadrilatero, 0);
            
            switch(opt_cuadrilatero){
                case 0 :
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.calcularPuntos();
            cuadrado.Area();
            cuadrado.Perimetro();
            JFrame ventana1 = new JFrame("Dibujar trapecio");
            ventana1.add(cuadrado);
            ventana1.setSize(400, 400);
            ventana1.setLocationRelativeTo(null);
            ventana1.setVisible(true);
            ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            break;

                case 1:
            Trapecio trapecio = new Trapecio();
            trapecio.calcularPuntos();
            trapecio.Area();
            trapecio.Perimetro();
            JFrame ventana = new JFrame("Dibujar trapecio");
            ventana.add(trapecio);
            ventana.setSize(400, 400);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            break;
            }
        
    

    }

    public void menuTriangulo() {
        String Opciones_cuadrilatero[] = {"Rectangulo", "Isosceles", "Escaleno"};
        int opt_triangulo = JOptionPane.showOptionDialog(null, "Elija el triangulo a calcular",
                "Triangulo", 0, 1, null, Opciones_cuadrilatero, 0);

        switch (opt_triangulo) {
            case 0:
                Trectangulo rectangulo = new Trectangulo();
                rectangulo.calcularPuntos();
                JFrame ventana1 = new JFrame("Dibujar Isosceles");
                ventana1.add(rectangulo);
                ventana1.setSize(400, 400);
                ventana1.setLocationRelativeTo(null);
                ventana1.setVisible(true);
                ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                rectangulo.Area();
                rectangulo.Perimetro();
                break;
            case 1:
                Isosceles isosceles = new Isosceles();
                isosceles.calcularPuntos();
                JFrame ventana = new JFrame("Dibujar Isosceles");
                ventana.add(isosceles);
                ventana.setSize(400, 400);
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                isosceles.Area();
                isosceles.Perimetro();
                break;

            case 2:
                Tescaleno escaleno = new Tescaleno();
                escaleno.calcularPuntos();
                JFrame ventana2 = new JFrame("Dibujar Isosceles");
                ventana2.add(escaleno);
                ventana2.setSize(400, 400);
                ventana2.setLocationRelativeTo(null);
                ventana2.setVisible(true);
                ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                escaleno.Area();
                escaleno.Perimetro();

                break;

        }

    }

    public static void main(String args[]) {

        Principal solucion = new Principal();
        solucion.MenuPrincipal();
    }
}
