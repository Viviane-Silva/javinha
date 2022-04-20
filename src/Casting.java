// public class Casting {

//     public static void main(String[] args) {

//         int a = 1;
//         double b = 2.3;
//         double soma = a + b;

//         System.out.println("O resultado da soma é " + soma);
//     }
// }

public class Casting {

    public static void main(String[] args) {

        // gerando um downcast
        // obs, todo downcast tem que ter seu tipo informado
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        // gerando um upcast
        long l1;
        int i1 = 100;
        l1 = i1;
    }
}