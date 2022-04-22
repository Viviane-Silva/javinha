// usando essa classe como principal para executar os outros medotodos
// das outras classes.

public class Metodos {

    public static void main(String[] args) {

        // // calculos
        // Calculadora.soma(3, 6);
        // Calculadora.subtracao(3, 6);
        // Calculadora.multi(3, 6);
        // Calculadora.divisao(3, 6);

        // // mensagem
        // Mensagem.obterMensagem(9);
        // Mensagem.obterMensagem(15);
        // Mensagem.obterMensagem(19);

        // // empréstimo
        // Emprestimo.calculaTaxa(100, 3);
        // // Emprestimo.calculaTaxa(500, Emprestimo.getTaxaDuasParcelas());
        // Emprestimo.calculaTaxa(500, 10);

        // // sobrecargas
        // Sobrecarga.area(3);
        // Sobrecarga.area(5, 5);
        // Sobrecarga.area(2, 4, 7);
        // Sobrecarga.area(5, 5);

        // retorno
        double areaRetangulo = Retorno.area(5, 3);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaQuadrado = Retorno.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaTrapezio = Retorno.area(4, 5, 3);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}