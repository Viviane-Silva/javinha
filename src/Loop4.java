import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNum;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNum = scan.nextInt();
        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            } else
                quantImpares++;

            count++;
        } while (count < quantNum);

        System.out.println("Quantidade de Pares: " + quantPares);
        System.out.println("Quantidade de Ímpares: " + quantImpares);
    }

}
