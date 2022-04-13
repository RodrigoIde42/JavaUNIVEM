package aula08;

public class Exerc12 {
    private int num;
    private float saldo;

    public Exerc12(int num, float saldo) {
        this.num = num;
        this.saldo = saldo;
    }

    public void setNum(int num){
        this.num = num;
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
