public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
	}

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
	}

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando historico pelo Telegram");
    }
    
}
