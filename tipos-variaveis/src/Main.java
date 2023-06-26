public class Main {
    public static void main(String[] args) {
        double salario = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);
    }
}