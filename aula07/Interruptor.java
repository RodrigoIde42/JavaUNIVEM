package aula07;

public class Interruptor {
    
    private Lampada conectada;
    private boolean ligado;

    public Interruptor() {

    }

    public Interruptor(Lampada conectada) {
        this.Conectar(conectada);
    }

    public void Conectar(Lampada l) {
        this.conectada = l;
    }

    public void Ligar() {
        System.out.println("Ligando interruptor");
        if (!this.ligado) {
            this.ligado = true;
            if (conectada != null) {
                conectada.Acender();
            }
        }
    }

    public void Desligar() {
        System.out.println("Desligando interruptor");
        if (this.ligado) {
            this.ligado = false;
            if (conectada != null) {
                conectada.Apagar();
            }
        }
    }
    
    @Override
    public String toString() {
        return "Interruptor [conectada " + conectada + "]";
    }

}
