package aula04;

import java.util.Scanner;

public class Array {
    
    public Array() {

        Scanner scan = new Scanner(System.in);

        String[] array = new String[3];
        Integer[] array2 = new Integer[3];
        float array3[] = new float[3];
    
        System.out.println("Array com 3 valores");
        System.out.println("Digite seu nome: ");
        array[0] = "Nome: " + scan.nextLine();
        System.out.println("Digite seu telefone: ");
        array[1] = "Telefone: " + scan.nextLine();
        System.out.println("Digite seu endereço: ");
        array[2] = "Endereço: " + scan.nextLine();
        for (int i = 0; i < 3; i++) {
            array3[i] = i+.1f;
        }
        for (int i = 0; i < 3; i++) {
            array2[i] = i+1;
        }

        System.out.println("Informações do Usuário: ");
        for (String info : array) {
            System.out.println(info);
        }
        for (float f : array3) {
            System.out.println(f);
        }
        for (Integer i : array2) {
            System.out.println(i);
        }

        scan.close();


    }

}
