import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);

        int[] vetor = { -5, -4, 10, 0, 12, 4 };

        System.out.println("Vetor:");
        int count = 0;
        while (count < (vetor.length)) {

            System.out.println(vetor[count] + "");
            // break;
            count++;

        }

        System.out.println("\nVetor ordem inversa:");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + "");
        }

        System.out.println("\nVetor em ordem crescente:");
        Arrays.sort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + "");
        }

    }
}
