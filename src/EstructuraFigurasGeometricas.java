import javax.swing.JOptionPane;

class Figuras {
    public void AreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + String.format("%.5f", area));
    }

    public void AreaCuadrado(double lado) {
        double area = Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + String.format("%.5f", area));
    }

    public void AreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "El área del triángulo es: " + String.format("%.5f", area));
    }

    public void AreaRectangulo(double base, double altura) {
        double area = base * altura;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + String.format("%.5f", area));
    }

    public void AreaEsfera(double radio) {
        double area = 4 * Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área de la esfera es: " + String.format("%.5f", area));
    }

    public void AreaCubo(double arista) {
        double area = 6 * Math.pow(arista, 2);
        JOptionPane.showMessageDialog(null, "El área del cubo es: " + String.format("%.5f", area));
    }

    public void Resultado() {
        double radio = 5.0;
        double lado = 4.0;
        double base = 6.0;
        double altura = 3.0;
        double arista = 2.0;

        AreaCirculo(radio);
        AreaCuadrado(lado);
        AreaTriangulo(base, altura);
        AreaRectangulo(base, altura);
        AreaEsfera(radio);
        AreaCubo(arista);
    }
}

class Datos {
    private final Figuras figuras;

    public Datos() {
        figuras = new Figuras();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "---- Menú ----\n" +
                    "1. Calcular área del círculo\n" +
                    "2. Calcular área del cuadrado\n" +
                    "3. Calcular área del triángulo\n" +
                    "4. Calcular área del rectángulo\n" +
                    "5. Calcular área de la esfera\n" +
                    "6. Calcular área del cubo\n" +
                    "0. Salir\n" +
                    "Elige una opción:"
            ));

            switch (opcion) {
                case 1:
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
                    figuras.AreaCirculo(radio);
                    break;
                case 2:
                    double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
                    figuras.AreaCuadrado(lado);
                    break;
                case 3:
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo:"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo:"));
                    figuras.AreaTriangulo(base, altura);
                    break;
                case 4:
                    double baseRect = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo:"));
                    double alturaRect = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo:"));
                    figuras.AreaRectangulo(baseRect, alturaRect);
                    break;
                case 5:
                    double radioEsfera = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la esfera:"));
                    figuras.AreaEsfera(radioEsfera);
                    break;
                case 6:
                    double arista = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la arista del cubo:"));
                    figuras.AreaCubo(arista);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }
}

public class EstructuraFigurasGeometricas {
    public static void main(String[] args) {
        Datos datos = new Datos();
        datos.mostrarMenu();
    }
}

