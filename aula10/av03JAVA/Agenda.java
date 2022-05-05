package aula10.av03JAVA;

import java.util.ArrayList;

public class Agenda {

    private int index = 1;
    private ArrayList<Pessoa> pessoas;
    private Pessoa pessoa;

    public Agenda() {
        this.pessoas = new ArrayList<>();
    }

    public void armazenaPessoa(String nome, int idade, float altura) {
        if (pessoas.size() != 10) {
            this.pessoa = new Pessoa(nome, idade, altura);
            pessoas.add(this.pessoa);
        } else
            System.out.println("Agenda cheia!");
    }

    public void removePessoa(String nome) {
        if (pessoas.size() != 0) {
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getNome().equalsIgnoreCase(nome)) {
                    pessoas.remove(pessoa);
                    System.out.println("Pessoa removida com sucesso!");
                    return;
                }
            }
            System.out.println("Não existe pessoa com esse nome!");
        } else
            System.out.println("Agenda vazia!");
    }

    public void buscaPessoa(String nome) {
        if (pessoas.size() != 0) {
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(pessoa.getNome() + " " + pessoa.getIdade() + " " + pessoa.getAltura());
                    return;
                }
            }
            System.out.println("Não encontrado!");
        }
        else
            System.out.println("Agenda vazia!");
    }

    public void imprimeAgenda() {
        if (pessoas.size() != 0) {
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa.getNome() + " " + pessoa.getIdade() + " " + pessoa.getAltura());
            }
        } else
            System.out.println("Agenda vazia!");
    }

    public void imprimePessoa(int i) {
        if (pessoas.size() != 0) {
            for (Pessoa pessoa : pessoas) {
                if (index == i) {
                    System.out.println(pessoa.getNome() + " " + pessoa.getIdade() + " " + pessoa.getAltura());
                    return;
                }
                index++;
            }
            System.out.println("Não encontrado!");
        }
        else
            System.out.println("Agenda vazia!");

    }

}
