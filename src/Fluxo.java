
public class Fluxo {

    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchFerias();
        switchNumero();
    }

    private static void ifFlecha() {
        // efeito flecha

        int mes = 2;

        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        System.out.println("Inválido");
                    }
                }
            }
        }

    }

    private static void ifSemFlecha() {
        // if sem efeito flecha
        int mes = 3;

        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else {
            System.out.println("Abril");
        }
    }

    private static void ifFerias() {

        String mes = "Julho";

        if (mes == "Julho" || mes == "Janeiro") {
            System.out.println("Ferias");
        }
    }

    private static void ifMenor() {

        double salarioMensal = 1300.00d;
        double mediaSalario = 4200d;

        int quantidadeDependentes = 4;
        int mediaDependente = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependente)) {
            System.out.println("Funcionario deve receber auxílio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependente;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Deve receber auxílio");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Deve receber auxílio");
        } else {
            System.out.println("Não deve receber auxílio");
        }
    }

    private static void switchSemana() {

        String dia = "Terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
    }

    private static void switchNumero() {

        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Aqui");
                break;
            case 4:
                System.out.println("Nops");
            default:
                System.out.println("Indefinido aqui");
                break;
        }
    }

    private static void switchFerias() {

        String mes = "Dezembro";
        switch (mes) {
            case "Janeiro":
            case "Fevereiro":
            case "Março":
            case "Abril":
            case "Maio":
            case "Junho":
                System.out.println("Aula");
                break;
            case "Julho":
            case "Dezembro":
                System.out.println("Férias :)");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
    }
}