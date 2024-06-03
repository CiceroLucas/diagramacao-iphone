public class Main {
    public static void main(String[] args) {
        IPhone aparelho = new IPhone();

        System.out.println("------------->");
        aparelho.selecionarMusica("Sepultura");
        aparelho.tocar();
        aparelho.pausar();

        System.out.println("------------->");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        aparelho.ligar(12345678);

        System.out.println("------------->");
        aparelho.exibirPagina();
        aparelho.atualizarPagina();
        aparelho.adicionarNovaAba();

        System.out.println("------------->");
    }
}
