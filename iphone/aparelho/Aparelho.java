package iphone.aparelho;

import iphone.aplicativos.AparelhoTelefonico;
import iphone.aplicativos.NavegadorInternet;
import iphone.aplicativos.ReprodutorMusical;

public class Aparelho implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
        System.out.println("Pagina atualizada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println(url);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligacao!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

}
