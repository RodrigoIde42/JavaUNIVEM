package aula03;

public class Exerc02 {
    
    public Exerc02() {

        System.out.println("Exercício 02");

        for (int i = 100; i >= 50; i-=2) {
            
            System.out.println("Valor >> " + i);
            try { Thread.sleep(250); } catch (Exception e) { }

        }

    }

}
