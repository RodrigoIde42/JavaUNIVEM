package aula04;

import java.util.Random;
import java.util.Scanner;

public class Exerc10 {
    
    public Exerc10() {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        int[][] A = new int[3][5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                A[i][j] = random.nextInt(100);

        System.out.println("Matriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
        
        int x = scan.nextInt();

        if (x % 2 == 0) {
            System.out.println("x é par");
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 5; j++)
                    if (A[i][j] % 2 == 0)
                        System.out.println("A[" + i + "][" + j + "] = " + A[i][j]);
        } else {
            System.out.println("x é ímpar");
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 5; j++)
                    if (A[i][j] % 2 != 0)
                        System.out.println("A[" + i + "][" + j + "] = " + A[i][j]);
        }

        scan.close();

    }

}
