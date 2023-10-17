public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String marca;
    private String modelo;
    private String cor;

    public Iphone(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }


    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixar correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina");
    }
}
