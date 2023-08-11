public class MSNMessenger {

    /*
     * o encapsulamento serve para esconder atributos
     * e métodos que só precisam existir e acontecer
     * dentro da própria classe
     */

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem();
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
    
}
