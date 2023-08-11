public class ComputadorUsuario {
    public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
        System.out.println();
		msn.receberMensagem();

		Telegram telegram = new Telegram();
		System.out.println();
		telegram.enviarMensagem();
        System.out.println();
		telegram.receberMensagem();

		FacebookMessenger fcb = new FacebookMessenger();
		System.out.println();
		fcb.enviarMensagem();
        System.out.println();
		fcb.receberMensagem();
	}
}
