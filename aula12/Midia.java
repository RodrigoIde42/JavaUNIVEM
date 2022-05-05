package aula12;

import java.util.Random;
import java.util.Scanner;

public class Midia {

    private int codigo;
    private double preco;
    private String nome;
    Random r = new Random();
    Scanner scan = new Scanner(System.in);

    public Midia() {
        this.codigo = r.nextInt(100);
        this.preco = r.nextDouble() * 100;
        this.nome = "";
    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo() {
        return this.nome;
    }

    public String getDetalhes() {
        return "Código: " + this.codigo + "\nPreço: " + this.preco + "\nNome: " + this.nome;
    }

    public void printDados() {
        System.out.println("Tipo: " + getTipo() + "\n" + getDetalhes());
    }

    public void inserirDados() {
        System.out.println("Digite o nome da classificação: ");
        this.nome = scan.nextLine();
        System.out.println("Digite o preço: ");
        this.preco = scan.nextDouble();
        scan.nextLine();
        System.out.println("Digite o código: ");
        this.codigo = scan.nextInt();
    }
    
}
