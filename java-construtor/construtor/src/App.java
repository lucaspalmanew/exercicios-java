import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lucas");
        pessoa.setIdade(22);
        pessoa.setAltura(1.79f);

        System.out.format("Nome: %s, Idade: %d anos e Altura %.2fm", pessoa.getNome(),pessoa.getIdade(), pessoa.getAltura());
         
    }
}
