package aula08;

public class Exerc11 {
    
    private String nome;
    private String marca;
    private int ano;
    private double velocidade;

    public Exerc11(String nome, String marca, int ano, double velocidade) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void acelerar(double velocidade) {
        this.velocidade += velocidade;
    }

    public void frear(double velocidade) {
        this.velocidade -= velocidade;
    }

    public void buzinar() {
        System.out.println("Buzinando...");
        try { Thread.sleep(5000); } catch (Exception e) { }
        System.out.println("Bi bi bi!!");
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }

}
