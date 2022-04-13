package aula07;

public class Aula07_01 {
    
    public Aula07_01() {

        Pessoa amigo = new Pessoa("Rodrigo", 19, "(14) 93618-0681");

        amigo.newPhone("(14) 93618-0681");
        amigo.newPhone();

        Aula07_02 conta = new Aula07_02();
        Aula07_02 conta2 = new Aula07_02(100);

        Aula07_03 obj = new Aula07_03();
        System.out.println("Método construtor falso: " + obj.Aula07_03());

    }

}
