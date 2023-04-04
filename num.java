import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero;

        System.out.print("Digite um número: ");
        numero = teclado.nextDouble();

        System.out.print("O número informado foi " + numero);


        teclado.close();
    }



}