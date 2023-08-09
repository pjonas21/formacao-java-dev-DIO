import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int parametroUm = scan.nextInt();
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }

        scan.close();
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) throw new ParametrosInvalidosException();
        
        int contagem = num2 - num1;

        for(int i=0; i < contagem; i++) {
            System.out.println(i);
        }
    }
    
}
