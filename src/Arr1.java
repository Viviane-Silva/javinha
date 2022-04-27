import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Arr1 {
    public static void main(String[] args) {

        // Random para gerar numeros aleatoios
        Random random = new Random();

        int[] numRandom = new int[20];

        for (int i = 0; i < numRandom.length; i++) {
            int num = random.nextInt(100);
            numRandom[i] = num;
        }

        System.out.println("Números aleatorios");
        for (int num : numRandom) {
            System.out.println(num + " ");
        }

        System.out.println("\nNúmeros aleatorios SUCESSORES");
        for (int num : numRandom) {
            System.out.println((num + 1) + " ");
        }

        System.out.println("\nEm ordem");
        Arrays.sort(numRandom);
        for (int num : numRandom) {
            System.out.println((num + 1) + " ");
        }

    }
}
