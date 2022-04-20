public class Calculadora {

    public static void soma(double n1, double n2) {

        double resultado = n1 + n2;
        System.out.println("A soma  de " + n1 + " mais " + n2 + " é: " + resultado);
    }

    public static void subtracao(double n1, double n2) {

        double resultado = n1 - n2;
        System.out.println(n1 + " menos " + n2 + "  é igual a: " + resultado);
    }

    public static void multi(double n1, double n2) {

        double resultado = n1 * n2;
        System.out.println(n1 + " multiplicado por " + n2 + " é igual a: " + resultado);
    }

    public static void divisao(double n1, double n2) {

        double resultado = n1 / n2;
        System.out.println(n1 + " dividido por " + n2 + " é igual a: " + resultado);
    }
}
