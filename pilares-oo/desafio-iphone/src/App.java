import org.desafio.aparelho.Iphone;
import org.desafio.funcoes.AparelhoTelefone;
import org.desafio.funcoes.NavegadorInternet;
import org.desafio.funcoes.ReprodutorMusical;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        AparelhoTelefone at = iphone;
        NavegadorInternet ni = iphone;
        ReprodutorMusical rm = iphone;

        at.atender();
        at.ligar();
        at.iniciarCorreioVoz();
        System.out.println();
        ni.adicionarNovaAba();
        ni.exibirPagina();
        ni.atualizarPagina();
        System.out.println();
        rm.selecionarMusica();
        rm.tocar();
        rm.pausar();
        System.out.println();
    }
}
