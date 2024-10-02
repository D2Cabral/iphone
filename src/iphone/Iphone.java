package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutoMusical;

public class Iphone implements ReprodutoMusical, AparelhoTelefonico,NavegadorInternet{

    @Override
    public void tocar() {
       System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusicas(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println(" Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador.");

    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual.");
    }


    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.ligar("1799788888");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.selecionarMusicas("Country Roads");
        iphone.tocar();
        iphone.pausar();
        

        iphone.exibirPagina("www.g1.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }



}
