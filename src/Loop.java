import java.util.Scanner;

// package java1.loops.src;

// Exercícios de loops
/*
 * Faça um programa que leia conjunto de dois valores.
 * O primeiro representando o nome do aluno e o segundo representando a sua
 * idade.
 * (Para o programa inserindo o valor 0 no campo nome)
 */

public class Loop {

    public static void main(String[] args) {
        // leia o que foi digitado pelo teclado
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {

            System.out.println("Nome: ");
            // método next retorna uma string, que será atribuida a variavel nome
            nome = scan.next();
            if (nome.equals("0")) {
                System.out.println("Fim");
                break;
            }
            System.out.println("Idade: ");
            // nextInt para usar a variável como inteiro
            idade = scan.nextInt();

        }
    }
}
// dica: ctrl+d duplica a linha