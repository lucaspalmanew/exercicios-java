import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        Circulo circuloPequeno = new Circulo(2);
        double area = circuloPequeno.calcularArea();
        System.out.println(area);

        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.calcularArea());
    }
}
