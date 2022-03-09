package classes;

public class Quadrado implements FiguraGeometrica {
    //atributo
    private int lado;
    //construtor
    public Quadrado(int lado) {
        this.lado = lado;
    }
    // metodo especifico
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
