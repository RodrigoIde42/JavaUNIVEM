package aula04;

import java.util.Random;
import java.util.Scanner;

public class Exerc08 {
    
    public Exerc08() {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];
        int[] arrayB = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Array antes de somar: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\nDigite um valor para somar com o array: ");
        int valor = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < array.length; i++) {
            arrayB[i] = array[i] + valor;
        }

        for (int i : arrayB) {
            System.out.print(i + " ");
        }
        System.out.println();

        scan.close();

    }

}
