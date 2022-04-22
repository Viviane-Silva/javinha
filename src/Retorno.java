public class Retorno {

    // o método não é mais void e sim um retorno.
    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    // simulando um erro
    // public static int area() {
    // return 1.6f;
    // }
    // no caso de declarar o retorno como int, ao colocar o 1.6f(float) o método não
    // aceita, da um erro na excução.

}
