package aula11;

import java.util.Random;

public class Netflix {

    private int codID;
    private String nomeFilme;
    private String catFilme;
    private String[] atores;
    private String anoFilme;
    Random r = new Random();

    public Netflix() {
        this.codID = r.nextInt(9999);
        this.nomeFilme = "";
        this.catFilme = "";
        this.atores = new String[10];
        this.anoFilme = "";
    }

    public int getCodID() {
        return this.codID;
    }

    public String[] getAtores() {
        return this.atores;
    }

    public String getAnoFilme() {
        return this.anoFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setAtores(String[] atores) {
        this.atores = atores;
    }

    public void setAnoFilme(String anoFilme) {
        this.anoFilme = anoFilme;
    }

}
