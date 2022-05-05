package aula12;

import java.util.Random;

public class DVD extends Midia {
    
    private int nFaixas;
    Random r = new Random();

    public DVD() {
        this.nFaixas = r.nextInt(20);
    }

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    public String getDetalhes() {
        return "\nNúmero de faixas: " + this.nFaixas;
    }

    public void setFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    public void inserirDados() {
        super.inserirDados();
        System.out.println("Digite o número de faixas: ");
        this.nFaixas = scan.nextInt();
        scan.close();
    }

}
