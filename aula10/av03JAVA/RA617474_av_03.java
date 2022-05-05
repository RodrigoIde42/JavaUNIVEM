package aula10.av03JAVA;

public class RA617474_av_03 {
    
    public static void main(String[] args) {
        
        Agenda a = new Agenda();

        a.armazenaPessoa("Rodrigo", 19, 1.70f);
        a.armazenaPessoa("João", 20, 1.80f);
        a.armazenaPessoa("Maria", 21, 1.90f);
        a.armazenaPessoa("José", 22, 1.70f);
        a.armazenaPessoa("Thaís", 40, 1.68f);
        a.armazenaPessoa("Sonia", 32, 1.70f);
        a.armazenaPessoa("Mariano", 33, 1.60f);
        a.armazenaPessoa("Priscilla", 67, 1.70f);
        a.armazenaPessoa("Alfredo", 9, 1.40f);
        a.armazenaPessoa("Igor", 34, 1.70f);

        a.imprimeAgenda();

        a.armazenaPessoa("nome", 18, 1f);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        a.buscaPessoa("Alfredo");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        a.removePessoa("José");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        a.imprimePessoa(4);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        a.imprimeAgenda();

        a.armazenaPessoa("nome", 18, 1f);
    }

}
