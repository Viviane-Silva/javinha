// usando essa classe como principal para executar os outros medotodos
// das outras classes.

public class Metodos {

    public static void main(String[] args) {

        // calculos
        Calculadora.soma(3, 6);
        Calculadora.subtracao(3, 6);
        Calculadora.multi(3, 6);
        Calculadora.divisao(3, 6);

        // mensagem
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(19);

        // empréstimo
        Emprestimo.calculaTaxa(100, 3);
        // Emprestimo.calculaTaxa(500, Emprestimo.getTaxaDuasParcelas());
        Emprestimo.calculaTaxa(500, 10);
    }
}