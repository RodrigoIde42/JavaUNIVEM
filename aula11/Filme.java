package aula11;

public class Filme {

    private String nomeFilme;
    private String catFilme;

    public Filme(String nomeFilme, String catFilme) {
        this.nomeFilme = nomeFilme;
        this.catFilme = catFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setCatFilme(String catFilme) {
        this.catFilme = catFilme;
    }

    public String getNomeFilme() {
        return this.nomeFilme;
    }

    public String getCatFilme() {
        return this.catFilme;
    }

}
