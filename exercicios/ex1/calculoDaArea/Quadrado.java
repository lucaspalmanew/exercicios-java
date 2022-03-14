package calculoDaArea;

public class Quadrado implements AreaCalculavel {

    private Double lado;

    public Quadrado (Double lado) {
        this.lado = lado;
    }

    public Double calculoDaArea() {
        Double area = lado * lado;
        return area;
    }
}