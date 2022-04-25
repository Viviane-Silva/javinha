import java.util.Scanner;

/* Faça um programa que leia 5 números e informe o maior número
e a média desses npumeros*/

public class Loop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int count = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            ++count;
        } while (count < 5);
    }
}
