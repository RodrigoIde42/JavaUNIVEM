package aula04;

import java.util.Scanner;

public class Exerc09 {
    
    public Exerc09() {

        Scanner scan = new Scanner(System.in);

        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] C = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite o valor da matriz A[" + i + "][" + j + "]: ");
                A[i][j] = scan.nextInt();
                System.out.println("Digite o valor da matriz B[" + i + "][" + j + "]: ");
                B[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matriz A: ");
        for (int[] is : A) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz B: ");
        for (int[] is : B) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz C: ");
        for (int[] is : C) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        scan.close();

    }

}
