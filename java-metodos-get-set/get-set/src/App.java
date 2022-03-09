import classes.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(200);
        System.out.println(conta.getSaldo());
    }
}
