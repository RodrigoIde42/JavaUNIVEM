package aula11;

public class Gerente extends Funcionario {

    private int codigoDepartamento;

    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public void almocar(String refeicao) {
        System.out.println("O gerente " + getNome() + " almocou um(a)" + refeicao);
    }
    
}
