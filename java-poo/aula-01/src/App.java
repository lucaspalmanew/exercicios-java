public class App {
    public static void main(String[] args) throws Exception {
        //iphone 12, tela de 6.1', 256gb
        //galaxy note 20 ultra, tela de 6.9', 128gb
        //xiaomi mi 11 pro. tela de 6.81', 128gb
        
        //declarando um objeto do tipo celular = instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        celularA.encerrandoLigacao("encerrando");
    }
}
