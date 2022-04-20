package aula07;

public class Aula07_01 {
    
    public Aula07_01() {

        Pessoa amigo = new Pessoa("Rodrigo", 19, "(14) 93618-0681");

        amigo.newPhone("(14) 93618-0681");
        amigo.newPhone();

        new Aula07_02();
        new Aula07_02(100);

        Aula07_03 obj = new Aula07_03();
        System.out.println("Método construtor falso: " + obj.aula07_03());

    }

}
