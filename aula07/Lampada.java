package aula07;

public class Lampada {
    
    private int potencia;
    private String tipo;
    private boolean acesa;

    public Lampada(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public void Apagar() {
        System.out.println("Apagando...");
        this.acesa = false;
    }

    public void Acender() {
        System.out.println("Acendendo...");
        this.acesa = true;
    }

    @Override
    public String toString() {
        return "Lâmpada [potência " + potencia + ", tipo " + tipo + ", acesa " + acesa + "]";
    }

}
