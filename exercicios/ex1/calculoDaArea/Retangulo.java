package calculoDaArea;

public class Retangulo implements AreaCalculavel {

    private Double lado;
    private Double altura;
    
    public Retangulo (Double lado, Double altura) {
        this.lado = lado;
        this.altura = altura;
    }
    
    public Double calculoDaArea() {
        Double area = lado * altura;
        return area;
    }
    
}
