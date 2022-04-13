package aula03;

import java.util.Scanner;

public class Exerc07 {
    
    public Exerc07(){

        System.out.println("Exercício 07");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite seu telefone: ");
        String telefone = scan.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = scan.nextLine();

        System.out.println("Informações do Usuário: ");

        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);

        scan.close();

    }

}
