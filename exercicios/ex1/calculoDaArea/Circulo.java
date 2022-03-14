package calculoDaArea;

public class Circulo implements AreaCalculavel {

    private Double pi = 3.14;
    private Double raio;

    public Circulo (Double raio) {
        this.raio = raio;
    }

    public Double calculoDaArea() {
        Double area = pi * Math.pow(raio, 2);
        return area;
    }


}
