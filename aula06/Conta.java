package aula06;

public class Conta {
    
    public String numero;
    public double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void credito(double valor){
        saldo += valor;
    }

    public void debito(double valor){
        saldo -= valor;
    }

}
