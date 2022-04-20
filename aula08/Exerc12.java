package aula08;

import java.util.Random;

public class Exerc12 {

    private int cont = 1;
    private int num;
    private float saldo;

    Random random = new Random();

    public Exerc12(float saldo) {
        this.num = random.nextInt(100);
        this.saldo = saldo;
        this.cont += 1;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNum() {
        return this.num;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public int getCont() {
        return this.cont;
    }

    public void debito(float valor) {
        this.saldo -= valor;
    }

    public void credito(float valor) {
        this.saldo += valor;
    }

    public void dados() {
        System.out.println("Número: " + this.num);
        System.out.println("Saldo: " + this.saldo);
    }

}
