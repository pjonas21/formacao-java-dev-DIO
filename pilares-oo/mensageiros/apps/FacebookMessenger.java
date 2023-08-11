public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
	}

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
	}

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando historico pelo Facebook Messenger");
        
    }
    

    
}
