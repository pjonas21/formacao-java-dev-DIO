package org.desafio.aparelho;

import org.desafio.funcoes.AparelhoTelefone;
import org.desafio.funcoes.NavegadorInternet;
import org.desafio.funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefone, NavegadorInternet, ReprodutorMusical {

    @Override
    public void atender() {
       System.out.println("Atendendo ligação via iPhone...");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz via iPhone...");
        
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação via iPhone...");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba navegador internet via iPhone...");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página navegador internet via iPhone...");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página navegador internet via iPhone...");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música via iPhone...");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música via iPhone...");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música via iPhone...");
        
    }
    
}
