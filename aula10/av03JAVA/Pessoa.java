package aula10.av03JAVA;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.altura = 0;
    }

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
