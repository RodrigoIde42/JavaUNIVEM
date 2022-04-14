package aula01;

import aula03.*;
import aula04.*;
import aula06.Conta;
import aula07.*;
import aula08.*;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.print("\033\143");

        System.out.println("Choose your destiny or 0 to quit: ");
        System.out.println("1 - 17");
        int op = scan.nextInt();

        switch (op) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                new Exerc01();
                break;
            case 2:
                new Exerc02();
                break;
            case 3:
                new Exerc03();
                break;
            case 4:
                new Exerc04();
                break;
            case 5:
                new Exerc05();
                break;
            case 6:
                new Exerc06();
                break;
            case 7:
                new Exerc07();
                break;
            case 8:
                new Strings();
                break;
            case 9:
                new Array();
                break;
            case 10:
                new Exerc08();
                break;
            case 11:
                new Exerc09();
                break;
            case 12:
                new Exerc10();
                break;
            case 13:
                new Aula07_01();
                break;
            case 14:
                Lampada l1 = new Lampada("Incandescente");
                l1.setPotencia(40);
                System.out.println(l1);
                Interruptor i1 = new Interruptor();
                i1.Conectar(l1);
                System.out.println(i1);
                i1.Ligar();
                System.out.println(l1);
                i1.Desligar();
                System.out.println(l1);
                break;
            case 15:
                String name = JOptionPane.showInputDialog("Qual o seu nome?");
                int answer = JOptionPane.showConfirmDialog(null, "Seu nome é: " + name + "?");
                if (answer == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Nome Correto!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nome Incorreto!"           );
                }
                break;
            case 16:
                Exerc11 car = new Exerc11("CarroNome", "CarroMarca", 2002, 50.4);

                car.imprimir();
                car.acelerar(10);
                car.imprimir();
                car.frear(10);
                car.imprimir();
                car.buzinar();
                break;
            case 17:
                Exerc12 conta = new Exerc12(1700.2f);
                Exerc12 conta2 = new Exerc12(1500.2f);

                conta.setSaldo(1800.8f);
                conta2.setSaldo(1500.2f);

                System.out.println(conta.getNum());
                System.out.println(conta.getSaldo());
                System.out.println(conta2.getNum());
                System.out.println(conta2.getSaldo());

                System.out.println(conta.getCont());

                conta.credito(150.3f);
                System.out.println("Você inseriu: " + 150.3f + "\nSeus dados são:");
                conta.dados();
                conta.debito(180.2f);
                System.out.println("Você retirou: " + 180.2f + "\nSeus dados são:");
                conta.dados();
                break;
            default:
                System.out.println("Unknown option!");
                break;
        }

        Thread.sleep(5000);

        System.out.print("\033\143");

        scan.close();

        Conta c1 = new Conta("750", 100.00);

        c1.credito(100.00);
        c1.debito(50.00);

        String name = JOptionPane.showInputDialog("Qual seu nome?");
        JOptionPane.showMessageDialog(null, "Seu nome é: " + name + " e seu saldo é: " + c1.saldo);
        int opt = JOptionPane.showConfirmDialog(null, "Seu nome realmente é: " + name + "?");

        if (opt == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Ufa, belo nome!", "Belo nome!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Teu nome n é esse", "Errou o próprio nome!!", JOptionPane.ERROR_MESSAGE);
        }

    }
}