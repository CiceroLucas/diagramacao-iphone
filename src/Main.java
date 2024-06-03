public class Main {
    public static void main(String[] args) {
        IPhone aparelho = new IPhone();

        aparelho.selecionarMusica("Sepultura");
        aparelho.tocar();
        aparelho.pausar();

        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        aparelho.ligar(12345678);

        aparelho.exibirPagina();
        aparelho.atualizarPagina();
        aparelho.adicionarNovaAba();
    }
}
