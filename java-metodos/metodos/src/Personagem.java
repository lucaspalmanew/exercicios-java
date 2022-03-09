import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus() {
        System.out.format("Personagem: %s (nivel %d) com %d de força\n", nome, nivel, forca);
    }

    int calcularDano() {
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(20);
        int dano = forca + dado20Faces;
        return dano;
    }

    void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano();
        System.out.format("%s atacou %s com %s e causou %d de dano\n", nome, alvo,habilidade, danoCausado);
    }
}
