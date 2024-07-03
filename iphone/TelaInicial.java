package iphone;

import iphone.aparelho.Aparelho;

public class TelaInicial {
    
    public static void main(String[] args) {
        Aparelho iphone = new Aparelho();


        //metodos de ligacao

        iphone.ligar("81 985541891");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //metodos de musica

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Vultures - Kanye West");

        //metodos de internet

        iphone.exibirPagina("Google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
    


}
