public class App {
    public static void main(String[] args) throws Exception {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3]; 

        p[0] = new Pessoa("Lucas", 22, "M");
        p[1] = new Pessoa("Gustavo", 16, "M");

        l[0] = new Livro("Como influenciar pessoas", "Napoleão Hill", 300, p[0]);
        l[1] = new Livro("Bíblia", "Vários", 1500, p[1]);
        l[2] = new Livro("Java Avançado", "Guanabara", 482, p[0]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
