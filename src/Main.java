import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Iphone iphone = new Iphone("Apple", "15", "preto");

        System.out.println("1- tocar ; 2- pausa ; 3- selecionar;\n" +
                           "4- ligar; 5- atender; 6- correio de voz;\n" +
                            "7- exibir pagina; 8- nova aba; 9- atualizar pagina;");

        System.out.print("Digite uma opcao: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                iphone.tocar();
                break;
            case 2:
                iphone.pausar();
                break;
            case 3:
                iphone.selecionarMusica();
                break;
            case 4:
                iphone.ligar();
                break;
            case 5:
                iphone.atender();
                break;
            case 6:
                iphone.iniciarCorreioVoz();
                break;
            case 7:
                iphone.exibirPagina();
                break;
            case 8:
                iphone.adicionarNovaAba();
                break;
            case 9:
                iphone.atualizarPagina();
                break;
            default:
                System.out.println("Comando nao reconhecido");
        }
    }
}