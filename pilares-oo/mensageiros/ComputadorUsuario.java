public class ComputadorUsuario {
    public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		msn.enviarMensagem();
        System.out.println();
		msn.receberMensagem();
	}
}
