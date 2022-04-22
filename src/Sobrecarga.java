public class Sobrecarga {

    // o conceito da sobrecarga é que se muda os parâmetros, porém usa-se
    // o mesmo nome do método

    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    // neste caso é necessario mudar o tipo apesar de mudar os parâmetros, ele não
    // aceita mais double
    public static void area(float diagonal1, double diagonal2) {
        System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
    }
}